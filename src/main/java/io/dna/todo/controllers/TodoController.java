package io.dna.todo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.dna.todo.entities.Todo;
import io.dna.todo.repositories.TodoRepository;

@RestController
public class TodoController {
	
	@Autowired
	private TodoRepository todoRepository;
	
	@RequestMapping("/todos")
	public List<Todo> getTodos() {
		return (List<Todo>) todoRepository.findAll();
	}
	
	@RequestMapping("/todos/{id}")
	public Optional<Todo> getTodo(@PathVariable int id) {
		return todoRepository.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/todos")
	public void addTodo(@RequestBody Todo todo) {
		todoRepository.save(todo);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/todos/{id}")
	public void updateTodo(@PathVariable int id, @RequestBody Todo todo) {
		todoRepository.save(todo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/todos/{id}")
	public void deleteTodo(@PathVariable int id) {
		todoRepository.deleteById(id);
	}
	
}
