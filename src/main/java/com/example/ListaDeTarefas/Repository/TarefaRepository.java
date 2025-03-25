package com.example.ListaDeTarefas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ListaDeTarefas.Entities.Tarefas;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefas, Long> {

}
