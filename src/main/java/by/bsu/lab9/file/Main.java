package by.bsu.lab9.file;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = TextManipulator.readText();
        LineChanger lineChanger = new LineChanger(lines);
        List<String> changedLines = lineChanger.changeSubsequence("passing before I recognize", "Cakhgfh gfghes");
        TextManipulator.writeText(changedLines, TextManipulator.OUTPUT_FILE_PATH);

        WordsSwapper wordsSwapper = new WordsSwapper(lines);
        List<String> linesWithSwappedWords = wordsSwapper.swapFirstAndLastWords();
        TextManipulator.writeTextAndCreateFolder(linesWithSwappedWords);
    }
}
