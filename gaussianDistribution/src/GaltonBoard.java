import java.text.DecimalFormat;
import java.util.Random;

public class GaltonBoard<T> {

    private T[] things;

    // Create new random object, so we can determine if -1 or 1 should be added to the ball.
    Random random = new Random();


    private int[] pickCounter;

    public GaltonBoard(T[] array) {
        setThings(array);
        setPickCounter(new int[array.length]);
    }

    public T playGaltonBoard() {

        T[] array = getThings();

        //Since height and cups are proportional.
        int height = array.length - 1;

        int ball = 0;

        // Play "head or tails", then add -1 or 1 depending on "head or tail", for every single height.
        for (int i = 0; i < height; i++) {
            //Pick random number between 0 and 1
            int result = random.nextInt(2);

            // If result is equal to 0, then ball is decremented by 1. Otherwise, ball is incremented by 1.
            ball = (result == 0) ? (ball - 1) : (ball + 1);
        }

        // Translate the ball's number into an index count.
        int translatedBall = (ball + height) / 2;

        this.pickCounter[translatedBall]++;
        return array[translatedBall];
    }


    public void playGaltonBoard(int numberOfPlays) {
        if (numberOfPlays <= 0)
            throw new IllegalArgumentException("Number of Plays cannot be 0 or less");

        for (int i = 0; i < numberOfPlays; i++) {
            this.playGaltonBoard();
        }
    }

    public long chanceOfHitting(T item) {
        T[] array = getThings();

        //Will be using ' Pascals Triangle / Total amount of possible combinations '

        int amountOfThrows = array.length - 1;
        long valueOfPascalTriangle = 0;
        long amountOfThrowsFactorial = Util.factorial(amountOfThrows);



        //Checks if there is more than one item of the same kind, then adds them.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                long indexInArrayFactorial = Util.factorial(i);
                long indexAndThrowsFactorial = Util.factorial((amountOfThrows - i));

                long valueOfIndexInPascalTriangle = amountOfThrowsFactorial / (indexInArrayFactorial * indexAndThrowsFactorial);
                valueOfPascalTriangle += valueOfIndexInPascalTriangle;
            }
        }
        return valueOfPascalTriangle;
    }

    private void setThings(T[] things) {
        this.things = things;
    }

    private void setPickCounter(int[] pickCounter) {
        this.pickCounter = pickCounter;
    }

    public T[] getThings() {
        return things;
    }

    public int[] getPickCounter() {
        return pickCounter;
    }
}
