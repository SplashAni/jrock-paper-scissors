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
        loadImage(rockImage, "/img/rock.png");
        loadImage(paperImage, "/img/paper.png");
        loadImage(scissorImage, "/img/scissor.png");
    }

    private void loadImage(ImageView view, String path) {
        Image img = new Image(getClass().getResource(path).toExternalForm());
        view.setImage(img);
        view.setPreserveRatio(true);
        view.setSmooth(true);
    }

}
