package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        missingNum(array, 10);
    }


    public static int missingNum(int[] array, int v) {
        int total = (v * (v + 1)) / 2;
        int sum = 0;
        for (int index : array) {
            sum += index;
        }
        System.out.println(total - sum);
        return total - sum;
    }
}
