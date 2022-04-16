package client.books;

import library.Drama;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Drama.class)
public class DramaBook implements InitializingBean {
    @Override
    public void afterPropertiesSet() {
        System.out.println("Drama book♥");
    }
}