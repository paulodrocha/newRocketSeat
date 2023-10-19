package gov.semad.meioambiente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testeRota")
// http://localhost:8080/testeRota/
public class ControllerTest {
    

    @GetMapping("/")

    public String primeiraMensagem(){
        return "<h1>Funcionou</h1>" ;

    }
}
