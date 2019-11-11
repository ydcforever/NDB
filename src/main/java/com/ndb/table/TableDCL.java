package com.ndb.table;

/**
 * Created by ydc on 2019/5/23.
 */
public abstract class TableDCL {
    public abstract void grant();

    public abstract void commit();

    public abstract void rollback();
}
