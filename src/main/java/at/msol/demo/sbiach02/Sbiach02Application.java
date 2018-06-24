package at.msol.demo.sbiach02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication
public class Sbiach02Application {

    //@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/readingList");
    }

    public static void main(String[] args) {
        SpringApplication.run(Sbiach02Application.class, args);
    }
}
