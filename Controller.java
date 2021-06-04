package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField field;
    @FXML
    private TextArea area;
    @FXML
    public void clickButton(ActionEvent send) {
         String prikol = area.getText();
         area.setText("Your message: "+ field.getText() + "\n"+prikol);
         field.setText("");
    }
    public void onEnter(ActionEvent ae){
        clickButton(ae);
    }
}
