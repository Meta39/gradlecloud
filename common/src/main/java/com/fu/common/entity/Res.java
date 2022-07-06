package com.fu.common.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Res<T> {
    private int status;//状态码
    private String error;//错误信息
    private String message;//信息
    private T data;//成功返回的数据

    /**
     * 成功返回
     * @param data 数据
     */
    public Res(T data) {
        this.status = 200;
        this.message = "成功";
        this.data = data;
    }

    /**
     * 500异常
     * @param message 错误信息
     * @return
     */
    public static Res err(String message) {
        Res res = new Res();
        res.setStatus(Status.FAIL.getStatus());
        res.setError(message);
        return res;
    }

    /**
     * Status自定义固定异常
     * @param status 状态码
     * @param error 错误信息
     * @return
     */
    public static Res err(Integer status,String error) {
        Res res = new Res();
        res.setStatus(status);
        res.setError(error);
        return res;
    }

    /**
     * Status自定义固定异常+自定义信息
     * @param status 状态码
     * @param error 错误信息
     * @param message 自定义信息
     * @return
     */
    public static Res err(Integer status,String error,String message) {
        Res res = new Res();
        res.setStatus(status);
        res.setError(error);
        res.setMessage(message);
        return res;
    }
}
