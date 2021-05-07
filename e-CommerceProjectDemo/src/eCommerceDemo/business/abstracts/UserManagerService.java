package eCommerceDemo.business.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserManagerService {
	
	void add(User user);
	void delete(User user);
	
	User get(int id);
	List<User> getAll();
	
	boolean checkMailCorrect(String mail);
	User getByMail(String mail);
	
	boolean isVerified(User user);
	void verificate(User user);
	boolean verificate(String mail);
	

}
