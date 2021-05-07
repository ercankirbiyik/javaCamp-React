package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthManagerService;
import eCommerceDemo.business.abstracts.UserManagerService;
import eCommerceDemo.business.abstracts.VerificationManagerService;
import eCommerceDemo.core.LoginWithGmailService;
import eCommerceDemo.entities.concretes.User;

public class AuthManager implements AuthManagerService {
	
	private UserManagerService userManagerService;
	private VerificationManagerService verificationManagerService;
	private LoginWithGmailService loginWithGmailService;
	
	

	public AuthManager(UserManagerService userManagerService, VerificationManagerService verificationManagerService,
			LoginWithGmailService loginWithGmailService) {
		
		this.userManagerService = userManagerService;
		this.verificationManagerService = verificationManagerService;
		this.loginWithGmailService = loginWithGmailService;
	}

	@Override
	public boolean login(User user) {
		User userToCheck = this.userManagerService.getByMail(user.getEmail());
		if(userToCheck == null) {
			System.out.println("Invalid user!");
		return false;
		}
		if(!user.getPassword().equals(userToCheck.getPassword())) {
			System.out.println("E-mail address or password is incorrect!");
			return false;
		}
		
		System.out.println("Login has been made.");
		return true;
	}

	@Override
	public boolean register(User user) {
		 if(!(this.userManagerService.checkMailCorrect(user.getEmail()) && this.userManagerService.getByMail(user.getEmail()) == null &&
	                user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 &&
	                user.getPassword().length() >= 6)){
	            System.out.println("Registration failed!!");
	            return false;
	        }
	        System.out.println("Mail is being sent...");
	        if(!verificationManagerService.verificate(user.getEmail())){
	            System.out.println("You must enter the code correctly!");
	            return false;
	        }
	        System.out.println("Your account has been approved and your registration has been made.");
	        this.userManagerService.add(user);
	        return true;

	}

	@Override
	public boolean loginWithGoogle(User user) {
		 if(!loginWithGmailService.login(user.getEmail(),user.getPassword())){
	            System.out.println("Google did not confirm your information.");
	            return false;
	        }
	        if(this.userManagerService.getByMail(user.getEmail()) == null){
	            this.userManagerService.add(user);
	        }
	        System.out.println("Login successful...");
	        return true;
	}

}
