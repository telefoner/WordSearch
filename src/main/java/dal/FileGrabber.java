package dal;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileGrabber {

    private BufferedReader getReader() {
        InputStream stream = FileGrabber.class.getResourceAsStream("/words.txt");
        return new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
    }

    public boolean fileSearch(String str){
        try(BufferedReader file = getReader()) {
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
        try (BufferedReader file = getReader()) {
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
        int lineCount = 0;
        try (BufferedReader file = getReader()) {
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

