package pbo.projectuas;

import java.io.IOException;
// import java.util.Random;

// import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
// import javafx.scene.image.Image;
// import javafx.scene.control.Button;
// import javafx.scene.image.ImageView;

public class GamesController {
    // private String[] element = { "paper", "rock", "scissors" };

    @FXML
    public Button playButton;

    // private String getRandomChoice(String[] choices) {
    // Random rand = new Random();
    // int choice = rand.nextInt(choices.length);
    // return choices[choice];
    // }

    @FXML
    private void buttonHandler() throws IOException {
        playButton.setText("Kotnol");
        // String choice = this.getRandomChoice(element);
        // ImageView mainImage = new ImageView(new
        // Image(getClass().getResourceAsStream("@../../" + choice + ".png")));
    }
}
