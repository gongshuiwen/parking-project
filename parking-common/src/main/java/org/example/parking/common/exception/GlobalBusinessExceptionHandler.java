package org.example.parking.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.example.parking.common.protocol.Result;
import org.springframework.stereotype.Controller;
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
        log.error(e.getCode() + ": " + e.getMessage());
        return Result.error(e.getCode(), e.getMessage());
    }
}
