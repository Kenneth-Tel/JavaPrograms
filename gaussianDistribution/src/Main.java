
public class Main {
    public static void main(String[] args) {

        String[] names = {"Joe", "Coin", "Letter", "Letter", "Lost", "Homemade", "Avenger", "Animal"};

        var galtonboard = new GaltonBoard<>(names);

        galtonboard.playGaltonBoard(10_000);

        Console.printGaltonBoard(galtonboard);

    }
}