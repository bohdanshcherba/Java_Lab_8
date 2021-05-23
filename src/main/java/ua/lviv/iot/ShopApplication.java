package ua.lviv.iot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("ua.lviv.iot.controllers")
@ComponentScan("ua.lviv.iot.service")
@ComponentScan("ua.lviv.iot.DAO")

public class ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

}
