package ia.ia.Bootsrap;

import ia.ia.Repository.UserRepository;
import ia.ia.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrap implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        if (userRepository.count()==0){
            System.out.println("####### Loading ###########");
            userRepository.save(
                    User.builder().
                            email("Esmail@gmail.com").
                            password("HHDHS")
                            .username("Esmail").build());
            userRepository.save(
                    User.builder().
                            email("dev@gmail.com").
                            password("k0ojsu")
                            .username("dev").build());

            userRepository.save(
                    User.builder().
                            email("Mohammed@gmail.com").
                            password("ZSksjj")
                            .username("Mohammed").build());
            System.out.println("Inserted  " + userRepository.count());
        }

        System.out.printf("Enjoy !!! ");

    }
}
