package pbo.projectuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import java.util.Timer;
import java.util.TimerTask;
// import java.util.Random;

public class GamesController {

    private Boolean isLoop = true;
    private int userChoice;
    private int comp;

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

    @FXML
    private Label notif;

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
                        if (!isLoop) {
                            t.cancel();
                        } else {
                            String choice = getRandomChoice();
                            if (choice == "paper") {
                                comp = 1;
                                // System.out.println(comp);
                            } else if (choice == "rock") {
                                comp = 2;
                                // System.out.println(comp);
                            } else {
                                comp = 3;
                                // System.out.println(comp);
                            }
                            System.out.println(choice);
                            myImageView.setImage(new Image(choice + ".png"));
                        }
                    }
                }, 0, 100);
    }

    // mendapatkan nilai dari ketika user menekan tombol paper
    @FXML
    void getPaperVal(ActionEvent event) {
        isLoop = false;
        int paperInt = 1;
        this.userChoice = paperInt;
        System.out.println(this.userChoice);
        checkWinner();
    }

    // mendapatkan nilai dari ketika user menekan tombol rock
    @FXML
    void getRockVal(ActionEvent event) {
        isLoop = false;
        int rockInt = 2;
        this.userChoice = rockInt;
        System.out.println(this.userChoice);
        checkWinner();
    }

    // mendapatkan nilai dari ketika user menekan tombol scissors
    @FXML
    void getScissorsVal(ActionEvent event) {
        isLoop = false;
        int scissorInt = 3;
        this.userChoice = scissorInt;
        System.out.println(this.userChoice);
        checkWinner();
    }

    // set winner
    void checkWinner() {
        // 1. paper
        // 2. rock
        // 3. scissor
        if (this.comp == 1) {
            if (this.userChoice == 1) {
                notif.setText("Seri");
            } else if (this.userChoice == 2) {
                notif.setText("Kalah");
            } else {
                notif.setText("Menang");
            }
        } else if (this.comp == 2) {
            if (this.userChoice == 1) {
                notif.setText("Menang");
            } else if (this.userChoice == 2) {
                notif.setText("Seri");
            } else {
                notif.setText("Kalah");
            }
        } else {
            if (this.userChoice == 1) {
                notif.setText("Kalah");
            } else if (this.userChoice == 2) {
                notif.setText("Menang");
            } else {
                notif.setText("Seri");
            }
        }
    }
}
