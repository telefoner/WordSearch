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

}
