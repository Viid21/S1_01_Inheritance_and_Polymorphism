package Level3.Model;

public abstract class News {
    String headline;
    String text;
    int points;
    int price;

    public News(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int calculateNewsPrice();

    public abstract int calculateNewsPoints();

    public boolean findIfPremiumString(String defaultString, String[] premiumStrings) {
        int i = 0;
        boolean found = false;

        while (!found) {
            if (premiumStrings[i].equalsIgnoreCase(defaultString)) {
                found = true;
            }
            i++;
        }
        return found;
    }
}
