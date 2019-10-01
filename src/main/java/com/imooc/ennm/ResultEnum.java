package com.imooc.ennm;

public enum ResultEnum {
    UNKNOW_ERROR(-1, "未知錯誤"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(100, "你可能還在上小學"),
    MIDDLE_SCHOOL(101, "中學");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
