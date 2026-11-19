package cp.campus.gestor_tarea_inteligente.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "recordatorios")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Recordatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechaHora;

    @Column(nullable = false)
    private  boolean enviado;

    public Recordatorio(LocalDateTime fechaHora){
        this.fechaHora = fechaHora;
        this.enviado = false;
    }
}
