import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

       BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
       Customer danejan= new Customer();
       danejan.setId(1);
       danejan.setFirstName("Dane Jan");
       danejan.setLastName("Kece");
       danejan.setDateOfBirth(LocalDate.of(1998,05,05));
       danejan.setNationalityId("11111111");
       customerManager.Save(danejan);



    }



}
