package Level3.Model;

public class Menus {
    public static int mainMenu() {
        return Input.askInt("""
                What do you want to do?
                1) Add an editor.
                2) Remove an editor.
                3) Add news article to an editor.
                4) Remove news article.
                5) Show all news articles by editor.
                6) Calculate news score.
                7) Calculate news price.
                0) Close the program.""");
    }

    public static int newsMenu() {
        return Input.askInt("""
                What kind of news do you want to create?
                1) Basketball.
                2) F1.
                3) Football.
                4) Motorbikes.
                5) Tennis.
                0) Go Back.""");
    }
}
