package cp.campus.gestor_tarea_inteligente.dto;

public record UsuarioResponse(
        Long id,
        String nombre,
        String email,
        String telefono
) {
}
