package sungwoo.chinese_word.utils;

import static sungwoo.chinese_word.exception.ErrorMessage.FILE_LOAD_EXCEPTION;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private static final String FILE_PATH = "src/main/resources/day1";

    private FileParser() {
    }

    public static List<String> loadFile() {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            readLinesFromFile(br, lines);
        } catch (IOException e) {
            throw new IllegalArgumentException(FILE_LOAD_EXCEPTION.getMessage());
        }
        return lines;
    }

    private static void readLinesFromFile(BufferedReader br, List<String> lines) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
    }
}
