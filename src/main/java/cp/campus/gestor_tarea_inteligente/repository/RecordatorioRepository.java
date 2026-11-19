package cp.campus.gestor_tarea_inteligente.repository;

import cp.campus.gestor_tarea_inteligente.entity.Recordatorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordatorioRepository extends JpaRepository<Recordatorio, Long> {
}
