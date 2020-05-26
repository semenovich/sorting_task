package by.semenovich.sorting;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String... args) throws IOException {

        String[][] rows = Reader.read(Paths.get(args[0]));
        Arrays.sort(rows, new RowComparator());
        Writer.write(rows);
    }

}
