package com.exception;

public enum Msg {

    COLUMN_EXCEEDED_LENGTH("0x_04001", "Column value exceeded length");

    Msg(String code, String description) {
        this.code = code;
        this.description = description;
    }

    private String code;

    private String description;

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
