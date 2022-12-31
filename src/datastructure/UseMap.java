package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, List<String>> listMap = new HashMap<String, List<String>>();


		List<String> list = new ArrayList<String>();
		list.add("DM");
		list.add("FA");
		list.add("AD");


		listMap.put("key1", list);


		list = new ArrayList<String>();
		list.add("SS");
		list.add("DD");
		listMap.put("key2", list);


		for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Values: " + entry.getValue());
		}


		for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Values: " + entry.getValue());
		}


		for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Values: " + entry.getValue());
		}

	}

}