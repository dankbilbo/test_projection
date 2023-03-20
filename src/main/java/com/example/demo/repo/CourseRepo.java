package com.example.demo.repo;

import com.example.demo.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {

    Page<Course> findAllByStudentIdInAndDe(Integer studentId, Pageable pageable);
}
