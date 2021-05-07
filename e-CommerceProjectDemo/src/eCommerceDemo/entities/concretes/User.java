package eCommerceDemo.entities.concretes;



import eCommerceDemo.entities.abstracts.UserServise;

public class User implements UserServise {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean isVerified;
	
	public User() {}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}


	
	public User(int id, String firstName, String lastName, String email, String password) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		
	}


	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	

	public boolean isVerified() {
		return isVerified;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setVerified(boolean verified) {
	    isVerified = verified;
	}

	
}


