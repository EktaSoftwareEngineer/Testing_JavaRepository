package arrayAndArrayListConcept;

public class ArrayConcept {

	public static void main(String[] args) {
		// Disadv : can have duplicate value and elements
		// maintains insertion order
		// synchronized. Allows access to fetch the element bcoz it stores the values on the basis of indexes
		// The static array is one which the size is defined and dynamic is one when the size is not defined and we can access 
		/* Size is fixed, static array, To overCome from this problem we use collections - dynamic array is -- ArrayList
		It stores only similar data types: To overcome from this problem we use object array*/
		// int arrary 
		int i[] = new int [5];// static array --size fixed 
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		System.out.println(i[2]);
		System.out.println(i[4]);
		System.out.println(i.length);
		// for printing all the data from the array 
		for(int j= 0; j<i.length;j++) {
			System.out.println(i[j]);
			
			// using Iterator
		
		}

	}

}
