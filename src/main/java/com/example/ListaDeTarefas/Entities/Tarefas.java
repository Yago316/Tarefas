package com.example.ListaDeTarefas.Entities;

import java.time.LocalDate;




import ch.qos.logback.core.status.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tarefas")
public class Tarefas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@OneToOne
	@JoinColumn(name = "Usuario_id")
	private Long Id;
	
	private Long UsuarioId;
	private String Descricao;
	private String Setor;
	private LocalDate DataCadastro;
	private Status Status;

	public Tarefas() {
		
	}

	public Tarefas(Long id, Long usuarioId, String descricao, String setor, LocalDate dataCadastro,
			ch.qos.logback.core.status.Status status) {
		Id = id;
		UsuarioId = usuarioId;
		Descricao = descricao;
		Setor = setor;
		DataCadastro = dataCadastro;
		Status = status;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getUsuarioId() {
		return UsuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		UsuarioId = usuarioId;
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
		return Status;
	}

	public void setStatus(Status status) {
		Status = status;
	}
	
}
