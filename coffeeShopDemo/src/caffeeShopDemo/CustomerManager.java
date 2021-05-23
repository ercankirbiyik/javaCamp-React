package caffeeShopDemo;

import java.util.Date;

public class CustomerManager {
	
	public Customer[] createCustomers(Customer[] customers) {
		int i;
		for(i=0;i<100;i++) {
			customers[i]=new Customer(new CustomerCompany[]{}, "aaa", "","","");
		}
		return customers;
	}
	public boolean addCustomer(Customer[] customers, CustomerCompany[] customerCompanys, String firstName, String lastName, String dayOfBirth,
			String nationaltyId) {
		int i=0;
		int customerId=0;
		for(i=0;i<customers.length;i++) {
			if(customers[i].getId()==-1) {
				customerId=i;
				break;
			}
		}
		
		Customer customer=new Customer(customerCompanys,firstName,lastName,dayOfBirth,nationaltyId);
		boolean checkCustomer=true;
		for(CustomerCompany customerCompany:customerCompanys) {
			if(customerCompany.checkCustomer(customer)==false) checkCustomer=false;
		}
		if(checkCustomer==false) {
			customers[customerId].setId(-1);
		}
		else {
			customer.setId(customerId);
			customers[customerId]=customer;
		}
		return checkCustomer;
	}
	public void listCustomers(Customer[] customers) {
		for(Customer customer:customers) {
			if(customer.getId()>-1) {
				System.out.println("Müsteri : "  +customer.getId());
				System.out.println("      Isim : "+customer.getFirstName()+" "+customer.getLastName());
				System.out.println("      Üyelikler : ");
				for(CustomerCompany customerCompany:customer.getCustomerCompany()) {
				System.out.println("                  "+customerCompany.getCompanyName());
					
				}
			}
		}
	}
	public void listStars(Customer[] customers) {
		System.out.println("Yildizli Müsteriler : ");
		String star="";
		int i;
		for(Customer customer:customers) {
			if(customer.getId()>-1) {
				if(customer.getStars()>0) {
					star="";
					for(i=0;i<customer.getStars();i++) star=star+" * ";
					
				System.out.println("    Isim :"+customer.getFirstName()+" "+customer.getLastName()+" ( "+star+" ) ");
				
				}
			}
		}
	}

}
