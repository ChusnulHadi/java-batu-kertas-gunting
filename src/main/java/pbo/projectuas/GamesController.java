package pbo.projectuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.util.Random;

public class GamesController {
    private String[] element = { "paper", "rock", "scissors" };
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
        System.out.println(choice);
        myImageView.setImage(new Image(choice + ".png"));
    }

}
