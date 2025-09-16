package Level3.Model;

public class NewsFootball extends News {
    private String league;
    private String club;
    private String player;
    private String[] premiumStrings;

    public NewsFootball(String headline, String league, String club, String player) {
        super(headline);
        this.league = league;
        this.club = club;
        this.player = player;
        this.premiumStrings = new String[]{"Lliga de Campions", "Barça", "Madrid", "Ferran Torres", "Benzema"};
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String[] getPremiumStrings() {
        return premiumStrings;
    }

    public void setPremiumStrings(String[] premiumStrings) {
        this.premiumStrings = premiumStrings;
    }

    @Override
    public int CalculateNewPrice(){
        int price = 300;

        price += (super.FindIfPremiumString(this.league, this.premiumStrings)) ? 100 : 0;
        price += (super.FindIfPremiumString(this.club, this.premiumStrings)) ? 100 : 0;
        price += (super.FindIfPremiumString(this.player, this.premiumStrings)) ? 50 : 0;

        return price;
    }

    @Override
    public int CalculateNewPoints() {
        int points = 5;

        points += (super.FindIfPremiumString(this.league, this.premiumStrings)) ? 3 : 0;
        points += (this.league.equalsIgnoreCase("Lliga")) ? 2 : 0;
        points += (super.FindIfPremiumString(this.club, this.premiumStrings)) ? 1 : 0;
        points += (super.FindIfPremiumString(this.player, this.premiumStrings)) ? 1 : 0;

        return points;
    }
}
