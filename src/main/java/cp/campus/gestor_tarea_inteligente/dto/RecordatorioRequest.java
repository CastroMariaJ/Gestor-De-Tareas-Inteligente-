package cp.campus.gestor_tarea_inteligente.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record RecordatorioRequest(
    @NotNull
    @FutureOrPresent
    LocalDateTime fechaHora
) {
}
