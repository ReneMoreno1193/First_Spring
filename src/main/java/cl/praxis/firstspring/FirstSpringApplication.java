package cl.praxis.firstspring;

import cl.praxis.firstspring.entity.Persona;
import cl.praxis.firstspring.entity.Profesor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class, args);

        Persona persona = new Persona("René", "Moreno", 30);
        System.out.println("Nombre: " + persona.getName());
        System.out.println("Apellido: " + persona.getLastName());
        System.out.println("Edad: " + persona.getAge());


    }

}
