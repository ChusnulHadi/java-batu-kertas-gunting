package pbo.projectuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.util.Timer;
import java.util.TimerTask;
// import java.util.Random;

public class GamesController {
    private String[] element = { "paper", "rock", "scissors" };
    // private Boolean isLoop = false;
    // private int choice;

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
        // isLoop = !isLoop;
        String choice = this.getRandomChoice();
        System.out.println(choice);
        new Timer().schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        myImageView.setImage(new Image(choice + ".png"));
                        System.out.println("ping");
                    }
                }, 0, 2000);
    }

}
