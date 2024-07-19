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
@Table(name = "PEOPLE")
public class Person { //Clase y parámetros
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdPerson;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private int age;

    public Person (String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
