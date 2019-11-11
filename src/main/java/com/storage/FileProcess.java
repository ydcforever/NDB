package com.storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public abstract class FileProcess<T> {

    private static final Logger LOG = LoggerFactory.getLogger(FileProcess.class);

    private static final int BUFFER_SIZE = 64 * 1024;

    public void process(String filePath, T global) throws Exception{
        File file = new File(filePath);
        process(file, global);
    }

    /**
     *
     * @param file
     * @param global
     * @throws Exception
     */
    public void process(File file, T global) throws Exception{
        process(file, global, 0);
    }

    /**
     *
     * @param file
     * @param global optional global variable
     * @param interruptLineNo continue when process had interrupt
     * @throws Exception
     */
    public void process(File file, T global, int interruptLineNo) throws Exception{
        String line;
        int lineNo = 1;
        FileInputStream inputStream = null;
        BufferedReader bufferedReader = null;
        try {
            String fileName = file.getName();
            inputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream), BUFFER_SIZE);
            LOG.info("------------------Begin to process file [{}] ", fileName);
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    if (lineNo >= interruptLineNo) {
                        handle(line, lineNo, fileName, global);
                    }
                    lineNo++;
                } catch (Exception e) {
                    LOG.error("the [{}] at {} line parse failure!", fileName, lineNo);
                    throw new Exception("line parse failure!");
                }
            }
            LOG.info("------------------Complete process file [{}]", fileName);
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            releaseIOResource(inputStream, bufferedReader);
        }
    }

    /**
     * every line handle
     *
     * @param line
     * @param lineNo start from 1
     * @param fileName
     * @param global    optional global variable
     */
    protected abstract void handle(String line, int lineNo, String fileName, T global) throws Exception;

    private void releaseIOResource(FileInputStream inputStream, BufferedReader bufferedReader) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception ignored) {
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Exception ignored) {
            }
        }
    }
}
