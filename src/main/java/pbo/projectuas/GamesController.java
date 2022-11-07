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

    private Boolean isLoop = true;

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
        isLoop = true;
        Timer t = new Timer();
        t.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        String choice = getRandomChoice();
                        myImageView.setImage(new Image(choice + ".png"));
                        if (!isLoop)
                            t.cancel();
                    }
                }, 0, 100);
    }

    // mendapatkan nilai dari ketika user menekan tombol paper
    @FXML
    void getPaperVal(ActionEvent event) {
        isLoop = false;
        int paperInt = 1;
        System.out.println(paperInt);
    }

    // mendapatkan nilai dari ketika user menekan tombol rock
    @FXML
    void getRockVal(ActionEvent event) {
        isLoop = false;
        int rockInt = 2;
        System.out.println(rockInt);
    }

    // mendapatkan nilai dari ketika user menekan tombol scissors
    @FXML
    void getScissorsVal(ActionEvent event) {
        isLoop = false;
        int scissorInt = 3;
        System.out.println(scissorInt);
    }

}
