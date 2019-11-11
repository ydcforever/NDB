package com.index;


import com.storage.Table;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by ydc on 2019/11/11.
 */
public class Dictionary {
    Map<String, Table> map;

    public Dictionary () {
        map = new TreeMap<String, Table>();
    }

    public void put(Table table) {
        map.put(table.getTableName(), table);
    }

    public Table get(String tableName) {
        return map.get(tableName);
    }
}
