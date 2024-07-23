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
@Table(name = "CURSO")
public class Curso {
    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Esto genera el id autoincremental
    @Column(name = "id_course", nullable = false)//indica que es la columna de la base de datos y su nombre//el nullable = false significa que no es nulo
    private long IdCurso;
    @Column(nullable = false, length = 50)
    private String courseName;
    @Column(nullable = true, length = 50)
    private String description;


}
