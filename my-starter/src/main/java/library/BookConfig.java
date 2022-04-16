package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BookConfig.class)
public class BookConfig {
    @Bean
    @ConditionalOnProperty(value = "book.type", havingValue = "fantasy")
    IBook fantasy() {
        return new Fantasy();
    }

    @Bean
    @ConditionalOnProperty(value = "book.type", havingValue = "drama")
    IBook drama() {
        return new Drama();
    }

    @Bean
    @ConditionalOnProperty(value = "book.type", havingValue = "history")
    IBook history() {
        return new History();
    }

    @Bean
    @ConditionalOnProperty(value = "book.type", havingValue = "science")
    IBook science() {
        return new Science();
    }
}
