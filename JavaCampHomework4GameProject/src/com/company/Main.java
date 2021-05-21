package com.company;

import Abstract.CheckUserManager;
import Concrete.CampaignManager;
import Concrete.SalesManager;
import Concrete.UserManager;
import Entitities.Campaign;
import Entitities.Sales;
import Entitities.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

       UserManager userManager = new UserManager(new SalesManager());
       User danejan=new User();
       danejan.setId(1);
        danejan.setFirstName("Dane Jan");
        danejan.setLastName("Kece");
        danejan.setDateOfBirth(LocalDate.of(1998,05,05));
        danejan.setNationalityId("11111111");
        userManager.singIn(danejan);




        Campaign campaign =new Campaign(1,"Yeni yil kampanyasi",100);
        CampaignManager campaignManager=new CampaignManager();


    }
}