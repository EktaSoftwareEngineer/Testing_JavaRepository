
public class CallBYRefCallByValue {
	
	int p;
	int q;
	

	public static void main(String[] args) {
		
		CallBYRefCallByValue obj = new CallBYRefCallByValue();
	int x=10;
	int y=20;
	obj.testSum(x, y);// call by value OR pass by value
	obj.p = 50;
	obj.q = 60;
	obj.swap(obj);
	System.out.println(obj.p);//call by reference
	System.out.println(obj.q);// call by reference

	}

	public int testSum (int a, int b) {
		a=20;
		b= 40;
		int c = a+b;
		return c;
		
	}
	
	public void swap(CallBYRefCallByValue t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q= temp;
		
		
	}
	}
	

