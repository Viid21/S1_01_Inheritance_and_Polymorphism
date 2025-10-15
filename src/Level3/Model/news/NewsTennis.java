package Level3.Model.news;

import Level3.Model.Input;
import Level3.Model.News;

public class NewsTennis extends News {
    String league;
    String player;
    String[] stringsPremium;

    public NewsTennis(String headline, String league, String player) {
        super(headline);
        this.league = league;
        this.player = player;
        this.stringsPremium = new String[]{"Federer", "Nadal", "Djokovic"};
    }

    public static News createNews() {
        String[] questions = {"What is the headline of the news?", "What league is the news from?", "Which club is the news from?", "Is there any player mentioned in the news?"};
        String[] answers = new String[4];

        for (int i = 0; i < questions.length; i++) {
            answers[i] = Input.askString(questions[i]);
        }

        return new NewsTennis(answers[0], answers[1], answers[2]);
    }

    @Override
    public int calculateNewsPrice() {
        int price = 150;

        price += (super.findIfPremiumString(this.player, this.stringsPremium)) ? 100 : 0;

        return price;
    }

    @Override
    public int calculateNewsPoints() {
        int points = 4;

        points += (super.findIfPremiumString(this.player, this.stringsPremium)) ? 3 : 0;

        return points;
    }
}
