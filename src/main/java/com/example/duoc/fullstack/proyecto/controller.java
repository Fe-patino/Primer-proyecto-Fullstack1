package com.example.duoc.fullstack.proyecto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class controller {
    @GetMapping("/primate")
    public String saludos(){
        return "saludos";
    }
    

ç

}
