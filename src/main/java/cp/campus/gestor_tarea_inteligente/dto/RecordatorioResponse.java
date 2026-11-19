package cp.campus.gestor_tarea_inteligente.dto;

import java.time.LocalDateTime;

public record RecordatorioResponse(
        Long id,
        LocalDateTime fechaHora,
        boolean enviado
) {
}
