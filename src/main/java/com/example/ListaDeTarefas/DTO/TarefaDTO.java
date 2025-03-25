package com.example.ListaDeTarefas.DTO;

import java.time.LocalDate;

import ch.qos.logback.core.status.Status;

public record TarefaDTO(Long Id, Long UsuarioId, String Descricao, String Setor, LocalDate DataCadastro, Status Status) {

}
