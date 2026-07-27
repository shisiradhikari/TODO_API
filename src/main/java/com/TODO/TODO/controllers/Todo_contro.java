package com.TODO.TODO.controllers;
import com.TODO.TODO.model.*;
import com.TODO.TODO.service.*;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class Todo_contro {
    private final Todo_service todo_service;
    public Todo_contro(Todo_service todo_service){
        this.todo_service = todo_service;
    }

    @GetMapping
    public List<Todo_model> getAll(){
        return todo_service.getall();
    }

    @GetMapping("/status/{status}")
    public List<Todo_model> getByStatus(@PathVariable Status status){
        return todo_service.getActive();

    }

    @PostMapping
    public Todo_model create(@RequestBody Todo_model todo){
        return todo_service.create(todo);
    }

    @PutMapping("/{id}/status/{status}")
    public Todo_model updatestatus(@PathVariable String id, @PathVariable Status status){
        return todo_service.updateStatus(id, status);
    }


    
}
