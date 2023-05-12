package org.example.parking.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.example.parking.common.protocol.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@ResponseBody
@ControllerAdvice(annotations = {RestController.class})
public class GlobalBusinessExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public Result<String> exceptionHandler(BusinessException e) {
        Integer code = e.getCode();
        String message = e.getMessage();
        log.error("error code: " + code.toString() + " msg: " + message);
        return Result.error(code, message);
    }
}
