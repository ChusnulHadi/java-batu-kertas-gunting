package pbo.projectuas;

import java.util.Random;

public class RandomImage {
    Random rand = new Random();
    private int x;
    private int randomnumber;

    String randomsString() {
        String result;
        Random rand = new Random();
        this.x = 3;
        this.randomnumber = rand.nextInt(x);
        if (this.randomnumber == 1) {
            result = "scissors";
        } else if (this.randomnumber == 2) {
            result = "rock";
        } else {
            result = "paper";
        }
        return result;
    }
}
