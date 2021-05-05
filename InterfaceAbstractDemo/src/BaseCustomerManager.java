
public class BaseCustomerManager implements ICustomerService {
	
	 @Override
	
	public void save(Customer customer) throws Exception {
		
		System.out.println(customer.getFirstName() + ": saved to database");
		 
		 throw new Exception("Not a valid person");
	 
	}

}
