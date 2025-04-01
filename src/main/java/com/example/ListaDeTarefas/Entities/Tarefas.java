package com.example.ListaDeTarefas.Entities;

import java.time.LocalDate;

import com.example.ListaDeTarefas.Enuns.Prioridade;
import com.example.ListaDeTarefas.Enuns.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tarefas")
public class Tarefas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long Id;
	@Column(columnDefinition = "TEXT") // Aqui ele vai meio que modificar no Banco o campo descrição
	//como Texto 
	private String Descricao;
	private String Setor;
	private LocalDate DataCadastro;
	private Status status;
	private Prioridade Prioridade;

	
	@ManyToOne // Aqui muitos usuarios podem ter uma tarefa  
	@JoinColumn(name = "usuario_id") // ele vai criar o atributo com o nome do usuario então
	// o Joim servi pra junta as Tabelas 
	private Usuario usuario;
	public Tarefas() {
		
	}
	public Tarefas(Long id, String descricao, String setor, LocalDate dataCadastro, Status status,
			Prioridade prioridade, Usuario usuario) {
		this.Id = id;
		this.Descricao = descricao;
		this.Setor = setor;
		this.DataCadastro = dataCadastro;
		this.status = status;
		this.Prioridade = prioridade;
		this.usuario = usuario;
	}
	// O GetId servi pra Pegar ou Mostrar o Id Da tarefa
	public Long getId() {
		return Id;
	}
	// o SetId voce pode modificar o valor do Atributo 
	public void setId(Long id) {
		Id = id;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getSetor() {
		return Setor;
	}
	public void setSetor(String setor) {
		Setor = setor;
	}
	public LocalDate getDataCadastro() {
		return DataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		DataCadastro = dataCadastro;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Prioridade getPrioridade() {
		return Prioridade;
	}
	public void setPrioridade(Prioridade prioridade) {
		Prioridade = prioridade;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
