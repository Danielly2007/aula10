package com.brenda.bet.dto;

import java.util.UUID;

public record UsuarioDTO
	(UUID id, String niver, String cpf, String email, String senha) {
		

}
