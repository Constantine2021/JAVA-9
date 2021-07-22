package by.bsu.lab9.file;

import java.util.ArrayList;
import java.util.List;

public class LineChanger {
    private List<String> lines;

    public LineChanger(List<String> lines){
        this.lines = List.copyOf(lines);
    }

    public List<String> changeSubsequence(String oldSubsequence, String newSubsequence){
        List<String> changedLines = new ArrayList<>();
        for (String line: lines){
            changedLines.add(line.replaceAll(oldSubsequence, newSubsequence));
        }

        return changedLines;
    }
}
