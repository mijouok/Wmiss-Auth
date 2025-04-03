package com.jinhui.wmissauth.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class R<T> implements Serializable {
    private int statusCode;
    private String message;
    private T data;

    public R(int statusCode) {
        this.statusCode = statusCode;
    }

    public static R ok() {
        return new R<>(200);
    }
    public static <T> R ok(T data) {
        R res = ok();
        res.setData(data);
        return res;
    }
    public static <T> R ok(String message) {
        R res = ok();
        res.setMessage(message);
        return res;
    }

}
