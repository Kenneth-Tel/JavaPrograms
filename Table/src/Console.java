import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    public int intNumber(String prompt, int Min, int Max) {
        while (true) {
            System.out.print(prompt);
            int tempNumber = scanner.nextInt();
            if (tempNumber > Min && tempNumber < Max) {
                return tempNumber;
            }
            System.out.println("Please provide a number between: " + Min + " and " + Max);
        }
    }

    public int intNumber(String prompt) {
        return intNumber(prompt, 1, 100);
    }

    public void printTable(int[][] table) {
        for (int[] ints : table) {
            System.out.println(" ");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}
