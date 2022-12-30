package datastructure;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> uber = new ArrayList<>();


		uber.add("X");
		uber.add("XL");
		uber.add("Black");


		System.out.println("First element: " + uber.get(0));


		uber.remove(1);


		System.out.println("Elements in the ArrayList:");
		for (String color : uber) {
			System.out.println(color);
		}


		System.out.println("Elements in the ArrayList (iterator):");
		for (int i = 0; i < uber.size(); i++) {
			System.out.println(uber.get(i));
		}

	}

}
