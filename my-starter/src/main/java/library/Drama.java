package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="book.type", havingValue="drama")
public class Drama implements IBook, InitializingBean {
    private String title = "Romeo and Juliette";
    private int publishingYear = 1500;
    private String author = "Shakespeare";

    @Override
    public void afterPropertiesSet() {
        System.out.println("Book '" + getTitle() + "' was written by " + getAuthor() + " on " + getPublishingYear() + "♥");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPublishingYear() {
        return publishingYear;
    }
}

