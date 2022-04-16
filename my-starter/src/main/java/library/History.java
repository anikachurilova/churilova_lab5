package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="book.type", havingValue="history")
public class History implements IBook, InitializingBean {
    private String title = "The Three Musketeers";
    private int publishingYear = 1844;
    private String author = "Alexandre Dumas";

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
