package Level3.Model;

import Level3.Exceptions.EditorNotFoundException;
import Level3.Exceptions.NewsNotFoundException;

public class ApplicationHelper {
    public static Editor findEditor(String name) throws EditorNotFoundException {
        for (Editor editor : Application.getEditors()) {
            if (editor.getName().equalsIgnoreCase(name)) {
                return editor;
            }
        }
        throw new EditorNotFoundException("Editor not found");
    }

    public static News findNews(String name, Editor editor) throws NewsNotFoundException {
        for (News news : editor.getNews()) {
            if (news.getHeadline().equals(name)) {
                return news;
            }
        }
        throw new NewsNotFoundException("Editor not found");
    }
}
