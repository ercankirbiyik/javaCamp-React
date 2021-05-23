package inheritanceClass;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ercan ");
		student1.setLastName("Kırbıyık ");
		student1.seteMail("abc@gmail.com");
		student1.setPassword("123456");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Dersi ");
		student2.setLastName("Alan ");
		student2.seteMail("ek@hotmail.com");
		student2.setPassword("789456");
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setFirstName("Herhangi ");
		student3.setLastName("Biri");
		student3.seteMail("hb@gmail.com");
		student3.setPassword("789456");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(4);
		instructor1.setInstructorId(99);
		instructor1.setFirstName("Engin ");
		instructor1.setLastName("Demirog ");
		instructor1.seteMail("ed@gmail.com");
		instructor1.setPassword("45645");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(5);
		instructor2.setInstructorId(10);
		instructor2.setFirstName("Dersi ");
		instructor2.setLastName("Veren ");
		instructor2.seteMail("ok@gmail.com");
		instructor2.setPassword("85478");
		
		User[] users = {student1, student2, student3, instructor1, instructor2 };
		  
		System.out.println("**********Kullanıcılar*********");
		
		for(User user : users) {
			
			System.out.println("Kullanıcı adı:" + user.getFirstName() + " " + user.getLastName() + " ");
			
		}
		
		
		System.out.println("*********Öğrenciler*********");
		
		Student[] students = {student1, student2, student3 };
		
		 for ( Student student : students) {
			 
			 System.out.println("Öğrenci Adı Soyadı:" + student.getFirstName() + " " + student.getLastName() + " // " + " İlerleme Durumu: " + " " + student.getPercent() + " ");
			 
		
			 
			 System.out.println("*********Eğitmenler*********");
		
		Instructor[] instructors = {instructor1, instructor2};
		
		for (Instructor instructor : instructors) {
			
			System.out.println("Eğitmen Adı Soyadı:" + " " + instructor.getFirstName() + " " + instructor.getLastName() + " ");
		
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student2);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor2);
		instructorManager.addCourse();
		
		
		
		 }
		
		

	}

}
