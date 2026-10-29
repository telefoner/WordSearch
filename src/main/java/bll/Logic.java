package bll;

import java.io.File;

import dal.FileGrabber;
import dk.mozafaka.wordsearch.HelloController;

public class Logic {

    public boolean doSearch(String str){
        FileGrabber fs = new FileGrabber();
        return fs.fileSearch(str);
    }

}
