package pbo.projectuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GamesController {
    private String[] element = { "paper", "rock", "scissors" };
    private Boolean isLoop = false;
    @FXML
    private AnchorPane mainStage;

    @FXML
    private ImageView myImageView;

    @FXML
    private Button playButton;

    private String getRandomChoice(String[] choices) {
        Random rand = new Random();
        int choice = rand.nextInt(choices.length);
        return choices[choice];
    }

    @FXML
    void buttonHandler(ActionEvent event) {
        String choice = this.getRandomChoice(this.element);
        isLoop = !isLoop;
        try {
            imageRender();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void imageRender() throws InterruptedException {
        while (isLoop) {
            String imageUrl = getRandomChoice(element);
            System.out.println("imageUrl");
            myImageView.setImage(new Image(imageUrl + ".png"));
            TimeUnit.MILLISECONDS.sleep(2000);
        }
    }


}
