package pbo.projectuas;

import java.io.IOException;
import java.util.Random;

import javafx.fxml.FXML;

public class GamesController {
    private String[] element = { "paper", "rock", "scissors" };

    private String getRandomChoice(String[] choices) {
        Random rand = new Random();
        int choice = rand.nextInt(choices.length);
        return choices[choice];
    }

    @FXML
    private void play() throws IOException {
        String choice = this.getRandomChoice(element);
    }
}
