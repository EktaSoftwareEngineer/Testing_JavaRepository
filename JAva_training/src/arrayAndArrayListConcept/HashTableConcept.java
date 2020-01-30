package arrayAndArrayListConcept;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("A", "Hello");
		h.put("key", "Agama");
		h.put("b", "Java");
		h.put("c", "Scholars");
		System.out.println(h.get("A"));
		// by defining the input variable
		Hashtable <Integer, String>h1 = new Hashtable<Integer, String>();
		h1.put(5, "Vvalue");
		System.out.println(h1.get(5));
		Hashtable <String, String>h2 = new Hashtable<String, String>();
		h1.put(5, "Vvalue");
		//For()

	}

}
