package by.semenovich.sorting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Reader {

    private static final String TAB_REGEX = "\\t";

    public static String[][] read(Path path) throws IOException {
        try (Stream<String> stream = Files.lines(path)) {

            return stream.map(s -> s.split(TAB_REGEX, -1)).toArray(String[][]::new);
        }
    }

}
