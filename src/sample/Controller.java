package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Ellipse;

public class Controller {

    @FXML
    private Ellipse ellipse;

    @FXML
    private TextField centerXField;
    @FXML
    private TextField centerYField;
    @FXML
    private TextField radiusXField;
    @FXML
    private TextField radiusYField;

    public void initialize() {

        ellipse.setCenterX(300.0f);
        ellipse.setCenterY(250.0f);
        ellipse.setRadiusX(150.0f);
        ellipse.setRadiusY(75.0f);
    }

    @FXML
    public void calculateEllipse() {
        if (!isTextDigit(centerXField.getText()) || !isTextDigit(centerYField.getText()) ||
            !isTextDigit(radiusXField.getText()) || !isTextDigit(radiusYField.getText())) {
            return;
        }

        ellipse.setCenterX(Integer.parseInt(centerXField.getText()));
        ellipse.setCenterY(Integer.parseInt(centerYField.getText()));
        ellipse.setRadiusX(Integer.parseInt(radiusXField.getText()));
        ellipse.setRadiusY(Integer.parseInt(radiusYField.getText()));
    }

    public boolean isTextDigit(String s) {
        return s.matches("\\d+");
    }

}
