package cp.campus.gestor_tarea_inteligente.repository;

import cp.campus.gestor_tarea_inteligente.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long > {
}
