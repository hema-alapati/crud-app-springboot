package com.example.repository;

import com.example.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

//    add methods
//    List<Task> findByTitle(String title);

//you don't need to add methods from TaskService to the TaskRepository.
// The repository's primary purpose is to handle basic CRUD (Create, Read, Update, Delete) operations for Task entity.
// These operations are already provided by the JpaRepository interface, which I'm extending.
// we can use the repository's existing methods for basic database operations.
}
