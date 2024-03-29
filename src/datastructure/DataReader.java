package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";



		FileReader fr= null;
		BufferedReader br = null;


		try {
			fr = new FileReader(textFile);
			System.out.println("FileReader find the following path: " + textFile + "\n");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("We couldn't find the file");
		}
		String data = "";
		String store = "";
		try {
			br = new BufferedReader(fr);
			while ((data = br.readLine()) != null) {
				store += data;
				System.out.println(store);
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("We couldn't find the file");
		} finally {
			if (fr != null) {
				fr = null;
			}
			if (br != null) {
				br = null;
			}
		}
		String[] storeArray = store.split(" ");
		List<String> storeList = new LinkedList<String>();
		Stack<String> storeStack = new Stack<String>();

		for (String element : storeArray) {
			storeList.add(element);
			storeStack.push(element);
		}
		System.out.println("\nLinkedList FIFO:");
		Iterator<String> itr = storeList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\n\nStack FILO:");
//
		while (!storeStack.isEmpty()) {
			System.out.print(storeStack.pop() + " ");
		}

		System.out.println(storeStack.push("\n\nHello!"));  //Pushes an item onto the top of this stack.
		System.out.println(storeStack.search("right"));      //Returns the 1-based position where an object is

		System.out.println(storeStack.peek());                // Looks at the object at the top of this stack without


		System.out.println(storeStack.empty());



	}

}
