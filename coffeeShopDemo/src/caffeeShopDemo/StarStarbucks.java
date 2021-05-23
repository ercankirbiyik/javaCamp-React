package caffeeShopDemo;

public class StarStarbucks implements StarInterface {

	@Override
	
	public void giveStar(Customer customer, Product product) {
		
		if(product.isCofee()) {
			
			customer.setStars(customer.getStars()+1);
		}
	}

}
