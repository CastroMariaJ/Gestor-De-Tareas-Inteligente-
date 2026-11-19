package cp.campus.gestor_tarea_inteligente.dto;

import cp.campus.gestor_tarea_inteligente.entity.Tarea;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record TareaRequest(
        @NotBlank
        @Size(max = 100)
        String titulo,

        @Size(max = 150)
        String Descripcion,

        @NotNull
        LocalDate fechaEntrega,

        @NotNull
        Tarea.Prioridad prioridad
) {
}
