package Level3.Model.news;

import Level3.Model.Input;
import Level3.Model.News;

public class NewsFootball extends News {
    String league;
    String club;
    String player;
    String[] premiumStrings;

    public NewsFootball(String headline, String league, String club, String player) {
        super(headline);
        this.league = league;
        this.club = club;
        this.player = player;
        this.premiumStrings = new String[]{"Lliga de Campions", "Barça", "Madrid", "Ferran Torres", "Benzema"};
    }

    public static News createNews() {
        String[] questions = {"What is the headline of the news?", "What league is the news from?", "Which club is the news from?", "Is there any player mentioned in the news?"};
        String[] answers = new String[4];

        for (int i = 0; i < questions.length; i++) {
            answers[i] = Input.askString(questions[i]);
        }

        return new NewsFootball(answers[0], answers[1], answers[2], answers[3]);
    }

    @Override
    public int calculateNewsPrice() {
        int price = 300;

        price += (super.findIfPremiumString(this.league, this.premiumStrings)) ? 100 : 0;
        price += (super.findIfPremiumString(this.club, this.premiumStrings)) ? 100 : 0;
        price += (super.findIfPremiumString(this.player, this.premiumStrings)) ? 50 : 0;

        return price;
    }

    @Override
    public int calculateNewsPoints() {
        int points = 5;

        points += (super.findIfPremiumString(this.league, this.premiumStrings)) ? 3 : 0;
        points += (this.league.equalsIgnoreCase("Lliga")) ? 2 : 0;
        points += (super.findIfPremiumString(this.club, this.premiumStrings)) ? 1 : 0;
        points += (super.findIfPremiumString(this.player, this.premiumStrings)) ? 1 : 0;

        return points;
    }
}
