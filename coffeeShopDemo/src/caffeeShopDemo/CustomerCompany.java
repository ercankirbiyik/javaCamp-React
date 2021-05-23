package caffeeShopDemo;

public class CustomerCompany  {
	private int id;
	private String companyName;

	CustomerCompany(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public boolean checkCustomer( Customer customer) {
		
		return false;
	}
	
}