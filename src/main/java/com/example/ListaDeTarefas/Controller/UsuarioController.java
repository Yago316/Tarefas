package com.example.ListaDeTarefas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ListaDeTarefas.DTO.UsuarioDTO;
import com.example.ListaDeTarefas.Repository.UsuarioRepository;


@Controller
@RequestMapping("/Usuario")
public class UsuarioController {

	@Autowired
	UsuarioRepository repo;
	
	@PostMapping
	public ResponseEntity<UsuarioDTO> insert(@RequestBody UsuarioDTO cadas){
		cadas = repo.insert(cadas);
		return ResponseEntity.ok(cadas);
	}
	
}
