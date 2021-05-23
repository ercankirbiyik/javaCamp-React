package caffeeShopDemo;

public class starbucksCustomerCompany extends CustomerCompany implements CustomerCompanyInterface,StarInterface {

	starbucksCustomerCompany(int id, String companyName) {
		super(id, companyName);
		
	}

	
	@Override
	
	public boolean checkCustomer(Customer customer) {
		
		if(customer.getDayOfBirth()!=""&&customer.getFirstName()!=""&&customer.getLastName()!=""&&customer.getNationaltyId().length()==11) 
		{
		return true;
		}
		else return false;
	}


	@Override
	
	public void giveStar(Customer customer, Product product) {
		
		if(product.isCofee()) {
			customer.setStars(customer.getStars()+1);
		}
	}

}