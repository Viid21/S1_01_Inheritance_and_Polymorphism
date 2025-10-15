package Level3.Model.news;

import Level3.Model.Input;
import Level3.Model.News;

public class NewsF1 extends News {
    String club;
    String[] premiumStrings;

    public NewsF1(String headline, String club) {
        super(headline);
        this.club = club;
        this.premiumStrings = new String[]{"Ferrari", "Mercedes"};
    }

    public static News createNews() {
        String[] questions = {"What is the headline of the news?", "What team is the news from?"};
        String[] answers = new String[2];

        for (int i = 0; i < questions.length; i++) {
            answers[i] = Input.askString(questions[i]);
        }

        return new NewsF1(answers[0], answers[1]);
    }

    @Override
    public int calculateNewsPrice() {
        int price = 100;

        price += (super.findIfPremiumString(this.club, this.premiumStrings)) ? 50 : 0;

        return price;
    }

    @Override
    public int calculateNewsPoints() {
        int points = 4;

        points += (super.findIfPremiumString(this.club, this.premiumStrings)) ? 2 : 0;

        return points;
    }
}
