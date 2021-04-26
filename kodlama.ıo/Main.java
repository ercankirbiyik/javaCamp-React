/* Ercan Kýrbýyýk
  
   kodlama.io homeWork  */


package kodlama.ýo;

public class Main {

	public static void main(String[] args) {

		Courses course1 = new Courses("C# + Angular", 1, "Engin Demirog", 3);
		Courses course2 = new Courses("Java + React", 2, "Engin Demirog", 100);
		Courses course3 = new Courses("Programlamaya Giriþ için Temel Kurs", 3, "Engin Demirog", 13);

		Courses[] courses = { course1, course2, course3 };

		for (Courses course : courses) {
			System.out.println("Course name: " + course.name);
			System.out.println("Course id: " + course.id);
			System.out.println("Course instructor: " + course.instructor);
			System.out.println("Course completed %: " + course.percent);
			System.out.println("-----------------------");
		}

		Category category1 = new Category();
		category1.Id = 2;
		category1.name = "Programlama";

		System.out.println(
				category1.Id + " " + "Numaralý" + " " + category1.name + " " + "Kursu Baþlamýþtýr.");
		System.out.println(" ");
		
		

		CourseManager courseManager = new CourseManager();
		courseManager.Add(course3);
		courseManager.Update(course2);
		courseManager.Add(course1);
	}

}
