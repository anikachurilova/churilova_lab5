package client.books;

import library.Science;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Science.class)
public class ScienceBook implements InitializingBean {
    @Override
    public void afterPropertiesSet() {
        System.out.println("Science book♥");
    }
}
