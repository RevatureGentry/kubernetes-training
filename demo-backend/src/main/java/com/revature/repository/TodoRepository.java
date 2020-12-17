package com.revature.repository;

import com.revature.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author William Gentry
 * 12/17/2020
 */
public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
