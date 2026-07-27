package com.TODO.TODO.model;

import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Todos")
public class Todo_model {
    @MongoId
    private ObjectId id;
    private String title;
    private String summary;
    private String decription;
    private Status status = Status.TODO;

    public Todo_model(){

    }

    public Todo_model(String title, String summary, String decription, Status status ){
        this.title = title;
        this.summary = summary;
        this.decription = decription;
        this.status = status;
    }
    public ObjectId getID(){ return id;}
    public void setID(ObjectId id){this.id = id;}
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}

    public String  getSummary(){return summary;}
    public void setSummary(String summary){this.summary = summary;}

    public String getDecription(){return decription;}
    public void setDecription(String decription){this.decription = decription;}


    public Status getStatus(){return status;}
    public void setStatus(Status status){this.status = status;}






    

    
}
