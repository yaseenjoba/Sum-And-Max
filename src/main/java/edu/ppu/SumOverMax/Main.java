package edu.ppu.SumOverMax;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[]arg) throws IOException {
        FileWriter fileWriter = new FileWriter(new File("test1.txt"));
        fileWriter.write("hello");
        fileWriter.close();
    }
}
