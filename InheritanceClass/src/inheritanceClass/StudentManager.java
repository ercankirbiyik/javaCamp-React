package inheritanceClass;

public class StudentManager extends UserManager {

	@Override
	
	public void add (User user) {
		
		System.out.println(user.getFirstName()+ " " + user.getLastName() + " " + " Öðrenci sisteme eklendi ");
	
	}
	
	public void update (User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + " Öðrenci bilgileri güncellendi ");
		
	}
	
	public void delete (User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + " Öðrenci bilgileri silindi ");
		
	}
}
