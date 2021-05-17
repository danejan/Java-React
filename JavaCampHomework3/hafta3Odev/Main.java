package hafta3Odev;

public class Main {

	public static void main(String[] args) {
		
		Insructor insructor = new Insructor(1, "Engin" , "Demiroğ", "engin@gmail.com","certificate");
		
		Students students1 =new Students(1, "Dane Jan", "Keçe", "jan@gmail.com", "Java+React ");
		Students students2 =new Students(2, "Ece", "Keçe", "ece@gmail.com", "PHP ");
		Students students3 =new Students(3, "İlayda", "Keçe", "ilayda@gmail.com", "C# ");
		
		
		User user = new User(2, "Dijan", "Keçe", "dijan@gmail.com");
		
		
		StudentsManager studentsManager= new StudentsManager();
		studentsManager.add(students1);
		studentsManager.add(students2 );
		studentsManager.add(students3 );
		

		

		InsructorManager insructorManager = new InsructorManager();
		insructorManager.add(insructor);
		insructorManager.addCertificate(insructor);
		
		
		UserManager userManager = new UserManager ();
		userManager.addUser(students1);
		userManager.deleteUser(students2);
		userManager.signIn(students3);
		userManager.signOut(students1);
		
		
		
		
		
	}
	
	
	
	
      
}
