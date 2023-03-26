package com.xuan.enmus;

public enum ApiResultEnum {
    REQUST_LIMIT(1, "不要频繁调用同一 api");

    private Integer code;
    private String msg;

    ApiResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
