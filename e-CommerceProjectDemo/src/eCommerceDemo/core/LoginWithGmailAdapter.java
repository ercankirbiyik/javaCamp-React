package eCommerceDemo.core;

import eCommerceDemo.GoogleLogin.LoginWithGmail;

public class LoginWithGmailAdapter implements LoginWithGmailService {

	@Override
	public boolean login(String mail, String password) {
		LoginWithGmail loginWithGmail = new LoginWithGmail();
		return loginWithGmail.login(mail, password);
	}

	

}
