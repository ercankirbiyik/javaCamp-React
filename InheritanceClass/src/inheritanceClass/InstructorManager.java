package inheritanceClass;

public class InstructorManager extends UserManager {
	
	@Override
	
	public void add (User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + " Eðitmen sisteme eklendi ");
		
	}
	
	public void update (User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName()+ " " + " Eðitmen bilgileri güncellendi ");
		
	}
	
	public void delete(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + " Eðitmen bilgileri silindi ");
		
	}
	
	public void addCourse() {
		
		System.out.println("Kurs sisteme yüklendi ");
		
	}

}
