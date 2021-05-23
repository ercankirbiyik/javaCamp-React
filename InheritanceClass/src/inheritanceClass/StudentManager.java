package inheritanceClass;

public class StudentManager extends UserManager {

	@Override
	
	public void add (User user) {
		
		System.out.println(user.getFirstName()+ " " + user.getLastName() + " " + " ��renci sisteme eklendi ");
	
	}
	
	public void update (User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + " ��renci bilgileri g�ncellendi ");
		
	}
	
	public void delete (User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + " ��renci bilgileri silindi ");
		
	}
}
