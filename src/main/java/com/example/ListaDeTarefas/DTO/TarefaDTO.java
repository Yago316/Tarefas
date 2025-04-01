package com.example.ListaDeTarefas.DTO;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;

import com.example.ListaDeTarefas.Entities.Tarefas;
import com.example.ListaDeTarefas.Enuns.Prioridade;
import com.example.ListaDeTarefas.Enuns.Status;

public class TarefaDTO {
	
	private Long id;
	private String Descricao;
	private String Setor;
	private LocalDate DataCadastro;
	private Status status;
	private Prioridade Prioridade;
	private Long idUsuario;
	
	public TarefaDTO() {
		
	}

	public TarefaDTO(Long id, String descricao, String setor, LocalDate dataCadastro, Status status,
		Prioridade prioridade, Long idUsuario) {
		this.id = id;
		this.Descricao = descricao;
		this.Setor = setor;
		this.DataCadastro = dataCadastro;
		this.status = status;
		this.Prioridade = prioridade;
		this.idUsuario = idUsuario;
	}
	
	public TarefaDTO(Tarefas entity) {
		id = entity.getId();
		Descricao = entity.getDescricao();
		Setor = entity.getSetor();
		DataCadastro = entity.getDataCadastro();
		status = entity.getStatus();
		Prioridade = entity.getPrioridade();
		idUsuario = entity.getUsuario().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
