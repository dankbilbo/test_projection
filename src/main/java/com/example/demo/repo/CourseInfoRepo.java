package com.example.demo.repo;

import com.example.demo.entity.CourseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseInfoRepo extends JpaRepository<CourseInfo, Integer>{
}
