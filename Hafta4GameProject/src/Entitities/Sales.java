package Entitities;

public class Sales  {

    int gameId;
    String gameName;
    int gamePrice;
    int gameDiscount;
    int gamePriceAfterDiscount;

    public Sales() {

    }

    public Sales(int gameId, String gameName , int gamePrice,int gameDiscount,int gamePriceAfterDiscount){
        super();
        this.gameId=gameId;
        this.gameName=gameName;
        this.gamePrice=gamePrice;
        this.gameDiscount=gameDiscount;
        this.gamePriceAfterDiscount= gamePriceAfterDiscount;
    }





    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public int getGameDiscount() {
        return gameDiscount;
    }

    public void setGameDiscount(int gameDiscount) {
        this.gameDiscount = gameDiscount;
    }

    public int getGamePriceAfterDiscount() {
        return gamePriceAfterDiscount;
    }

    public void setGamePriceAfterDiscount(int gamePriceAfterDiscount) {
        this.gamePriceAfterDiscount = gamePriceAfterDiscount;
    }


}
