package dk.mozafaka.wordsearch;

import bll.Logic;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.List;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    Logic logic = new Logic();

    @FXML
    public ListView lstWrdsA;

    @FXML
    public ListView lstWrdsN;

    @FXML
    public ListView lstHistory;

    @FXML
    public Button btnClear;

    @FXML
    public Text txtWrdCount;

    @FXML
    public Text txtSrchRslt;

    @FXML
    public ListView lstAllWrds;

    @FXML
    public TextField txtWrdInput;

    @FXML
    public void onBtnSrch(ActionEvent actionEvent) {
        String buffer = txtWrdInput.getText();
        if (logic.doSearch(buffer)){
            txtSrchRslt.setText("Word " + buffer + " is found!");

        }
        else{
            txtSrchRslt.setText("Word " + buffer + " is not found.");
        }
        lstHistory.setItems(FXCollections.observableArrayList(logic.getSearchHistory()));
    }

    @FXML
    public void onBtnClear(ActionEvent actionEvent) {
        //logic.clearHistory();
    }

    public void initialize(){
        List<String> words = logic.getAllWords();
        List<String> wordsA = logic.getWordsA();
        List<String> wordsN = logic.getWordsN();
        txtWrdCount.setText(Integer.toString(logic.getWordCount()));
        lstAllWrds.setItems(FXCollections.observableArrayList(words));
        lstWrdsA.setItems(FXCollections.observableArrayList(wordsA));
        lstWrdsN.setItems(FXCollections.observableArrayList(wordsN));
    }

}
