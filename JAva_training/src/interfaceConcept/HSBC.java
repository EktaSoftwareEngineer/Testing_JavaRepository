package interfaceConcept;

public class HSBC implements USBank {//, INdianBank{ // achieving multiple inheritance
// if class is implementing any interface then is mandatory to override or implement all methods
	@Override
	public void credit() {
		System.out.println("the is HSBC credit Bank ");	
	}
	@Override
	public void debit() {
		System.out.println(" this is HSBC debit ");	
	}
	@Override
	public void transferMoney() {
		System.out.println("this is HSBC tranfer money ");	
	}
	public void educationLoan() {
		System.out.println("this is education loan from HSBC bank ");
	}
	
	public void carloan() {
		System.out.println("this is car loan from HSBC bank ");
		
	}

}
