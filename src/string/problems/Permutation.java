package string.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String w = "BCA";
        System.out.println("String " + w + " Permutations: " + usePermutation(w));
    }

    public static Set<String> usePermutation(String value) {
        Set<String> permutationResult = new HashSet<String>();
        if (value == null) {
            return null;
        } else if (value.length() == 0) {
            permutationResult.add("");
            return permutationResult;
        }

        char firstChar = value.charAt(0);
        String rem = value.substring(1);
        Set<String> words = usePermutation(rem);
        for (String newString : words) {
            for (int i = 0; i <= newString.length(); i++) {
                permutationResult.add(permutationCharAdd(newString, firstChar, i));
            }
        }
        return permutationResult;
    }

    public static String permutationCharAdd(String value, char c, int j) {
        String first = value.substring(0, j);
        String last = value.substring(j);
        return first + c + last;
    }
}
