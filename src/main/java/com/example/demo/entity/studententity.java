package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class studententity{

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Name is not valid")
    private String name;

    @Email(message = "Email format is not valid")
    private String email;
    public long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    
    public String name(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String email(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public studententity(){

    }
    public studententity(long id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

}