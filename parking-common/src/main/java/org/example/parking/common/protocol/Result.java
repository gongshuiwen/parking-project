package org.example.parking.common.protocol;

import lombok.Data;
import org.example.parking.common.utils.ApplicationContextUtils;

@Data
public class Result<T>{

    private String service;
    private Integer code;
    private String msg;
    private T data;

    private Result() {
        this.service = ApplicationContextUtils.getApplicationName();
    }

    public static <T> Result<T> success(T obj) {
        Result<T> r = new Result<>();
        r.setCode(0);
        r.setMsg("OK");
        r.setData(obj);
        return r;
    }

    public static <T> Result<T> error(Integer code, String message) {
        Result<T> r = new Result<>();
        r.setCode(code);
        r.setMsg(message);
        return r;
    }
}
