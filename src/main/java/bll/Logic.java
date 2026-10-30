package bll;

import dal.FileGrabber;
import java.util.List;
import java.util.ArrayList;


public class Logic {
    FileGrabber fs = new FileGrabber();
    List<String> history = new ArrayList<>();
    public boolean doSearch(String str){
        boolean found = fs.fileSearch(str);
        if (found)
            history.add("Word " + str + " is found!");
        else
            history.add("Word " + str + " is not found.");
        return found;
    }

    public List<String> getSearchHistory() {
        return history;
    }

    public List<String> getAllWords(){
        return fs.readAll();
    }

    public int getWordCount() {
        return fs.wordCount();
    }

    public List<String> getWordsA(){
        return fs.readA();
    }

    public List<String> getWordsN(){
        return fs.readN();
    }

}
