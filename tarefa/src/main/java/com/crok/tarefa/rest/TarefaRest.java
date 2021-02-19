package com.crok.tarefa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crok.tarefa.dao.TarefaDao;
import com.crok.tarefa.model.Tarefa;

@RestController
@RequestMapping("/vai")
public class TarefaRest {

	@Autowired
	private TarefaDao tarefaDao;
	
	
	@GetMapping
	public List<Tarefa> get(){
		return tarefaDao.findAll();
	}
	
	
	@PostMapping
	public void post(@RequestBody Tarefa tarefa ) {
		tarefaDao.save(tarefa);
	}
	
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		tarefaDao.deleteById(id);
	}
	
	
	
}
