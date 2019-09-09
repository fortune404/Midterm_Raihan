package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        System.out.println(isPalindrome("madam"));
    }

    public static boolean isPalindrome(String v){
        if (v.length() <= 1){
            return true;
        }
        if (v.charAt(0) == v.charAt(v.length()-1)){
            return isPalindrome(v.substring(1,v.length()-1));
        }else {
            return false;
        }
    }
}
