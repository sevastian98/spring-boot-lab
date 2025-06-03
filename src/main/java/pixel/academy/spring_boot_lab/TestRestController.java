package pixel.academy.spring_boot_lab;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @GetMapping("/hello")
    String helli(){
        return "Salutare";
    }
}
