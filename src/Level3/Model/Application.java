package Level3.Model;

import Level3.Exceptions.EditorNotFoundException;
import Level3.Exceptions.NewsNotFoundException;
import Level3.Model.news.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    static List<Editor> editors = new ArrayList<>();

    public static List<Editor> getEditors() {
        return editors;
    }

    public void play() {
        int option;

        do {
            option = Menus.mainMenu();
            String message = switch (option) {
                case 1 -> createEditor();
                case 2 -> removeEditor();
                case 3 -> createNews();
                case 4 -> removeNews();
                case 5 -> showAllNews();
                case 6 -> CalculateNewsPoints();
                case 7 -> CalculateNewsPrice();
                case 0 -> "Good bye.";
                default -> "Option not valid. Choose a valid option.";
            };
            System.out.println(message);
        } while (option != 0);
    }

    public String createEditor() {
        editors.add(new Editor(Input.askString("What's the editor's name?"), Input.askString("What's the editor's ID?")));
        return "New editor created.";
    }

    public String removeEditor() {
        while (true) {
            try {
                editors.remove(ApplicationHelper.findEditor(Input.askString("What's the editor's name?")));
                return "New editor eliminated.";
            } catch (EditorNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String createNews() {
        int option = Menus.newsMenu();
        int editorIndex;

        try {
            editorIndex = editors.indexOf(ApplicationHelper.findEditor(Input.
                    askString("Which editor do you want to add this news to?")));
        } catch (EditorNotFoundException e) {
            return e.getMessage();
        }

        return switch (option) {
            case 1 -> {
                editors.get(editorIndex).getNews().add(NewsBasketball.createNews());
                yield "A new basketball news has been created.";
            }
            case 2 -> {
                editors.get(editorIndex).getNews().add(NewsF1.createNews());
                yield "A new F1 news has been created.";
            }
            case 3 -> {
                editors.get(editorIndex).getNews().add(NewsFootball.createNews());
                yield "A new football news has been created.";
            }
            case 4 -> {
                editors.get(editorIndex).getNews().add(NewsMoto.createNews());
                yield "A new motorbike news has been created.";
            }
            case 5 -> {
                editors.get(editorIndex).getNews().add(NewsTennis.createNews());
                yield "A new tennis news has been created.";
            }
            case 0 -> "";
            default -> "That type of news cannot be created.";
        };
    }

    public String removeNews() {
        int editorIndex;
        int newsIndex;
        try {
            editorIndex = editors.indexOf(ApplicationHelper.findEditor(Input.
                    askString("Which editor do you want to remove the news from?")));
        } catch (EditorNotFoundException e) {
            return e.getMessage();
        }
        try {
            newsIndex = editors.get(editorIndex).getNews().indexOf((ApplicationHelper.findNews(Input.askString
                    ("What is the headline of the news article you want to delete?"), editors.get(editorIndex))));
        } catch (NewsNotFoundException e) {
            return e.getMessage();
        }

        editors.get(editorIndex).getNews().remove(newsIndex);
        return "The news article has been deleted.";
    }

    public static String showAllNews() {
        StringBuilder message = new StringBuilder();

        if (!editors.isEmpty()) {
            for (int i = 0; i < editors.size(); i++) {
                message.append("The editor ").append(editors.get(i).getName()).append(" ");

                if (!editors.get(i).getNews().isEmpty()) {
                    message.append("has the news articles:\n");
                    for (int j = 0; j < editors.get(i).getNews().size(); j++) {
                        message.append((i + 1)).append(") ").append(editors.get(i).getNews().get(j).getHeadline()).append(".").append("\n");
                    }
                } else {
                    message.append("has no news articles yet.\n");
                }
            }
        } else {
            message = new StringBuilder("There are no editors yet.");
        }
        return message.toString();
    }

    public static String CalculateNewsPrice() {
        int editorIndex;
        int newsIndex;
        int newsPrice;

        try {
            editorIndex = editors.indexOf(ApplicationHelper.findEditor(Input.
                    askString("Which editor has the news article?")));
        } catch (EditorNotFoundException e) {
            return e.getMessage();
        }
        try {
            newsIndex = editors.get(editorIndex).getNews().indexOf((ApplicationHelper.findNews(Input.askString
                    ("What is the headline of the news?"), editors.get(editorIndex))));
        } catch (NewsNotFoundException e) {
            return e.getMessage();
        }
        newsPrice = editors.get(editorIndex).getNews().get(newsIndex).calculateNewsPrice();
        return "The price of the news article is " + newsPrice + " €.";
    }


    public static String CalculateNewsPoints() {
        int editorIndex;
        int newsIndex;
        int newsScore;

        try {
            editorIndex = editors.indexOf(ApplicationHelper.findEditor(Input.
                    askString("Which editor has the news article?")));
        } catch (EditorNotFoundException e) {
            return e.getMessage();
        }
        try {
            newsIndex = editors.get(editorIndex).getNews().indexOf((ApplicationHelper.findNews(Input.askString
                    ("What is the headline of the news?"), editors.get(editorIndex))));
        } catch (NewsNotFoundException e) {
            return e.getMessage();
        }
        newsScore = editors.get(editorIndex).getNews().get(newsIndex).calculateNewsPoints();
        return "The total points of the news article is " + newsScore + " points.";
    }
}
