package interviewJavaPrg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		String name []= {"Aziz","Tony","Karamjeet","Malar","sukwinder","Long","Long"};
		for(int i=0 ;i<name.length;i++) {
			for(int j=i+1; j<name.length;j++) {
				if (name[i].equals(name[j])){
					System.out.println("duplicate element is "+ name[i]);
				}
			}
		}
		System.out.println("***using HashSet******");
		//2 using HashSet. Its part of java collection and it stores unique 
		Set<String> store = new HashSet<String>();
		for(String names : name) {
			if(store.add(names)==false) {
				System.out.println("duplicate element is :" + names);
			}
		}
		System.out.println("using HashMap");
		
		Map <String , Integer> storemap= new HashMap< String, Integer>();
		for(String names : name) {
			Integer count =storemap.get(names);
			if(count ==null) {
				storemap.put(names, 1);
			}else {
				storemap.put(names, ++count);
			}
		}
		Set<Entry<String, Integer>>entrySet =storemap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("the duplicate eleme"+ entry.getKey());
			}
		}
		
	}

}
