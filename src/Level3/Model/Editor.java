package Level3.Model;

import java.util.ArrayList;

public class Editor {
    private String name;
    private String dni;
    private final int SALARY;
    ArrayList<News> news = new ArrayList<News>();

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.SALARY = 1500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSALARY() {
        return SALARY;
    }

    public ArrayList<News> getNews() {
        return news;
    }

    public void setNews(ArrayList<News> news) {
        this.news = news;
    }
}
