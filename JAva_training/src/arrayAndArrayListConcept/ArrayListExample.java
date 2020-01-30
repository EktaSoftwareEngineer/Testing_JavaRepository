package arrayAndArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();// without generics 
		System.out.println("Initial size of al: " + al.size());
		al.add("C");
		al.add("A");
		al.add("E");
		System.out.println("Initial size of al: " + al.size());
		
		ArrayList a2 = new ArrayList();
		System.out.println("Initial size of al: " + a2.size());
		a2.add(10);
		a2.add(20);
		a2.add("hello");
		int k = a2.size();
		System.out.println("Initial size of al: " + a2.size());
		for(int j= 0; j<k;j++) {
			System.out.println(a2.get(j));
		}
		
		ArrayList <Integer >a3 = new ArrayList<Integer>();// with generic added 
		System.out.println("Initial size of al: " + a3.size());
		a3.add(10);
		a3.add(20);
		// will give error a3.add("hello");
		int k1 = a3.size();
		System.out.println("Initial size of al: " + a3.size());
		for(int j= 0; j<k1;j++) {
			System.out.println(a3.get(j));
		}
		
		ArrayList <String> a31 = new ArrayList<String>();// with generics 
		System.out.println("Initial size of al: " + a31.size());
		a31.add(" Hell010");
		a31.add("Hell020");
		// will give error
		//a31.add(10);
		int k2 = a31.size();
		System.out.println("Initial size of al: " + a31.size());
		for(int j= 0; j<k2;j++) {
			System.out.println(a31.get(j));
		}
		// when you are not sure what type of data is going to be generated
		// ArrayList <E> arr3 = new ArrayList<E>(); Lets take example of employee class
		// 
	/*	Employee e1 = new Employee("Agama", 5,  "QA");
		ArrayList <Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		// iterator to traverse value
		Iterator <Employee> it  = ar4.iterator();
		while(it.hasNext()) {
			Employee emp =it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}*/
		// addAll method 
		
		ArrayList <String> a35 = new ArrayList<String>();// with generics 
		System.out.println("Initial size of a35: " + a35.size());
		a35.add(" Java");
		a35.add("A");
		a35.add("BA");
		ArrayList <String> a36 = new ArrayList<String>();// with generics 
		System.out.println("Initial size of a36: " + a36.size());
		a35.add(" J");
		a35.add("Ab");
		a35.add("BA");
		a35.addAll(a36);
		for(int i = 0;i<a35.size();i++) {
		System.out.println(a35.get(i));
		}
		// use retainAll
		
		a35.retainAll(a36);
		for(int i = 0;i<a35.size();i++) {
		System.out.println(a35.get(i));
		}
	}

}
