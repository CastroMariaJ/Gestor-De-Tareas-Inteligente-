package cp.campus.gestor_tarea_inteligente.repository;

import cp.campus.gestor_tarea_inteligente.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario , Long> {
}
