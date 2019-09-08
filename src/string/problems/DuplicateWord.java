package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        System.out.println(duplicateWords(st));
    }

    public static String duplicateWords(String str){
        String result = "";
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] par = str.split(" ");

        for (String x: par) {
            if (map.get(x) != null){
                map.put(x,map.get(x)+1);
            }else {
                map.put(x,1);
            }
        }

        for (Map.Entry entry: map.entrySet()) {
            result += entry.getKey() +": "+entry.getValue()+", ";
        }
        return result;
    }

}
