package day8_DictionariesAndMaps;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
	public static void main(String[] args) {
		Map<String, String> englSpanDictionary = new HashMap<String, String>();
		englSpanDictionary.put("Monday", "Lunes");
		englSpanDictionary.put("Tuesday", "Martes");
		englSpanDictionary.put("Wednesday", "Miercoles");
		englSpanDictionary.put("Thursday", "Jueves");
		englSpanDictionary.put("Friday", "Viernes");

		// Print out all keys
		System.out.println(englSpanDictionary.keySet());
		// Print out all values
		System.out.println(englSpanDictionary.values());
		// Print out Size
		System.out.println("The Size of our Dictionary is " + englSpanDictionary.size());

		// Shopping List
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		shoppingList.put("Ham", true);
		// True in Boolean.True is a property of the Boolean Object
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		// Change some stuff
		shoppingList.remove("Eggs");
		shoppingList.replace("Bread", Boolean.FALSE);
		
		System.out.println(shoppingList.toString());

	}

}
