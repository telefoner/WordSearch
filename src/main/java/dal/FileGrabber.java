package dal;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileGrabber {
    public boolean fileSearch(String str){
        InputStream stream = FileGrabber.class.getResourceAsStream("/words.txt");
        try {
            BufferedReader file = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
            String line;
            while ((line = file.readLine()) != null){
                if (line.equalsIgnoreCase(str)){
                    return true;
                }
            }
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        return false;
    }
    public List<String> readAll(){
        List<String> result = new ArrayList<>();
        InputStream stream = FileGrabber.class.getResourceAsStream("/words.txt");
        try (BufferedReader file = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = file.readLine()) != null) {
                result.add(line.trim());
            }
        }
        catch(IOException s){
            System.out.println("An error occured");
            s.printStackTrace();
            }
            return result;
    }

    public int wordCount() {
        InputStream stream = FileGrabber.class.getResourceAsStream("/words.txt");
        int lineCount = 0;
        try (BufferedReader file = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            while (file.readLine() != null) {
                lineCount++;
            }
            return lineCount;
        }
        catch(IOException s){
            System.out.println("An error occured");
            s.printStackTrace();
            return -1;
        }

    }
}

