package com.TODO.TODO.repository;
import com.TODO.TODO.model.Todo_model;
import com.TODO.TODO.model.Status;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface todo_repository extends MongoRepository<Todo_model, String > {
    //Get only items with a specific status
    List<Todo_model> findByStatus(Status status);

    List<Todo_model> findByStatusIn(List<Status> statuses);  

    
}
