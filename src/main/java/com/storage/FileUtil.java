package com.storage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ydc on 2019/6/9.
 */
public class FileUtil {

    public static List<String> getFilePath(String filePath, String eigenvalue) {
        List<String> list = new ArrayList<String>();
        File f = new File(filePath);
        if (f.isDirectory()) {
            String[] fileList = f.list();
            for (String name : fileList) {
                if (eigenvalue.trim().equals("")) {
                    list.add(filePath + "\\" + name);
                } else {
                    if (name.startsWith(eigenvalue))
                        list.add(filePath + "\\" + name);
                }
            }
        } else
            list.add(filePath);
        return list;
    }

    public static String readFile(String filePath) {
        Reader reader = null;
        File file;
        String fileText = "";
        try {
            file = new File(filePath);
            reader = new InputStreamReader(new FileInputStream(file));
            int tempChar;
            while ((tempChar = reader.read()) != -1) {
                fileText += (char) tempChar;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            releaseIOResource(reader);
        }
        return fileText;
    }

    private static void releaseIOResource(Reader reader) {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String filePath, String content) {
        File file = new File(filePath);
        FileWriter writer;
        try {
            writer = new FileWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String filePath, byte[] bytes) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath);
            fos.write(bytes);
        } catch (IOException e) {
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
}

