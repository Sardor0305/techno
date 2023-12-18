package uz.pdp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;
@Configuration
public class ApplicationConfig {

        @Bean
        public Properties hibernateProperties(){
            final Properties properties = new Properties();

            properties.put("javax.persistence.provider", "org.hibernate.ogm.jpa.HibernateOgmPersistence");
            properties.put("jakarta.persistence.jdbc.driver", "org.postgresql.Driver");
            properties.put("jakarta.persistence.jdbc.url", "jdbc:postgresql://localhost:5432/db_test");
            properties.put("jakarta.persistence.jdbc.username", "postgres");
            properties.put("jakarta.persistence.jdbc.password", "123");
            properties.put("hibernate.hbm2ddl.auto","create-update");
            return properties;
        }
//        @Bean
//    public EntityMana


}
