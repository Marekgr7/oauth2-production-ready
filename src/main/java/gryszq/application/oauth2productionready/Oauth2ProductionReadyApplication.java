package gryszq.application.oauth2productionready;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2ProductionReadyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2ProductionReadyApplication.class, args);
    }

}
