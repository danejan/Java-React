package hafta3Odev;

public class Insructor  extends User{
	
	private String certificate;
	
	public Insructor(int id, String firstName, String lastName, String email,String certificate) {
		super(id, firstName, lastName, email);
		
	}
	
	public String getCertificate() {
		return certificate;
	}




	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}







	
	
	
	
	
	
	
	

}
