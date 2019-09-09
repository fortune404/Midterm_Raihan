package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		List<String> dessert = new ArrayList<String>();
		dessert.add("Creme brulee");
		dessert.add("mousse");
		dessert.add("macaroons");
		dessert.add("tarts");

		List<String> savory = new ArrayList<String>();
		savory.add("garlic knots");
		savory.add("pizza");
		savory.add("pasta");
		savory.add("gnocchi");

		Map<String, List<String>> food = new HashMap<String, List<String>>();
		food.put("French Desserts", dessert);
		food.put("Italian Dishes", savory);

		System.out.println("HashMap by using For Each Loop :\n");
		for(Map.Entry<String,List<String>> savoryList : food.entrySet()){
			System.out.println(savoryList.getKey()+" ----> "+savoryList.getValue());
		}
		System.out.println("\n---------------------------------------");
		System.out.println("\n---------------------------------------\n");

		System.out.println("HashMap by using Iterator :\n");
		Iterator<Map.Entry<String,List<String>>> it = food.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,List<String>> pair = it.next();
			System.out.println(pair.getKey()+" --> "+pair.getValue());
		}

	}

}
