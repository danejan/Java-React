package hafta3Odev;

public class UserManager {
	//Ekle 
	// Sil
	//Giriþ 
	// Çýkýþ 
	
	
	public void addUser(User e) {
		
		User user =new User (e.getId(),e.getfirstName() ,e.getLastName(),e.getEmail());
		
		System.out.println("Kullanici Olusturuldu" + " "+ user.getfirstName() + user.getLastName());
		
	}
	 
	public void deleteUser(User d) {
		
		
		System.out.println("Kullanici silindi" + " " +d.getfirstName() +" " + d.getLastName());
		
		
	}
	
	public void signIn(User s)
	{
		System.out.println("Kullanici giris  yapti" + " "+s.getfirstName() + " " + s.getLastName());
	}
	
	public void signOut(User o)
	{
		System.out.println("Kullanici cikis  yapti" + " " +o.getfirstName() + " " + o.getLastName());
	}
	
	
	public void userMultiple(User users[]) {
		
		for (User user : users) {
			 addUser(user);
			
		}
	}
	
	

}
