package Level3.Model;

public abstract class News {
    private String headline;
    private String text;
    private int points;
    private int price;

    public News(String headline) {
        this.headline = headline;
        this.text = "";
        this.points = 0;
        this.price = 0;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int CalculateNewPrice();

    public abstract int CalculateNewPoints();

    public boolean FindIfPremiumString(String defaultString, String[] premiumStrings){
        int i = 0;
        boolean found = false;

        while (!found){
            if(premiumStrings[i].equalsIgnoreCase(defaultString)){
                found = true;
            }
            i++;
        }
        return found;
    }
}
