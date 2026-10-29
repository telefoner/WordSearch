package dal;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FileGrabber {

    public void fileSearch(String str){
        try {
            BufferedReader file = new BufferedReader(new InputStreamReader(FileGrabber.class.getResourceAsStream("/words.txt"), StandardCharsets.UTF_8));
            String line;
            while ((line = file.readLine()) != null){
                System.out.println(line);
            }
            file.close();
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
