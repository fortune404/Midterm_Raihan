package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

            int rows = 6;
            for (int i = 1; i<=rows; i++)                //rows
            {
            for (int k = 1; k <=rows-i; k++)             //spaces
            {
                System.out.print(" ");
            }

            for (int j = 1; j<= i; j++)                  //stars
            {
                System.out.print("* ");
            }
            System.out.println();
            }


        }
  }
