package Level3.Model;

public class NewsTennis extends News {
    private String league;
    private String player;
    private String[] stringsPremium;

    public NewsTennis(String headline, String league, String player) {
        super(headline);
        this.league = league;
        this.player = player;
        this.stringsPremium = new String[]{"Federer", "Nadal", "Djokovic"};
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String[] getStringsPremium() {
        return stringsPremium;
    }

    public void setStringsPremium(String[] stringsPremium) {
        this.stringsPremium = stringsPremium;
    }

    @Override
    public int CalculateNewPrice(){
        int price = 150;

        price += (super.FindIfPremiumString(this.player, this.stringsPremium)) ? 100 : 0;

        return price;
    }

    @Override
    public int CalculateNewPoints() {
        int points = 4;

        points += (super.FindIfPremiumString(this.player, this.stringsPremium)) ? 3 : 0;

        return points;
    }
}
