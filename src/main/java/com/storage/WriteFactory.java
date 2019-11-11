package com.storage;

import com.coder.SimpleDecoder;
import com.coder.SimpleEncoder;

import java.io.*;
import java.util.List;
import java.util.Map;

import static com.constant.Constants.*;
/**
 * Created by ydc on 2019/9/1.
 */
public class WriteFactory extends FileProcess<Table>{

    private static final SimpleDecoder decoder = new SimpleDecoder();

    private static final SimpleEncoder encoder = new SimpleEncoder();

    public void write(File file, Table table) {
        FileWriter fos = null;
        try {
            fos = new FileWriter(file);
            for(Row row : table.getRows()) {
                write(fos, row);
                fos.write(LINE_SEPARATOR);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void write(FileWriter fos, Row row) throws Exception {
        for(Map.Entry<String, Column> entry : row.getCols().entrySet()) {
            write(fos, entry.getValue());
        }
        for(Map.Entry<String, Column> entry : row.getVarCols().entrySet()) {
            write(fos, entry.getValue());
        }
    }

    public void write(FileWriter fos, Column column) throws Exception {
        String c = column.getValue();
        String ss = decoder.decode(c);
        fos.write(ss);
    }

    @Override
    protected void handle(String line, int lineNo, String fileName, Table table) throws Exception {
        Row row = new Row();
        List<Column> cols = table.getCols();
        int start = 0;
        for(Column col : cols) {
            String s = line.substring(start, start + col.len * 2);
            String c = encoder.strEncode(s);
            col.setValue(c);
            row.addCol(col);
            start += col.len * 2;
        }
        table.addRow(row);
    }
}
