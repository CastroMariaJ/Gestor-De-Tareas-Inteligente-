package cp.campus.gestor_tarea_inteligente.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioRequest(
        @NotBlank
        @Size(max = 100)
        String nombre,

        @NotBlank
        @Email
        @Size(max = 150)
        String email,

        @NotBlank
        @Size(max = 100)
        String telefono
) {
}
