package eCommerceDemo.business.concretes;

import java.util.List; 
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.UserManagerService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

import java.util.regex.Matcher;


public class UserManager implements UserManagerService {
	
	private static final Pattern VALID_EMAIL_TYPE = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private UserDao dao;

    public UserManager(UserDao dao){
        this.dao = dao;
    }
	

	@Override
	public void add(User user) {
		this.dao.add(user);
		
	}

	@Override
	public void delete(User user) {
		if(!(getByMail(user.getEmail()) != null) && isVerified(user)){
            System.out.println("The user cannot be deleted.");
            return;
        }
        this.dao.delete(user);
		
	}

	@Override
	public User get(int id) {
		return this.dao.get(id);
	}

	@Override
	public List<User> getAll() {
		return this.dao.getAll();
	}

	@Override
	public boolean checkMailCorrect(String mail) {
		Matcher matcher = VALID_EMAIL_TYPE.matcher(mail);
        return matcher.find();
	}

	@Override
	public User getByMail(String mail) {
		 User foundedUser = this.dao.getByMail(mail);
	        return foundedUser;
	}

	@Override
	public boolean isVerified(User user) {
		return this.dao.isVerified(user);
	}

	@Override
	public void verificate(User user) {
		user.setVerified(true);
		
	}

	@Override
	public boolean verificate(String mail) {
		
		return false;
	}

	
   }