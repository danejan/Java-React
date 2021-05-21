package Concrete;

import Abstract.CheckUserManager;
import Entitities.User;

public class UserManager implements CheckUserManager {

    public UserManager(SalesManager salesManager) {
    }

    public void singUp(User user){
    System.out.println("Yeni kullanıcı sisteme kayıt edildi" + user.getFirstName() +""+ user.getLastName());

}

public  void singIn(User user){
    System.out.println("Kullanıcı sisteme giriş yaptı" + user.getFirstName() +""+ user.getLastName());

}
    public void signUpdate(User user) {

        System.out.println("Kullanıcı  bilgilerini güncelledi."+ user.getFirstName() + " " + user.getLastName());

    }



@Override
    public Boolean CheckIfRealPerson(User user){
    if(user.getId() ==1 && user.getFirstName() =="Dane Jan" && user.getLastName() =="Kece" && user.getNationalityId() =="1235478" && user.getDateOfBirth().getYear() ==1998){
        System.out.println(user.getFirstName() + " isimli kişinin doğrulaması yapıldı.");
        } else {
             System.out.println("Böyle bir kişi sistemde kayıtlı değildir.");
          }
    return null;
}
}






