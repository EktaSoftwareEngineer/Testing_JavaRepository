package interfaceConcept;

public interface USBank {
	//only method declaration 
	// interface we declare methods its just prototype
	// var value will not be changed 
	// no static method as it is part of object and in Java no static method 
	// no main methods interface
	// we cannot create the object of interface
	// interface is abstract in nature ie we cannot instantiate 
	int min_bal = 100;
	public void credit();
	public void debit();
	public void transferMoney();

}
