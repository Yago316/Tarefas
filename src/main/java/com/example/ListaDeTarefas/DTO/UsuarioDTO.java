package com.example.ListaDeTarefas.DTO;

import com.example.ListaDeTarefas.Entities.Usuario;

public class UsuarioDTO{
	
		private Long Id; 
		private String Nome; 
		private String Email;
		
		public UsuarioDTO() {
			
		}

		public UsuarioDTO(Long id, String nome, String email) {
			this.Id = id;
			this.Nome = nome;
			this.Email = email;
		}
		
		public UsuarioDTO(Usuario entity) {
			Id = entity.getId();
			Nome = entity.getNome();
			Email = entity.getEmail();
		}

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}
		
		
}
