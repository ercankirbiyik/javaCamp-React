package eCommerceDemo.GoogleLogin;

public class Gmail {
	private String firstName;
	private String lastName;
	private String mail;
	private String password;
	
	
	public Gmail(String firstName, String lastName, String mail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getMail() {
		return mail;
	}


	public String getPassword() {
		return password;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
