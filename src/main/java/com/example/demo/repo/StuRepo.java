package com.example.demo.repo;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StuRepo extends JpaRepository<Student, Integer> {
    List<Student> findByStuIdAndNameAndCreatedAtIs(Integer id, String name);
}
