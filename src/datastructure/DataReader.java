package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		String textFile = "D:\\midTerm\\midterm-coding-exam\\src\\data\\self-driving-car";
		Stack<String> stack = new Stack<>();
		LinkedList<String> linkedList = new LinkedList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					stack.push(word);
					linkedList.add(word);
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		System.out.println("Retrieving data from linked list in FIFO order:");
		while (!linkedList.isEmpty()) {
			System.out.println(linkedList.poll());
		}

		System.out.println("Retrieving data from stack in FILO order:");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}