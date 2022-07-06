package com.fu.common.entity;

public enum Status {
    FAIL(5000,"失败"),
    NULL_POINTER_EXCEPTION(5001,"空指针异常！"),
    NOT_LOGIN(5002,"token已过期或不存在，请重新登录！"),
    MISSING_SERVLET_REQUEST_PARAMETER_EXCEPTION(5003,"缺少请求参数"),
    BIND_EXCEPTION(5004,"参数校验异常"),
    MYBATIS_SYSTEM_EXCEPTION(5005,"数据库异常（有可能是连接不上数据库）"),
    ILLEGAL_REQUEST(5006,"非法请求！"),
    ;

    private int status;
    private String error;

    Status(int status, String error) {
        this.status = status;
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
