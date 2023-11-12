public class Console {


    public static <T> void printGaltonBoard(GaltonBoard<T> galtonBoard) {

        T[] things = galtonBoard.getThings();
        int[] pickCounter = galtonBoard.getPickCounter();

        long amountOfCombination = things.length - 1;
        double chanceOfHitting;
        double formattedChangeOfHitting;


        T longestCharacter = null;
        int longestCharacterName = 0;
        for (T thing: things) {
            if (thing.toString().length() > longestCharacterName) {
                longestCharacterName = thing.toString().length();
                longestCharacter = thing;
            }
        }


        int maxPickCounterWidth = 0;
        for (int counter : pickCounter) {
            int currentWidth = String.valueOf(counter).length();
            if (currentWidth > maxPickCounterWidth) {
                maxPickCounterWidth = currentWidth;
            }
        }

        if (longestCharacter != null) {

            String format = "%-" + (longestCharacterName + 1) + "s %-" + (maxPickCounterWidth + 2) + "d%.3f / 100%n";

            for (int i = 0; i < things.length; i++) {
                chanceOfHitting = galtonBoard.chanceOfHitting(things[i]);
                formattedChangeOfHitting = Util.toOneHoundrenth(chanceOfHitting, amountOfCombination);

                System.out.printf(format, things[i], pickCounter[i], formattedChangeOfHitting);
            }  
        } else {
            System.out.println("No characters found.");
        }



    }

}
