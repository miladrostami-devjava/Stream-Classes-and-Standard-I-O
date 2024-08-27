package com.classio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {
    public static void main(String[] args) {
        // Name of the file to be read
        String fileName = "src/main/resources/output.txt";

        // Reading data from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of the file:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

