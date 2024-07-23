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
@Table(name = "PORFESOR")
public class Profesor {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Esto genera el id autoincremental
    @Column(name = "id_profesor", nullable = false)//indica que es la columna de la base de datos y su nombre//el nullable = false significa que no es nulo
    private long IdTeacher;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = true, length = 50)
    private String lastName;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 50)
    private String course;

    public Profesor(String name, String lastName, String email, String course){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
    }

}
