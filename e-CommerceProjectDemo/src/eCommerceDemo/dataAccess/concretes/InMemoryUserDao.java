package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	
	 private List<User> users = new ArrayList<User>();
	 

	    private static int lastId;

	    public InMemoryUserDao() {
	        this.users = new ArrayList<>();
	        setLastId(0);
	    }

		@Override
		public void add(User user) {
			this.users.add(user);
	        System.out.println("User added");
	        setLastId(getLastId() + 1);
	        
		}

		@Override
		public void update(User user) {
			System.out.println("Update is currently disabled");
			
		}

		@Override
		public void delete(User user) {
			int userToDelete = this.users.indexOf(user);
	        this.users.remove(userToDelete);
	        System.out.println("User deleted.");
	        setLastId(getLastId() - 1);
	        
		}

		@Override
		public User get(int id) {
	       
	        User userToReturn = null;
	        for(User user: this.users){
	            if(user.getId() == id){
	                userToReturn = user;
	                break;
	            }
	        }
			return userToReturn;
		}
		
		@Override
		public User getByMail(String mail) {
			 User userToReturn = this.users.stream()
		                .filter((user) -> user.getEmail().equals(mail))
		                .findFirst()
		                .orElse(null);
		        return userToReturn;
		}
		

		@Override
		public List<User> getAll() {
			return users;
		}
		

		@Override
		public boolean isVerified(User user) {
			User userToCheck = get(user.getId());
	        return userToCheck.isVerified() ?
	                true : false;
		}
		

		public static int getLastId() {
			return lastId;
		}

		public static void setLastId(int lastId) {
			InMemoryUserDao.lastId = lastId;
		}

}
