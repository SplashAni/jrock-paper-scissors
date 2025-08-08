package splash.dev.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    public ImageView rockImage;

    @FXML
    public ImageView paperImage;

    @FXML
    public ImageView scissorImage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Load images from resources folder
        rockImage.setImage(new Image(getClass().getResource("/img/rock.png").toExternalForm()));
        paperImage.setImage(new Image(getClass().getResource("/img/paper.png").toExternalForm()));
        scissorImage.setImage(new Image(getClass().getResource("/img/scissor.png").toExternalForm()));
    }
}
