package pbo.projectuas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import pbo.projectuas.GamesController;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("games"), 640, 480);
        stage.setTitle("Project UAS");
        stage.setScene(scene);
        stage.show();

        new Timer().schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        int rand = new Random().nextInt(3);
                        GamesController(rand);
                    }
                }, 0, 5000);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return loader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}