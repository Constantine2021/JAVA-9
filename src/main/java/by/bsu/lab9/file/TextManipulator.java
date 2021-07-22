package by.bsu.lab9.file;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextManipulator {
    public static final String INPUT_FILE_PATH = "/Users/kosta/IdeaProjects//Lab9/src/main/" +
            "resources/file.txt";
    public static final String OUTPUT_FILE_PATH = "/Users/kosta/IdeaProjects//Lab9/src/main/" +
            "resources/output.txt";
    public static final String NEW_DIR_PATH = "/Users/kosta/IdeaProjects//Lab9/src/main/" +
                "resources/new_dir";
    private static final Logger logger = LogManager.getLogger(TextManipulator.class.getName());

    public static List<String> readText(){
        List<String> lines = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(INPUT_FILE_PATH))){
            scanner.useDelimiter("\n");
            while(scanner.hasNextLine()){
                lines.add(scanner.next());
            }
            System.out.println("File was successfully read");
            return lines;
        }
        catch (FileNotFoundException e){
            logger.error(e.toString());
        }

        return lines;
    }

    public static void writeText(List<String> lines, String filePath){
        File file = new File(filePath);
        try(FileWriter fileWriter = new FileWriter(file)){
            for (String line: lines){
                fileWriter.write(line);
                fileWriter.write("\n");
            }
        }
        catch (IOException e){
            logger.error(e.toString());
        }
        System.out.println("File was successfully written");
    }

    public static void writeTextAndCreateFolder(List<String> lines){
        File file = new File(NEW_DIR_PATH);
        file.mkdir();
        File fileWriteTo = new File(file.getPath() + "/output.txt");
        writeText(lines, fileWriteTo.getPath());
    }
}
