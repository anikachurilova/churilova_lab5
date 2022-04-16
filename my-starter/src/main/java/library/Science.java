package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="book.type", havingValue="science")
public class Science implements IBook, InitializingBean {
    private String title = "A Brief History of Time";
    private int publishingYear = 1988;
    private String author = "Stephen Hawking";

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
