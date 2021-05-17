package Entitities;

import java.time.LocalDate;

public class User {

    public int Id;
    public String FirstName;
    public String LastName;
    private LocalDate dateOfBirth;
    public String NationalityId;




    public User(int id, String daneJan, String keçe, int i, String nationalityId) {

    }


    public User(int Id, String FirstName, String LastName ,LocalDate dateOfBirth,String NationalityId){
        super();
        this.Id=Id;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.dateOfBirth=dateOfBirth;
        this.NationalityId=NationalityId;

    }

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
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}