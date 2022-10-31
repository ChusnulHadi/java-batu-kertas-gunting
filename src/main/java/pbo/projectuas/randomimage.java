package pbo.projectuas;

import java.util.Random;

public class randomimage {
    Random rand = new Random();
    private int x;
    private int randomnumber;

    String randomsString(String result) {
        Random rand = new Random();
        this.x = 3;
        this.randomnumber = rand.nextInt(x);
        if (this.randomnumber == 1) {
            result = "semut";
        } else if (this.randomnumber == 2) {
            result = "gajah";
        } else {
            result = "orang";
        }
        return result;
    }
}
