public class Create {


    private int[] array(int lengthOfArray) {
        int[] tempArray = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            tempArray[i] = i + 1;
        }

        return tempArray;
    }

    public int[][] table(int length, int depth) {

        int[][] tempTable = new int[length][depth];

        int[] arrayX = array(length);
        int[] arrayY = array(depth);

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < depth; j++) {
                tempTable[i][j] = arrayX[i] * arrayY[j];
            }
        }

        return tempTable;
    }
}
