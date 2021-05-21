package Entitities;

import java.util.Timer;

public class Campaign {

    private  int CampaignId;
    private String CampaignName;
    private double discountRate;


    public Campaign() {
    }
    public Campaign( int CampaignId,String CampaignName ,double discountRate) {
        super();
        this.CampaignId=CampaignId;
        this.CampaignName=CampaignName;
        this.discountRate=discountRate;
    }


    public int getCampaignId() {
        return CampaignId;
    }

    public void setCampaignId(int campaignId) {
        CampaignId = campaignId;
    }

    public String getCampaignName() {
        return CampaignName;
    }

    public void setCampaignName(String campaignName) {
        CampaignName = campaignName;
    }


    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
