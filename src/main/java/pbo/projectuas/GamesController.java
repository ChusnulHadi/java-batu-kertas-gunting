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

    @FXML
    private Button paperButton;

    @FXML
    private Button rockButton;

    @FXML
    private Button scissorsButton;

    private String getRandomChoice() {
        // Random rand = new Random();
        // int choice = rand.nextInt(choices.length);
        // return choices[choice];
        RandomImage getImage = new RandomImage();
        return getImage.randomsString();
    }

    @FXML
    void buttonHandler(ActionEvent event) {
        isLoop = !isLoop;
        try {
            // imageRender();
            // while (isLoop) {
            String choice = this.getRandomChoice();
            myImageView.setImage(new Image(choice + ".png"));
            System.out.println(choice);
            TimeUnit.MILLISECONDS.sleep(2000);

            // }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // void imageRender() throws InterruptedException {
    // // int maximumTime = 5000;
    // }

}
