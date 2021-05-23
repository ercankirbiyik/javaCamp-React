package caffeeShopDemo;

public class neroCustomerCompany extends CustomerCompany implements CustomerCompanyInterface,StarInterface {

	neroCustomerCompany(int id, String companyName) {
		super(id, companyName);
		
	}

	@Override
	
	public boolean checkCustomer( Customer customer) {
		
		return true;
	}

	@Override
	
	public void giveStar(Customer customer, Product product) {
		
		
	}

}