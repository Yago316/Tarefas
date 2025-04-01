package com.example.ListaDeTarefas.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ListaDeTarefas.DTO.UsuarioDTO;
import com.example.ListaDeTarefas.Entities.Usuario;
import com.example.ListaDeTarefas.Repository.UsuarioRepository;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public UsuarioDTO salvar(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
		usuario.setNome(dto.getNome());
		//o Set ele Modificar os Atributos passandos do usuario
		usuario.setEmail(dto.getEmail());
		usuario = usuarioRepository.save(usuario);
		return new UsuarioDTO(usuario);
	}
}
