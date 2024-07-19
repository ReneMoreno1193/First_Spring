package cl.praxis.firstspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/hello") //Puedo agregar más de una ruta ({/"hello","/hw","/hola"}) para llegar al mismo return
    public String helloWolrd(){
        System.out.println("Solicitud ejecutada");
        return "Hola, Machucao";
    }
}
