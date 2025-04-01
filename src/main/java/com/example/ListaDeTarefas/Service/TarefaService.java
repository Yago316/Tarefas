package com.example.ListaDeTarefas.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ListaDeTarefas.DTO.TarefaDTO;
import com.example.ListaDeTarefas.Entities.Tarefas;
import com.example.ListaDeTarefas.Entities.Usuario;
import com.example.ListaDeTarefas.Enuns.Prioridade;
import com.example.ListaDeTarefas.Enuns.Status;
import com.example.ListaDeTarefas.Repository.TarefaRepository;
import com.example.ListaDeTarefas.Repository.UsuarioRepository;

@Service
public class TarefaService {

	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository; // O repositoty ele e Responsavel por busca os Dados no Banco
	
	
	public TarefaDTO salvarTarefa(TarefaDTO dto) {
		
		Tarefas tarefa = new Tarefas();
		tarefa.setDescricao(dto.getDescricao());
		tarefa.setSetor(dto.getSetor());
		tarefa.setPrioridade(Prioridade.BAIXA);
		tarefa.setDataCadastro(LocalDate.now()); // lOCALDATE ele guarda a Data, Hora em tempo real
		tarefa.setStatus(Status.A_FAZER);
		
		Usuario user = usuarioRepository.getReferenceById(dto.getIdUsuario());
		
		tarefa.setUsuario(user);
		
		tarefa = tarefaRepository.save(tarefa);
		
		return new TarefaDTO(tarefa);
	}
	
	public List<Tarefas> mostrarTarefa(){
		
		List<Tarefas> tarefas = tarefaRepository.findAll();
		return tarefas;
	}
}
