package kodlama.ýo;

public class CourseManager {
	public void Add(Courses course) {
		System.out.println("Courses Added: " + " " + course.name);

	}

	public void Update(Courses course) {
		System.out.println("Courses Update: " + " " + course.name);
	}

	public void Delete(Courses course) {
		System.out.println("Courses Deleted: " + " " + course.name);
	}

}
