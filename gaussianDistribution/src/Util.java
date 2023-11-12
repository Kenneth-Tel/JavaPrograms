import java.text.DecimalFormat;

public class Util {
    private final static DecimalFormat decimalFormat = new DecimalFormat("#.###");
    public static long factorial(int number) {
        if (number < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");


        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static double toOneHoundrenth(double valueOfPascalTriangle, long amountOfThrows) {
        //Since Math.pow can only return ints, we can safely cast long
        long amountOfCombination = (long) Math.pow(2, amountOfThrows);

        double fractionAbove = (valueOfPascalTriangle * 100);
        return (fractionAbove / amountOfCombination);
    }

}
