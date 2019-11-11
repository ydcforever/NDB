package com.ndb.file;

/**
 * Created by ydc on 2019/5/23.
 */
public abstract class DBFile {

    /**
     * 获取数据
     * @return
     */
    public abstract byte[] Data();

    /**
     * 置为脏页
     */
    public abstract void Dirty();

    /**
     * 释放该页
     */
    public abstract void Release();

    /**
     * 加锁
     */
    public abstract void Lock();

    /**
     * 释放锁
     */
    public abstract void Unlock();
}
