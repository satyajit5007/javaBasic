package exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class complietimeerror {
    public static void main(String[] args) {
        try{
            File file = new File("E://file.txt");
            FileReader file1 = new FileReader(file);
        } catch(IOException e) {
            System.out.println("file not found" + e.getMessage());
        }

//        System.out.println("hello world")
//       these the all time of errors
//         String text = 10;

    }
}

