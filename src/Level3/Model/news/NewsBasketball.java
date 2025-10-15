package Level3.Model.news;

import Level3.Model.Input;
import Level3.Model.News;

public class NewsBasketball extends News {
    String league;
    String club;
    String[] premiumStrings;

    public NewsBasketball(String headline, String league, String club) {
        super(headline);
        this.league = league;
        this.club = club;
        this.premiumStrings = new String[]{"Eurolliga", "Barça", "Madrid"};
    }

    public static News createNews() {
        String[] questions = {"What is the headline of the news?", "What league is the news from?",
                "Which club is the news from?"};
        String[] answers = new String[3];

        for (int i = 0; i < questions.length; i++) {
            answers[i] = Input.askString(questions[i]);
        }

        return new NewsBasketball(answers[0], answers[1], answers[2]);
    }

    @Override
    public int calculateNewsPrice() {
        int price = 250;

        price += (super.findIfPremiumString(this.league, this.premiumStrings)) ? 75 : 0;
        price += (super.findIfPremiumString(this.club, this.premiumStrings)) ? 75 : 0;

        return price;
    }

    @Override
    public int calculateNewsPoints() {
        int points = 4;

        points += (super.findIfPremiumString(this.league, this.premiumStrings)) ? 3 : 0;
        points += (this.league.equalsIgnoreCase("ABC")) ? 2 : 0;
        points += (super.findIfPremiumString(this.club, this.premiumStrings)) ? 1 : 0;

        return points;
    }
}
