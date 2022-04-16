package client.books;

import library.Fantasy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Fantasy.class)
public class FantasyBook implements InitializingBean {
    @Override
    public void afterPropertiesSet() {
        System.out.println("Fantasy book♥");
    }
}