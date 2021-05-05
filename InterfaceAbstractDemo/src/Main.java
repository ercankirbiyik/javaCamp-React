import java.sql.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer realCustomer = new Customer(1, "ERCAN", "KIRBIYIK", new Date(1992), "33742565926");
		Customer fakeCustomer = new Customer(2, "ERCAN", "KIRBIYIK", new Date(1992), "33742565926");
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(realCustomer);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServisAdapter());
		starbucksCustomerManager.save(realCustomer);
		starbucksCustomerManager.save(fakeCustomer);
	}
}
