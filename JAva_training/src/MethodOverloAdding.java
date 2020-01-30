
public class MethodOverloAdding {

	public static void main(String[] args) {
		MethodOverloAdding mo = new MethodOverloAdding();
		mo.sum();
		mo.sum(10);
		mo.sum(15, 20);
	}
	public void sum() {
		System.out.println("sum method zero input");
		
	}
	public void sum(int i) {
		System.out.println("sum method one input");
		
	}
	public void sum(int r, int t) {
		System.out.println("sum method two input");
		
	}

}
