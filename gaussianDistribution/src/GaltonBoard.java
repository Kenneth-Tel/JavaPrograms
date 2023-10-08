import java.util.Random;

public class GaltonBoard {

    private int ball = 0;
    private int bias = 0;
    private float chanceOfHitting;

    // Create new random object, so we can determine if -1 or 1 should be added to the ball.
    Random random = new Random();

    public <Thing> Thing playGaltonBoard(Thing[] array) {

        //Since height and cups are proportional.
        int height = array.length - 1;

        int tempBall = 0;

        // Play "head or tails", then add -1 or 1 depending on "head or tail", for every single height.
        for (int i = 0; i < height; i++) {
            //Pick random number between 0 and 1
            int result = random.nextInt(2);

            // If result is equal to 0, then ball is decremented by 1. Otherwise, ball is incremented by 1.
            tempBall = (result == 0) ? (tempBall - 1) : (tempBall + 1);
        }
        setBall(tempBall);

        // Translate the ball's number into an index count.
        int translatedBall = ((this.ball) + height) / 2;

        return array[translatedBall];

    }

    private void setBall(int ball) {
        this.ball = ball;
    }

}
