package Practicum_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TextManager {
    private Path path;

    public TextManager(String path) throws Exception {
        this.path = Path.of(path);
    }

    public List<String> getText() throws Exception {
        try{
            return Files.readAllLines(this.path);
        }
        catch (Exception ex){
            throw new Exception("Er is wat fout gegaan tijdens het lezen van de bestand");
        }
    }

    public void writeText(ArrayList<String> textList, boolean append) throws Exception {
        try{
            FileWriter fileWriter =
                    new FileWriter(this.path.toAbsolutePath().toString(), append);

            for (String line : textList) {
                fileWriter.write(line + System.lineSeparator());
            }

            fileWriter.close();
        }
        catch(Exception ex) {
        throw new Exception("Er is wat fout gegaan tijdens het schrijven naar de bestand");
        }

    }
}
