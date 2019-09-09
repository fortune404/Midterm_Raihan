package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println(recursionFac(5));
        System.out.println(factorial(5));
    }

    public static int recursionFac(int a){
        if(a == 0){
            return 1;
        }
        return a * recursionFac(a-1);
    }

    public static int factorial(int b){
        int total = b;
        for (int i = b-1; i >=1;i--){
            total = total*i;
        }
        return total;
    }
}
