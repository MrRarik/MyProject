package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField text;
    @FXML
    public TextField text1;
    @FXML
    public TextField text2;
    @FXML
    public TextArea area;
    double a = 0, b = 0, c = 0, d = 0;

    public void pressBtn(ActionEvent actionEvent) {
        a = readDoubleFromText1();
        b = readDoubleFromText2();
        c = readDoubleFromText();
        d = (a + b) * (5 * c);
        area.appendText(d + " р");
    }

    private double readDoubleFromText() {
        try {
            return Double.parseDouble(text.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
      }
    private double readDoubleFromText1() {
        try {
            return Double.parseDouble(text1.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
        private double readDoubleFromText2() {
            try {
                return Double.parseDouble(text2.getText());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }