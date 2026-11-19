package cp.campus.gestor_tarea_inteligente.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 150)
    private String email;

    @Column(nullable = false, length = 100)
    private String telefono;

    public Usuario(String nombre, String email, String telefono){
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
}
