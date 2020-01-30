
public class GlobalVsLocalVariable {
	
	// global Variable 
	String name ="Agama";
	 int age = 25; 

	public static void main(String[] args) {
		
		int s= 10;// local variable for main method
		System.out.println(s);
		
		 GlobalVsLocalVariable gb = new  GlobalVsLocalVariable();
		 System.out.println(gb.age);
		 
	}
	
	public void sum() {
		int s=3;// local to sum method 
		int j= 4;
		//int k= s+ j;
		//System.out.println(age);
	}
	

}
