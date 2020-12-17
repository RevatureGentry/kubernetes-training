package com.revature;

import com.revature.model.Todo;
import com.revature.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoBackendApplication {

	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoBackendApplication.class, args);
	}

	// VERY CHEAP
	// PLEASE DON'T DO THIS 'IN REAL LIFE'
	// SIMPLY FOR EXAMPLE's PURPOSE
	@PostConstruct
	public void init() {
		Todo todo = new Todo();
		todo.setTitle("Our first todo!");

		todoRepository.save(todo);
	}

}
