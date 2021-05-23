package caffeeShopDemo;

import java.util.Date;

public class Customer {
	private int id;
	private CustomerCompany[] customerCompanys;
	private String firstName;
	private String lastName;
	private String dayOfBirth;
	private String nationaltyId;
	private int stars;
	 Customer( CustomerCompany[] customerCompanys, String firstName, String lastName, String dayOfBirth,
			String nationaltyId) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dayOfBirth = dayOfBirth;
		this.nationaltyId = nationaltyId;
		this.stars=0;
		this.customerCompanys=customerCompanys;
		this.id=-1;
	}
	 Customer(int id) {
			this.id = id;
		}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CustomerCompany[] getCustomerCompany() {
		return customerCompanys;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public String getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	public CustomerCompany[] getCustomerCompanys() {
		return customerCompanys;
	}
	public void setCustomerCompanys(CustomerCompany[] customerCompanys) {
		this.customerCompanys = customerCompanys;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
}
