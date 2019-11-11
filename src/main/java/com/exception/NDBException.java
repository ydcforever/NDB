package com.exception;


import org.apache.commons.lang3.StringUtils;

public class NDBException extends RuntimeException {

    public String iErrCode = "";

    public String iErrMessage = "";

    public NDBException(String aMessage) {
        super(aMessage);
        this.iErrMessage = aMessage;
    }

    public NDBException(String aCode, String aMessage) {
        super(aMessage);
        this.iErrCode = aCode.trim();
        this.iErrMessage = aMessage;
    }

    public NDBException(Msg msg) {
        this.iErrCode = msg.getCode();
        this.iErrMessage = msg.getDescription();
    }

    public String getCode() {
        return iErrCode;
    }

    public String getMessage() {
        return StringUtils.isBlank(super.getMessage()) ? this.iErrMessage : super.getMessage();
    }

    public String getErrMsg() {
        return StringUtils.isBlank(iErrMessage) ? super.getMessage() : iErrMessage;
    }

    public NDBException(String aCode, String aMessage, String aDetailMessage) {
        super(aMessage.trim());
        iErrCode = aCode.trim();
        iErrMessage = aDetailMessage.trim();
    }

    public NDBException(String iErrCode, String iErrMessage, Throwable cause) {
        super(cause);
        this.iErrCode = iErrCode.trim();
        this.iErrMessage = iErrMessage.trim();
    }

    public NDBException(Throwable cause) {
        super(cause);
    }
}
