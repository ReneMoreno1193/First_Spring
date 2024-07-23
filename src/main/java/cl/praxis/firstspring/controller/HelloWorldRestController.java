package cl.praxis.firstspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {


    @GetMapping({"saludo/{name}", "/hola/{name}"})
    public String HelloWorld(@PathVariable String name){
        return "Hola " + name;
    }
}
