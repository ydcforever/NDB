package com.coder;

/**
 * Created by ydc on 2019/11/10.
 */
public class SimpleDecoder implements IDecoder {

    public String decode(String s) {
        byte[] bytes = s.getBytes();
        return decode(bytes);
    }

    @Override
    public String decode(byte[] bytes) {
        StringBuilder sb = new StringBuilder("");
        for(byte b : bytes) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }
}
