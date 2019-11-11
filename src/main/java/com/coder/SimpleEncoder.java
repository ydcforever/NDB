package com.coder;

/**
 * Created by ydc on 2019/11/10.
 */
public class SimpleEncoder implements IEncoder{

    public String strEncode(String hex) {
        return new String(encode(hex));
    }

    @Override
    public byte[] encode(String hex) {
        int len = hex.length() / 2;
        byte[] bytes = new byte[len];
        for(int i = 0; i< len;i++) {
            String s = hex.substring(i * 2, i * 2 + 2);
            bytes[i] = (byte)Integer.parseInt(s, 16);
        }
        return bytes;
    }
}
