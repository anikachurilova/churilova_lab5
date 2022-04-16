package client.books;

import library.History;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(History.class)
public class HistoryBook implements InitializingBean {
    @Override
    public void afterPropertiesSet() {
        System.out.println("History book♥");
    }
}
