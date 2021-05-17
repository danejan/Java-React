package hafta3Odev;

public class Students extends User  {
	
	
	public Students(int id, String firstName, String lastName, String email , String courses) {
		super(id, firstName, lastName, email );
		
	}

	private String courses;

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
	

}
