package Entitities;

import java.util.Timer;

public class Campaign {

    private  int CampaignId;
    private String CampaignName;
    private Timer CampaignDuration;
    private double discountRate;


    public Campaign() {
    }
    public Campaign( int CampaignId,String CampaignName ,Timer CampaignDuration,double discountRate) {
        super();
        this.CampaignId=CampaignId;
        this.CampaignName=CampaignName;
        this.CampaignDuration=CampaignDuration;
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

    public Timer getCampaignDuration() {
        return CampaignDuration;
    }

    public void setCampaignDuration(Timer campaignDuration) {
        CampaignDuration = campaignDuration;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
