package io.dna.todo.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.dna.todo.entities.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer>{

}
