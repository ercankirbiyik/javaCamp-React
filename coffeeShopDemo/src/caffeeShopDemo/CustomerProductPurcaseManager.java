package caffeeShopDemo;

public class CustomerProductPurcaseManager {
	
	public CustomerProductPurcase[] createProducts(CustomerProductPurcase[] customerProductPurcases) {
		int i;
		Product product=new Product("",0,false);
		Customer customer=new Customer(-1);
		CustomerCompany customerCompany=new CustomerCompany(-1,"");
		for(i=0;i<customerProductPurcases.length;i++) {
			customerProductPurcases[i]=new CustomerProductPurcase(-1,product,customer,customerCompany);
		}
		return customerProductPurcases;
	}
	public void addCustomerPurchase(CustomerProductPurcase[] customerProductPurcase,Product product,Customer customer,CustomerCompany company) {
		int i=0;
		int customerProductPurcaseId=0;
		for(i=0;i<customerProductPurcase.length;i++) {
			if(customerProductPurcase[i].getId()==-1) {
				customerProductPurcaseId=i;
				break;
			}
		}
		
		CustomerProductPurcase productPurcase=new CustomerProductPurcase(customerProductPurcaseId,product,customer,company);
		productPurcase.setId(customerProductPurcaseId);
		customerProductPurcase[customerProductPurcaseId]=productPurcase;
		Utils.RunGiveStar(new StarInterface[] {new StarNero(),new StarStarbucks()}, product, customer);
		
	}
	public void listProductPurchase(CustomerProductPurcase[] customerProductPurcases) {
		System.out.println("Alinan Ürünler : ");
		for(CustomerProductPurcase customerProductPurcase:customerProductPurcases) {
			if(customerProductPurcase.getId()>-1) {
				System.out.println("         "+customerProductPurcase.getProduct().getId()+" -> "+customerProductPurcase.getProduct().getName()+"( "+customerProductPurcase.getProduct().getPrice()+"TL )");
			}
		}
	}
	public void listCustomerProductPurchase(CustomerProductPurcase[] customerProductPurcases,Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" Aldigi Ürünler : ");
		double totalPurchase=0;
		for(CustomerProductPurcase customerProductPurcase:customerProductPurcases) {
			if(customerProductPurcase.getId()>-1&&customerProductPurcase.getCustomer().getId()==customer.getId()) {
				totalPurchase=totalPurchase+customerProductPurcase.getProduct().getPrice();
				System.out.println("         "+customerProductPurcase.getProduct().getId()+" -> "+customerProductPurcase.getProduct().getName()+"( "+customerProductPurcase.getProduct().getPrice()+"TL )");
			}
		}
		System.out.println("         Toplam Fiyat : "+totalPurchase+"TL");
	}


}