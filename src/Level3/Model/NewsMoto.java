package Level3.Model;

public class NewsMoto extends News {
    private String club;
    private String[] premiumStrings;

    public NewsMoto(String headline, String club) {
        super(headline);
        this.club = club;
        this.premiumStrings = new String[]{"Honda", "Yamaha"};
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
        int price = 100;

        price += (super.FindIfPremiumString(this.club, this.premiumStrings)) ? 50 : 0;

        return price;
    }

    @Override
    public int CalculateNewPoints() {
        int points = 3;

        points += (super.FindIfPremiumString(this.club, this.premiumStrings)) ? 3 : 0;

        return points;
    }
}
