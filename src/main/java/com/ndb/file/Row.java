package com.ndb.file;

/**
 * Created by ydc on 2019/5/23.
 */
public class Row {
    private int rowid;

    private int columns;

    /**
     * 被delete后，需要跳过几行查到下个row
     */
    private int skip;

    private int size;

    private byte[] data;
}
