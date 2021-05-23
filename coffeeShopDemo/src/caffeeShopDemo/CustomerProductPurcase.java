package caffeeShopDemo;

public class CustomerProductPurcase {
	
	private int id;
	private Product product;
	private Customer customer;
	private CustomerCompany customerCompany;
	CustomerProductPurcase(int id, Product product, Customer customer, CustomerCompany customerCompany) {
		super();
		this.id = id;
		this.product = product;
		this.customer = customer;
		this.customerCompany = customerCompany;
	}
	CustomerProductPurcase(int id) {
		super();
		this.id = id;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerCompany getCustomerCompany() {
		return customerCompany;
	}
	public void setCustomerCompany(CustomerCompany customerCompany) {
		this.customerCompany = customerCompany;
	}

}
