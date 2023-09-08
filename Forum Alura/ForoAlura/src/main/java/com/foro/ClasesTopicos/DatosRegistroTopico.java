package com.foro.ClasesTopicos;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
		@NotBlank
		String titulo,
		@NotBlank
		String mensaje,
		@NotNull
		Date fechaCreacion,
		@NotBlank
		String documento,
		@NotNull
		Estatus estatus,
		@NotBlank
		String autor,
		@NotBlank
		String curso

) {

}
