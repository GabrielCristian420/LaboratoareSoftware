package ro.ulbs.proiectaresoftware.lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Path path = Paths.get("in.txt");
        Path path2 = Paths.get("out.txt");

        try {
            String line = new String(Files.readAllBytes(path));
            List<String> allLinesInMemory = Arrays.asList(line.split("\r?\n"));
            List<String> liniiPentruOut = new ArrayList<>();

            for (String s : allLinesInMemory) {
                String linienoua = s + "\n\n";
                System.out.print(linienoua);
                liniiPentruOut.add(linienoua);
            }

            for (String s : allLinesInMemory) {
                String linienoua = s.replace(". ", ".\n") + "\n";
                System.out.print(linienoua);
                liniiPentruOut.add(linienoua);
            }

            Files.write(path2, liniiPentruOut);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
