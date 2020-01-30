package interfaceConcept;

public class TEstBank {

	public static void main(String[] args) {
		
		HSBC hs = new HSBC();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		// dynamic polymorphism 
		// child class object can be referred  by parent interface reference var
		// USBank ub = new USBank(); you cannot instantiate USBank 
		// but you can access by creating object of the HSBC bank
		
		USBank ub = new HSBC();
		ub.credit();
		ub.debit();
		//System.out.println(USBank.min_bal);// try to change the bal it will not change as it is final
	}

}
