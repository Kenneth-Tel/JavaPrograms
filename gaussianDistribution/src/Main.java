
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var galtonboard = new GaltonBoard();

        String[] names = {"Destroyer of Worlds!", "Petty Betty" , "Ludwig is gay", "Whisper of Birds", "Makeover Power", "Sludge of Power"};

        int[] numberOfNamesPicked = new int[6];

        //Play GaltonBoard with the provided names, then pick a random name out of that array with gaussian distribution.
        //Then, check which name the GaltonBoard has returned, then increment the int array by 1. Hardcoded int Array, Needs generalisation.
        for (int i = 0; i < 10_000; i++) {
            String name = galtonboard.playGaltonBoard(names);

            //Hardcoded, Needs generalisation
            switch (name) {
                case "Destroyer of Worlds!" -> numberOfNamesPicked[0]++;
                case "Petty Betty" -> numberOfNamesPicked[1]++;
                case "Ludwig is gay" -> numberOfNamesPicked[2]++;
                case "Whisper of Birds" -> numberOfNamesPicked[3]++;
                case "Makeover Power" -> numberOfNamesPicked[4]++;
                case "Sludge of Power" -> numberOfNamesPicked[5]++;
            };
        }

        //Hardcoded, Needs generalisation
        //Prints out how many times the name has been picked when playing each GaltonBoard
        System.out.println("Destroyer of Worlds! " + numberOfNamesPicked[0]);
        System.out.println("Petty Betty          " + numberOfNamesPicked[1]);
        System.out.println("Ludwig is gay        " + numberOfNamesPicked[2]);
        System.out.println("Whisper of Birds     " + numberOfNamesPicked[3]);
        System.out.println("Makeover Power       " + numberOfNamesPicked[4]);
        System.out.println("Sludge of Power      " + numberOfNamesPicked[5]);
    }
}