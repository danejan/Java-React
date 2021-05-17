import java.time.LocalDate;

public class Customer implements  IEntity{

    public int Id;
    public String FirstName;
    public String LastName;
    private LocalDate dateOfBirth;
    public String NationalityId;

    public Customer() {

    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public Customer(int Id, String FirstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.dateOfBirth = dateOfBirth;
        this.NationalityId = NationalityId;
    }


    //public Customer(int id, String firstName, String lastName, int i, String nationalityId) {
      //  super();
      //  Id = id;
      //  FirstName = firstName;
       // LastName = lastName;

       // NationalityId = nationalityId;
   // }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }



    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }



    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
























}