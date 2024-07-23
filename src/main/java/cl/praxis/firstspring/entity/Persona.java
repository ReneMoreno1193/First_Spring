package cl.praxis.firstspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Persona")
public class Persona { //Clase y atributos
    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Esto genera el id autoincremental
    @Column(name = "id_person", nullable = false)//indica que es la columna de la base de datos y su nombre//el nullable = false significa que no es nulo
    private long IdPerson;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = true, length = 50)
    private String lastName;
    @Column
    private int age;


    //Constructor
    public Persona(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
