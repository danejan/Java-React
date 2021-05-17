package hafta3Odev;

public class InsructorManager {
	
	public void add(Insructor i) {
		System.out.println(i.getfirstName() + " " + i.getLastName() +" " + "egitmen olarak eklendi" );
		
		
	}
	
	public void addCertificate( Insructor i) {
		System.out.println(i.getfirstName()+ " " +i.getLastName()+"," + i.getCertificate()+" sertifika  ekledi");
		
	}
	

}
