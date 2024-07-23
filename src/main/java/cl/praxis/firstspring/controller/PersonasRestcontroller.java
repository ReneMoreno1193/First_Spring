package cl.praxis.firstspring.controller;

import cl.praxis.firstspring.entity.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PersonasRestcontroller {
    private List<Persona> personas = new ArrayList<>(Arrays.asList(
            new Persona(123, "Juanito", "Vera", 73),
            new Persona(124, "Diego", "Maturana", 31),
            new Persona(125, "Mariana", "Manríquez", 28),
            new Persona(126, "René", "Moreno", 30)
    ));

    @GetMapping("/personas")
    public List<Persona> getPersons() {
        return personas;
    }

    //diferenciador
    @GetMapping("/personas/{name}") // Los endpoints deben diferenciarse de nombre utilizando /{nombre de variable}
    public Persona getPersona(@PathVariable String name) {
        for (Persona p : personas) {   //Persona(tipo de dato)--- p (variable que le voy a asignar) persons (objeto iterable dentro del cual va a iterar for each)
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }

        return null;
    }

    @PostMapping("/personas")
    //modificador acceso+tipo de dato+nombre método(parámetro y objeto)
    public Persona postPersona(@RequestBody Persona nuevapersona) {   //en los () ponemos el parámetro que será un objeto tipo PersonasRestController
        personas.add(nuevapersona);
        return nuevapersona;

    }

    @PutMapping("/personas")
    public Persona putPersona(@RequestBody  Persona persona) {
        for (Persona p : personas) {
            if (p.getIdPerson() == persona.getIdPerson()) {  //el p.getIdPerson es el id de la lista (p) que está iterando. El otro es del patámetro persona
                p.setName(persona.getName()); //set me permite ingresar nuevos valores
                p.setLastName(persona.getLastName());
                p.setAge(persona.getAge());

                return p;
            }
        }
        return null;
    }
@DeleteMapping("/personas/{IdPerson}")
    public Persona deletePersona(@PathVariable long IdPerson) {//en los parentesis se pone el parametro a recibir
        for (Persona p : personas) {
            if (p.getIdPerson() == IdPerson) {
                personas.remove(p);

                return p;
            }
        }
        return null;
    }
}