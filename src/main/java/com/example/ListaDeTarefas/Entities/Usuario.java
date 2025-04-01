package com.example.ListaDeTarefas.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// Entity e pra indetificar pro Spring que essa classe e uma entidade no Banco 
@Entity
// A Anotação @Table e pra indetificar a tabela no Banco de Dados
@Table(name = "tb_usuario")
public class Usuario {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//O long oferece uma gama muito maior de valores possíveis do 
	//que tipos inteiros menores
	private Long Id;
	private String Nome;
	@Column(unique = true)// Aqui ele nao vai deixar o campo se repitir ou seja nao pode ter dois 
	// usuarios com o mesmo email
	private String Email;
	
	// Aqui o Tipo dele e uma Lista por que queremos returna uma Lista de Tarefas 
	
	// Aqui o Usuario pode ter varias tarefas e as Tarefas pra somente pra um Usuario
	@OneToMany(mappedBy = "usuario") //mappedBy servir pra conectar duas entidades
	private List<Tarefas> tarefas;
	
	public Usuario() {
		
	}

	public Usuario(Long id, String nome, String email) {
		Id = id;
		Nome = nome;
		Email = email;
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
