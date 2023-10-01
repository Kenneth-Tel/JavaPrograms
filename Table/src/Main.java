public class Main {
    public static void main(String[] args) {

        var create = new Create();
        var console = new Console();

        int length = console.intNumber("How many in the X direction? ");
        int depth = console.intNumber("How many in the Y direction? ");

        int[][] table = create.table(length, depth);

        //Print neatly
        console.printTable(table);
    }
}