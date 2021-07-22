package by.bsu.lab9.file;

import java.util.*;

public class WordsSwapper {
    private List<String> lines;

    public WordsSwapper(List<String> lines){
        this.lines = List.copyOf(lines);
    }

    public List<String> swapFirstAndLastWords(){
        List<String> linesWithSwappedWords = new ArrayList<>();
        for (String line: lines){
            List<String> words = Arrays.asList(line.split("\\s+"));
            Collections.swap(words, 0, words.size() - 1);
            linesWithSwappedWords.add(String.join(" ", words));
        }
        return linesWithSwappedWords;
    }
}
