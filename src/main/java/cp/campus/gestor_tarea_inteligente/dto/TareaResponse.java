package cp.campus.gestor_tarea_inteligente.dto;

import cp.campus.gestor_tarea_inteligente.entity.Tarea;

import java.time.LocalDate;

public record TareaResponse(
        Long id,
        String titulo,
        String descripcion,
        LocalDate fechaEntrega,
        Tarea.Prioridad prioridad,
        boolean completado

) {
}
