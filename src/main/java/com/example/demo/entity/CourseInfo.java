package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "course_info")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseInfo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseInfoId;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

}
