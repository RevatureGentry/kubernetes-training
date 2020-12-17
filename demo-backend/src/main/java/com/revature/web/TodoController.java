package com.revature.web;

import com.revature.model.Todo;
import com.revature.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author William Gentry
 * 12/17/2020
 */
@RestController
@RequestMapping(path = "/todos")
public class TodoController {

    private final TodoRepository todoRepository;
    
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Todo>> findAll() {
        List<Todo> todos = todoRepository.findAll();
        return ResponseEntity.ok(todos);
    }
}
