package com.classio;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFileDemo {
    public static void main(String[] args) {
        // Name of the file
        String fileName = "src/main/resources/output.txt";

        // Reading input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to write to the file (type 'exit' to finish):");

        // Using BufferedWriter and PrintWriter to write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
             PrintWriter printWriter = new PrintWriter(writer)) {

            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                printWriter.println(line);
            }

            System.out.println("Data written to file successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

