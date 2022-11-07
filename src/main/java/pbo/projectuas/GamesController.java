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
        RandomImage getImage = new RandomImage();
        return getImage.randomsString();
    }

    // Method menjalankan Play Button
    @FXML
    void buttonHandler(ActionEvent event) {
        new Timer().schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        String choice = getRandomChoice();
                        System.out.println(choice);
                        myImageView.setImage(new Image(choice + ".png"));
                        System.out.println("ping");
                    }
                }, 0, 100);
    }

    // mendapatkan nilai dari ketika user menekan tombol paper
    @FXML
    void getPaperVal(ActionEvent event) {

    }
    // mendapatkan nilai dari ketika user menekan tombol rock

    @FXML
    void getRockVal(ActionEvent event) {

    }
    // mendapatkan nilai dari ketika user menekan tombol scissors

    @FXML
    void getScissorsVal(ActionEvent event) {

    }

}
