package splash.dev;

import javafx.application.Application;
import javafx.stage.Stage;
import splash.dev.scenes.MainScene;

public class Main extends Application {
    public static MainScene mainScene;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        mainScene = new MainScene();

        stage.setScene(mainScene);
        mainScene.loadSubContent("game");
        stage.setTitle("heloo");
        stage.show();
    }
}
