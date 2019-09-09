package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> cities=new LinkedList<String>();
		cities.add("AZ");
		cities.add("NJ");
		cities.add("CAL");
		cities.add("FL");

		System.out.println("Number of cities: "+cities.size());

		cities.remove();
		cities.peek();
		cities.poll();



		Iterator it= cities.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(String st1: cities)
		{
			System.out.println("Remove names: "+cities.remove()+" Peek Names: "+cities.peek()+" Poll Names: "+cities.poll());

		}

	}

}
