package Concrete;

import Abstract.CampaignManagerService;
import Entitities.Campaign;

public class CampaignManager implements CampaignManagerService {


    @Override
    public void CampaignAdd(Campaign campaign) {
        System.out.println("Sisteme " + campaign.getCampaignName() + " isimli kampanya eklendi.");

    }

    @Override
    public void CampaignDelete(Campaign campaign) {
        System.out.println("Sisteme " + campaign.getCampaignName() + " isimli kampanya güncellendi.");

    }

    @Override
    public void CampaignUpdate(Campaign campaign) {
        System.out.println("Sisteme " + campaign.getCampaignName() + " isimli kampanya silindi.");

    }
}
