package caffeeShopDemo;

public class Utils {
	
	public static boolean checkCustomer(CustomerCompany[] customerCompanys,Customer customer) {
		boolean customerControl=true;
		for(CustomerCompany customerCompany:customerCompanys) {
			if(customerCompany.checkCustomer(customer)==false) customerControl=false;
		}
		return customerControl;

	}
	public static void RunGiveStar(StarInterface[] starinterfaces,Product product,Customer customer) {
		for(StarInterface starinterface:starinterfaces) {
			starinterface.giveStar(customer,product);
		}

	}

}
