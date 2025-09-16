package Level3.Model;

public class NewsBasketball extends News {
    private String league;
    private String club;
    private String[] premiumStrings;

    public NewsBasketball(String headline, String league, String club) {
        super(headline);
        this.league = league;
        this.club = club;
        this.premiumStrings = new String[]{"Eurolliga", "Barça", "Madrid"};
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String[] getPremiumStrings() {
        return premiumStrings;
    }

    public void setPremiumStrings(String[] premiumStrings) {
        this.premiumStrings = premiumStrings;
    }

    @Override
    public int CalculateNewPrice(){
        int price = 250;

        price += (super.FindIfPremiumString(this.league, this.premiumStrings)) ? 75 : 0;
        price += (super.FindIfPremiumString(this.club, this.premiumStrings)) ? 75 : 0;

      return price;
    }

    @Override
    public int CalculateNewPoints() {
        int points = 4;

        points += (super.FindIfPremiumString(this.league, this.premiumStrings)) ? 3 : 0;
        points += (this.league.equalsIgnoreCase("ABC")) ? 2 : 0;
        points += (super.FindIfPremiumString(this.club, this.premiumStrings)) ? 1 : 0;

        return points;
    }
}
