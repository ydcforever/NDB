package com.storage;

import org.junit.Test;

import java.io.File;

/**
 * Created by ydc on 2019/9/1.
 */
public class Storage {

    @Test
    public void test() {
        Table table = new Table("YDC");
        Row row = new Row();
        row.addCol(new Column(1, "NAME", String.class, 2));
        table.addRow(row);
    }

    @Test
    public void storage() throws Exception{
        Column column = new Column(1,"C1", String.class, 3);
        Column column2 = new Column(2,"C2", String.class, 2);
        Table table = new Table("YDC");
        table.addCol(column, column2);

        WriteFactory writeFactory = new WriteFactory();

        Row row = new Row();
        row.addCol(table.getColumn(1, "acb"), table.getColumn(2, "b"));
        table.addRow(row);

        Row row2 = new Row();
        row2.addCol(table.getColumn(1, "ap"), table.getColumn(2, "f"));
        table.addRow(row2);


        writeFactory.write(new File("C:\\Users\\T440\\Desktop\\a.txt"), table);
//
//        writeFactory.process("C:\\Users\\T440\\Desktop\\a.txt", table);
//        System.out.println(table.getRows());
    }
}
