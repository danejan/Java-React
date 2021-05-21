package Concrete;

import Entitities.Campaign;
import Entitities.Sales;
import Entitities.User;

public class SalesManager extends CampaignManager
{
    public  void sell(User user , Campaign campaign, Sales game){
        System.out.println("" +user.getFirstName() + "İsimli kullanıcı" + game.getGameName()+ "isimli oyunu " + campaign.getCampaignName() + "isimli kampanya ile" + campaign.getDiscountRate() + "indirim oranıyla" + game.getGamePriceAfterDiscount() + "TL fiyatıyla aldı.");
    }

}
