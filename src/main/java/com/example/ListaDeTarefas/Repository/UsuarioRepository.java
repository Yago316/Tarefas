package com.example.ListaDeTarefas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ListaDeTarefas.DTO.UsuarioDTO;
import com.example.ListaDeTarefas.Entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	UsuarioDTO insert(UsuarioDTO cadas);

}
