package com.notebook.noteBook.controller;

import com.notebook.noteBook.model.Task;
import com.notebook.noteBook.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> findAll() {
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> findById(@PathVariable int id) {
        return taskService.findById(id);
    }

    //Create a task
    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping
    public Task create(@RequestBody Task task) {
        return taskService.save(task);
    }

    //Update a task
    @PutMapping
    public Task update(@RequestBody Task task) {
        return taskService.save(task);
    }

    //Delete a task
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        taskService.deleteById(id);
    }




}
