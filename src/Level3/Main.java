package Level3;

import Level3.Model.NewsBasketball;
import Level3.Model.Editor;
import Level3.Model.NewsF1;
import Level3.Model.NewsMoto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Editor> editors = new ArrayList<>();

    public static void main(String[] args) {
        int option;
        String message;

        do {
            System.out.println("""
                    What do you want to do?
                    1) Add an editor.
                    2) Remove an editor.
                    3) Add news article to an editor.
                    4) Remove news article.
                    5) Show all news articles by editor.
                    6) Calculate news score.
                    7) Calculate news price.
                    0) Close the program.""");
            option = sc.nextInt();
            sc.nextLine();

            message = switch (option) {
                case 1 -> CreateEditor();
                case 2 -> RemoveEditor();
                case 3 -> CreateNews();
                case 4 -> RemoveNews();
                case 5 -> ShowAllNews();
                case 6 -> CalculateNewsPoints();
                case 7 -> CalculateNewsPrice();
                case 0 -> "Good bye.";
                default -> "Option not valid. Choose a valid option.";
            };
            System.out.println(message);
        } while (option != 0);
    }

    public static String CreateEditor(){
        String name;
        String id;

        System.out.println("What's the editor's name?");
        name = sc.nextLine();

        System.out.println("What's the editor's ID?");
        id = sc.next();

        editors.add(new Editor(name, id));
        return "New editor created with the name " + name;
    }

    public static String RemoveEditor(){
        String name;
        String message;
        int idFound;

        System.out.println("What's the editor's name?");
        name = sc.nextLine();

        idFound = FindEditor(name);

        if(idFound == -1){
            message = "Editor not found";
        }else{
            editors.remove(idFound);
            message = "Editor " + name + " eliminated.";
        }
        return message;
    }

    public static int FindEditor(String name){
        int i = 0;
        int idFound = -1;

        while (idFound == -1){
            if(editors.get(i).getName().equalsIgnoreCase(name)){
                idFound = i;
            }else{
                i++;
            }
        }
        return idFound;
    }

    public static String CreateNews(){
        int option;
        String message;

        do {
            System.out.println("""
                    What kind of news do you want to create?
                    1) Basketball.
                    2) F1.
                    3) Football.
                    4) Motorbikes.
                    5) Tennis.
                    0) Go Back.""");
            option = sc.nextInt();

            message = switch (option) {
                case 1 -> CreateBasketballNews();
                case 2 -> CreateF1News();
                case 3 -> CreateFootballNews();
                case 4 -> CreateMotoNews();
                case 5 -> CreateTennisNews();
                case 0 -> "";
                default -> "That type of news cannot be created.";
            };
            return message;

        }while (option != 0);
    }

    public static String CreateBasketballNews(){
        String[] questions = {"What is the headline of the news?", "What league is the news from?", "Which club is the news from?"};
        String[] answers = new String[3];
        String message = "Editor not found";
        int editorId;

        editorId = CompleteNewsCreation(questions, answers);

        if(editorId != -1){
            editors.get(editorId).getNews().add(new NewsBasketball(answers[0],answers[1],answers[2]));
            message = "A new basketball news has been created.";
        }

        return message;
    }

    public static String CreateF1News(){
        String[] questions = {"What is the headline of the news?", "What team is the news from?"};
        String[] answers = new String[2];
        String message = "Editor not found";
        int editorId;

        editorId = CompleteNewsCreation(questions, answers);

        if(editorId != -1){
            editors.get(editorId).getNews().add(new NewsF1(answers[0],answers[1]));
            message = "A new F1 news has been created.";
        }

        return message;
    }

    public static String CreateFootballNews(){
        String[] questions = {"What is the headline of the news?", "What league is the news from?", "Which club is the news from?", "Is there any player mentioned in the news?"};
        String[] answers = new String[4];
        String message = "Editor not found";
        int editorId;

        editorId = CompleteNewsCreation(questions, answers);

        if(editorId != -1){
            editors.get(editorId).getNews().add(new NewsBasketball(answers[0],answers[1],answers[2]));
            message = "A new football news has been created.";
        }

        return message;
    }

    public static String CreateMotoNews(){
        String[] questions = {"What is the headline of the news?", "Which team is the news from?"};
        String[] answers = new String[2];
        String message = "Editor not found";
        int editorId;

        editorId = CompleteNewsCreation(questions, answers);

        if(editorId != -1){
            editors.get(editorId).getNews().add(new NewsMoto(answers[0], answers[1]));
            message = "A new football news has been created.";
        }

        return message;
    }

    public static String CreateTennisNews(){
        String[] questions = {"What is the headline of the news?", "What league is the news from?", "Which club is the news from?", "Is there any player mentioned in the news?"};
        String[] answers = new String[4];
        String message = "Editor not found";
        int editorId;

        editorId = CompleteNewsCreation(questions, answers);

        if(editorId != -1){
            editors.get(editorId).getNews().add(new NewsBasketball(answers[0],answers[1],answers[2]));
            message = "A new football news has been created.";
        }

        return message;
    }

    public static int CompleteNewsCreation(String[] questions, String[] answers){
        String editor;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            answers[i] = sc.nextLine();
        }

        System.out.println("Which editor do you want to add this news to?");
        editor = sc.next();

        return FindEditor(editor);
    }

    public static String RemoveNews(){
        String message;
        String editor;
        String headline;
        int editorId;
        int newsId;

        System.out.println("Which editor do you want to remove the news from?");
        editor = sc.next();

        editorId = FindEditor(editor);

        if(editorId != -1){
            System.out.println("What is the headline of the news article you want to delete?");
            headline = sc.nextLine();
            sc.next();

            newsId = FindNews(editorId, headline);

            if (newsId != -1){
                editors.get(editorId).getNews().remove(newsId);
                message = "The news article has been deleted.";
            }else{
                message = "News article not found.";
            }
        }else{
            message = "Editor not found.";
        }
        return message;
    }

    public static int FindNews(int editorId, String headline){
        int i = 0;
        int idFound = -1;

        while (idFound == -1){
            if(editors.get(editorId).getName().equalsIgnoreCase(headline)){
                idFound = i;
            }else{
                i++;
            }
        }
        return idFound;
    }

    public static String ShowAllNews(){
        StringBuilder message = new StringBuilder();

        if (!editors.isEmpty()){
            for(int i = 0; i < editors.size(); i++){
                message.append("The editor ").append(editors.get(i).getName()).append(" ");

                if(!editors.get(i).getNews().isEmpty()){
                    message.append("has the news articles:\n");
                    for(int j = 0; j < editors.get(i).getNews().size(); j++){
                        message.append((i + 1)).append(") ").append(editors.get(i).getNews().get(j).getHeadline()).append(".").append("\n");
                    }
                }else{
                    message.append("has no news articles yet.\n");
                }
            }
        }else{
            message = new StringBuilder("There are no editors yet.");
        }
        return message.toString();
    }

    public static String CalculateNewsPrice(){
        String message;
        String editor;
        String headline;
        int editorId;
        int newsId;
        int newsPrice;

        System.out.println("Which editor has the news article?");
        editor = sc.nextLine();
        sc.next();

        editorId = FindEditor(editor);

        if(editorId != -1){
            System.out.println("What is the headline of the news?");
            headline = sc.nextLine();
            sc.next();

            newsId = FindNews(editorId, headline);

            if(newsId != -1){
                newsPrice = editors.get(editorId).getNews().get(newsId).CalculateNewPrice();

                message = "The price of the news article is " + newsPrice + " €.";
            }else {
                message = "News article not found.";
            }
        }else{
            message = "Editor not found.";
        }
        return message;
    }

    public static String CalculateNewsPoints(){
        String message;
        String editor;
        String headline;
        int editorId;
        int newsId;
        int newsPoints;

        System.out.println("Which editor has the news article?");
        editor = sc.nextLine();
        sc.next();

        editorId = FindEditor(editor);

        if(editorId != -1){
            System.out.println("What is the headline of the news?");
            headline = sc.nextLine();
            sc.next();

            newsId = FindNews(editorId, headline);

            if(newsId != -1){
                newsPoints = editors.get(editorId).getNews().get(newsId).CalculateNewPoints();

                message = "The total points of the news article is " + newsPoints + " points.";
            }else {
                message = "News article not found.";
            }
        }else{
            message = "Editor not found.";
        }
        return message;
    }
}
