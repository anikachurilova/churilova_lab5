package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="book.type", havingValue="fantasy")
public class Fantasy implements IBook, InitializingBean {
    private String title = "A Song of Ice and Fire";
    private int publishingYear = 1991;
    private String author = "J. Martin";

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
