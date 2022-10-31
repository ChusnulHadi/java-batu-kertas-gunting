package pbo.projectuas;

import java.io.IOException;
// import java.util.Random;

// import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GamesController {
    // private String[] element = { "paper", "rock", "scissors" };

    @FXML
    Button playButton;
    ImageView mainImage;

    // private String getRandomChoice(String[] choices) {
    // Random rand = new Random();
    // int choice = rand.nextInt(choices.length);
    // return choices[choice];
    // }

    public void buttonHandler() throws IOException {
        // String choice = this.getRandomChoice(element);
        Image image = new Image("paper.png");
        mainImage.setImage(image);
    }
}
