package bll;

import dal.FileGrabber;
import java.util.List;

public class Logic {
    FileGrabber fs = new FileGrabber();

    public boolean doSearch(String str){
        return fs.fileSearch(str);
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
