package splash.dev.scenes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import splash.dev.Main;

import java.io.IOException;
import java.net.URL;


public class MainScene extends Scene {

    public MainScene() throws IOException { // format works in main scene (static info ; headings,default buttons ; loads sub content such as rock paper ui onto the main scene (=
        super(loadRoot());
    }

    private static Parent loadRoot() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL fxmlUrl = Main.class.getResource("/scene/main.fxml");

        if (fxmlUrl == null) {
            throw new IOException("Could not find main");
        }

        loader.setLocation(fxmlUrl);
        return loader.load();
    }

    public void loadSubContent(String subFxml) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/scene/" + subFxml + ".fxml"));
            Parent subRoot = loader.load();

            Parent root = getRoot();
            Pane contentArea = (Pane) root.lookup("#contentArea"); // ok this is kind of felxable nice

            if (contentArea != null) {
                contentArea.getChildren().clear();
                contentArea.getChildren().add(subRoot);
            } else {
                System.err.println("No contentArea pane found in main.fxml");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
