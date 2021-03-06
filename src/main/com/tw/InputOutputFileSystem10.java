package com.tw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputOutputFileSystem10 {
    public static void main(String[] args) {
        String fileName = "./.idea/ThoughtWorks-online-training-homeworks.iml";
        InputStream fins = null;
        try {
            fins = new FileInputStream(fileName);
            byte fileContent[] = new byte[2 * 1024];
            int readCount = 0;
            while ((readCount = fins.read(fileContent)) > 0) {
                System.out.println(new String(fileContent, 0, readCount - 1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fins != null) fins.close();
            } catch (Exception ex) {

            }
        }
    }
}
