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
		// Create a queue
		Queue<String> queue = new LinkedList<>();

		// Add elements to the queue
		queue.add("iphone");
		queue.add("samsung");
		queue.add("huawei");


		System.out.println("Peek at the head of the queue: " + queue.peek());

		System.out.println("Removed element: " + queue.remove());


		System.out.println("Polled element: " + queue.poll());


		System.out.println("Retrieving elements using for each loop:");
		for (String element : queue) {
			System.out.println(element);
		}


		System.out.println("Retrieving elements using while loop with iterator:");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}