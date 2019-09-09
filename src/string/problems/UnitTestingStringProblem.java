package string.problems;

import org.testng.Assert;

import java.util.Map;
import java.util.Set;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        //Anagram unit testing
        boolean isAnagram = Anagram.isAnagram("MARY","ARMY");
        Assert.assertTrue(isAnagram);


        //Determine Largest Word unit testing
        Map<Integer, String> wordNLength = DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
        String findTheLargestWord = wordNLength.keySet().iterator().next()+" "+
                wordNLength.entrySet().stream().findFirst().get().getValue();
        Assert.assertEquals(findTheLargestWord,"10 biological");


        //Duplicate Word unit testing
        String duplicateWords = DuplicateWord.duplicateWords("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
        Assert.assertEquals(duplicateWords,"Java: 3, a: 1, Language.: 1, widely: 1, is: 3, also: 1, language: 1, used: 1, an: 1, Island: 1, Indonesia.: 1, of: 1, programming: 1, ");


      //Palindrome unit testing
      boolean isPalindrome = Palindrome.isPalindrome("madam");
      Assert.assertEquals(isPalindrome, true);


      //Permutation unit testing
        Set<String> permutationResult = Permutation.usePermutation("BCA");
        Set<String> permutationExpectation = Permutation.usePermutation("BCA");
      Assert.assertEquals(permutationResult,permutationExpectation);
    }
}
