package collectionConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedListConcept {
	public static void main(String[] args) {
		
		LinkedList <String> lol = new LinkedList <String>();
		// add
		lol.add("hello");
		lol.add("Agama");
		lol.add("QA");
		System.out.println("contain of linkedList "+  lol);
		lol.removeFirst();
		System.out.println("contain of linkedList "+  lol);
		lol.removeLast();
		for(int n= 0; n<lol.size();n++) {
			System.out.println(lol.get(n));
			//advance for loop 
		
			for(String str: lol) {
				System.out.println(str);
			}
			// by using iterator 
			Iterator <String > it =lol.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}		
		}
		
	}

}
