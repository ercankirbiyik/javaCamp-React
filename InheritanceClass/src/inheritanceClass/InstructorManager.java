package inheritanceClass;

public class InstructorManager extends UserManager {
	
	@Override
	
	public void add (User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + " E�itmen sisteme eklendi ");
		
	}
	
	public void update (User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName()+ " " + " E�itmen bilgileri g�ncellendi ");
		
	}
	
	public void delete(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + " E�itmen bilgileri silindi ");
		
	}
	
	public void addCourse() {
		
		System.out.println("Kurs sisteme y�klendi ");
		
	}

}
