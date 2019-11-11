package com.ndb.table;

import com.ndb.file.Table;

/**
 * Created by ydc on 2019/5/23.
 */
public abstract class TableDDL{

    public abstract void create(Table table);

    public abstract void drop(Table table);

}
