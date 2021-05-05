package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
    
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}

	//loosly(gevþek) - tightly(katý) coupled(baðlý)
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: " + customer.getFirstName());
		
		  Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	
	
	void delete(Customer customer) {
		System.out.println("Müþteri silindi: " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());

		
	}
	
}
