
public class StarbucksCustomerManager extends BaseCustomerManager {

	 ICustomerCheckService customerCheckService;

	    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
	        this.customerCheckService = customerCheckService;
	    }

	    @Override
	    public void save(Customer customer) throws Exception {
		        
		    if(customerCheckService.checkIfRealPerson(customer)) {
				System.out.println("Valid person.");
				super.save(customer);
			}
		    else
		    {
		    	throw new Exception("Not a valid person.");
		    }


		}

}
