package cp.campus.gestor_tarea_inteligente.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tareas")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(nullable = false, length = 150)
    private String descripcion;

    @Column(nullable = false)
    private LocalDate fechaEntrega;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Prioridad prioridad;

    @Column(nullable = false)
    private  boolean completado;

    public Tarea(String titulo, String descripcion, LocalDate fechaEntrega, Prioridad prioridad, boolean completado){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.prioridad = prioridad;
        this.completado = completado;
    }

    public enum Prioridad {
        Baja,
        Media,
        Alta
    }
}
