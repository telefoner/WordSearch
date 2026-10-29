package dk.mozafaka.wordsearch;

import bll.Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

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
        Logic logic = new Logic();
        String buffer = txtWrdInput.getText();
        logic.doSearch(buffer);
        if (logic.doSearch(buffer)){
            txtSrchRslt.setText("Word " + buffer + " is found!");
        }
        else{
            txtSrchRslt.setText("Word " + buffer + " is not found.");
        }
    }

    @FXML
    public void onBtnClear(ActionEvent actionEvent) {
        //logic.clearHistory();
    }

}
