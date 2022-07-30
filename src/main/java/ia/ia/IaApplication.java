package ia.ia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class IaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IaApplication.class, args);
    }

}
