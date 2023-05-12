package org.example.parking.common;

import lombok.Data;

@Data
public class Result<T> {

    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T obj) {
        Result<T> r = new Result<>();
        r.setCode(1);
        r.setMsg("");
        r.setData(obj);
        return r;
    }

    public static <T> Result<T> error(String message) {
        Result<T> r = new Result<>();
        r.setCode(0);
        r.setMsg(message);
        return r;
    }
}
