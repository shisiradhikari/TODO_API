package com.TODO.TODO.service;

//import org.bson.types.ObjectId;
//import org.springframework.aot.hint.annotation.ReflectiveRuntimeHintsRegistrar;
import org.springframework.stereotype.Service;
import com.TODO.TODO.repository.todo_repository;
import com.TODO.TODO.model.*;
import java.util.List;

@Service
public class Todo_service {
    private final todo_repository todo_repository;
    public Todo_service(todo_repository todo_repository){
        this.todo_repository = todo_repository;
    }
    //Return only 
    public List<Todo_model> getall()
    {
        return todo_repository.findAll();

    }

    // Return only a specific status

    public List<Todo_model> getByStatus(Status status){
        return todo_repository.findByStatus(status);
    }

    // Return only Todo  and doing;
    public List<Todo_model> getActive() {
    return todo_repository.findByStatusIn(
        List.of(Status.TODO, Status.DOING)
    );
}

    public Todo_model create(Todo_model todo){
        if(todo.getStatus() == null){
            todo.setStatus(Status.TODO);
        }

        return todo_repository.save(todo);
    }

    public Todo_model updateStatus(String id, Status newStatus) {
        Todo_model todo = todo_repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Todo not found"));

        todo.setStatus(newStatus);
        return todo_repository.save(todo);
}




    
}
