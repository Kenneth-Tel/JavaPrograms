import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var galtonboard = new GaltonBoard();

        galtonboard.playGaltonBoard(10);

        System.out.println(galtonboard.getBall());
    }


}