package dk.mozafaka.wordsearch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
    public void onTxtInput(ActionEvent actionEvent) {

    }

    @FXML
    public void onBtnSrch(ActionEvent actionEvent) {
        doSearch();
    }

    FXML
    public void onBtnClear(ActionEvent actionEvent) {
        clearHistory();
    }
}
