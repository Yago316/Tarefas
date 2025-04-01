package com.example.ListaDeTarefas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ListaDeTarefas.DTO.TarefaDTO;
import com.example.ListaDeTarefas.Entities.Tarefas;
import com.example.ListaDeTarefas.Service.TarefaService;

@Controller
@RequestMapping("/Tarefa")
@RestController
public class TarefaController {
	
	@Autowired
	TarefaService tarefaService;
	
	@PostMapping
	public ResponseEntity<TarefaDTO> criarTarefa(@Validated @RequestBody TarefaDTO dto){
		dto = tarefaService.salvarTarefa(dto);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<Tarefas>> mostrarTarefa(){
		return ResponseEntity.ok(tarefaService.mostrarTarefa());
	}
}
