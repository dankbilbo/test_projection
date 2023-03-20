package com.example.demo.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CriteriaProjection {
    @Autowired
    EntityManager entityManager;

    public List<StudentProjection> test(){
        List<StudentProjection> studentProjectionList = new ArrayList<>();
        Query query = entityManager.createNamedQuery("getStudentProjection");
        return studentProjectionList;
    }
}
