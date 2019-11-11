package com.coder;

/**
 * Created by ydc on 2019/11/10.
 */
public interface IDecoder {

    <T> String decode(byte[] bytes);
}
