package com.brenda.bet.model;

import java.util.UUID;

import com.brenda.bet.dto.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "tb_usuario")
	public class usuariomodel{
		
	

	public usuariomodel(UsuarioDTO user) {
		
		this.cpf = user.cpf();
		this.niver = user.niver();
		this.email = user.email();
		this.senha = user.senha();
        }
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID ID;
	private String niver, cpf, email, senha;
}
