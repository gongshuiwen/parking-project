package org.example.parking.common.exception;

public class BusinessException extends RuntimeException {

    final private Integer code;

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
