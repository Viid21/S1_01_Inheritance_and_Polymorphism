package Level3.Model;

import java.util.ArrayList;

public class Editor {
    String name;
    String dni;
    final int SALARY = 1500;
    ArrayList<News> news = new ArrayList<>();

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public ArrayList<News> getNews() {
        return news;
    }
}
