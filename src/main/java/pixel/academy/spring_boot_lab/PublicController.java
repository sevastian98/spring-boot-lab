package pixel.academy.spring_boot_lab;


import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("permitAll()")
public class PublicController {

    @GetMapping("/public")
    public String publicMethod() {
        return "Acest text se afiseaza indiferent ca SpringBoot security este activ (pentru el nu este necesar de log si pass)";
    }


    // Exclude endpoint "/public" from Spring Boot Security
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web -> web.ignoring().requestMatchers("/public"));
    }
}
