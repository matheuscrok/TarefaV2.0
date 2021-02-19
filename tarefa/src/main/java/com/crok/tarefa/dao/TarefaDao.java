package com.crok.tarefa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crok.tarefa.model.Tarefa;

@Repository
public interface TarefaDao extends JpaRepository<Tarefa, Integer> {

}
