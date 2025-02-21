package com.notebook.noteBook.service;

import com.notebook.noteBook.model.Task;
import com.notebook.noteBook.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Optional<Task> findById(int id) {
        return taskRepository.findById(id);
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void deleteById(int id) {
        taskRepository.deleteById(id);
    }
    

}
