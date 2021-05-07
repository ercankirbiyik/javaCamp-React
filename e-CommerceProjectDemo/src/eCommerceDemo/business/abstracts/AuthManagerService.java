package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface AuthManagerService {
	
	boolean login(User user);
	boolean register(User user);
	boolean loginWithGoogle(User user);

}
