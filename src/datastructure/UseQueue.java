package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();

		queue.add("A");
		queue.add("B");
		queue.add("C");

		System.out.println("Peek: " + queue.peek());

		System.out.println("Removed: " + queue.remove());

		System.out.println("Poll: " + queue.poll());

		for (String s : queue) {
			System.out.println(s);
		}

		queue.clear();

		System.out.println("Queue is empty: " + queue.isEmpty());
	}
}


