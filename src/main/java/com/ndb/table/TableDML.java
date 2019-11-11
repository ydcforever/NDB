package com.ndb.table;

import com.ndb.file.Row;

/**
 * Created by ydc on 2019/5/23.
 */
public abstract class TableDML {

    public abstract void update(Row row);

    public abstract void delete(Row row);

    public abstract void insert(Row row);
}
