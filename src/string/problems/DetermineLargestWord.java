package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
                System.out.println(wordNLength.keySet().iterator().next()+" "+
                wordNLength.entrySet().stream().findFirst().get().getValue());

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        String [] largestWord = wordGiven.split("\\s");
        for(int i = 0; i < largestWord.length; i++)
        {
            if(largestWord[i].length()>st.length()){
                st = largestWord[i];
            }
        }
        map.put(st.length(),st);

        return map;
    }
}
