package by.semenovich.sorting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Writer {

    private static final String OUTPUT_FILE = "out.txt";
    private static final String EMPTY = "";
    private static final String SPACE_BETWEEN_COLUMN = "\t";
    private static final String NEW_LINE = "\n";

    public static void write(String[][] rows) throws IOException {
        createFile();
        for (String[] row: rows) {
            writeToFile(String.join(SPACE_BETWEEN_COLUMN, row));
            newLineToFile();
        }
    }

    private static void createFile() throws IOException {
        Files.write(Paths.get(OUTPUT_FILE), EMPTY.getBytes());
    }

    private static void writeToFile(String column) throws IOException {
        Files.write(
                Paths.get(OUTPUT_FILE),
                (column).getBytes(),
                StandardOpenOption.APPEND
        );
    }

    private static void newLineToFile() throws IOException {
        Files.write(Paths.get(OUTPUT_FILE), NEW_LINE.getBytes(), StandardOpenOption.APPEND);
    }

}
