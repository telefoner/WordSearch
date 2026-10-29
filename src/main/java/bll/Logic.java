package bll;

import java.io.File;

import dal.FileGrabber;
import dk.mozafaka.wordsearch.HelloController;

public class Logic {

    public void doSearch(String str){
        FileGrabber fs = new FileGrabber();
        fs.fileSearch(str);
        //if (buffer == fs.fileSearch(buffer))
    }

}
