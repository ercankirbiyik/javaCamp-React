package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

/* User ekleme-silme-g�ncelleme gibi durumlar i�in kullan�lan interface */

public interface UserDao {
	
	void add(User user);
    void update(User user);
    void delete(User user);
    
    User get(int id);
    User getByMail(String mail);
    
    List<User> getAll();
    
    boolean isVerified(User user);

}
