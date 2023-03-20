package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "student")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SqlResultSetMapping(
        name = "studentProjection",
        classes={
                @ConstructorResult(
                        targetClass=StudentProjection.class,
                        columns={
                                @ColumnResult(name="totalStudents"),
                                @ColumnResult(name="id")})})
@NamedNativeQuery(name = "getStudentProjection",
        query = "SELECT count(*) as totalStudents, stu_id as id  FROM student group by stu_id",
        resultSetMapping = "studentProjection")
public class Student {
    @Id
    @Column(name = "stu_id")
    private Integer stuId;

    @Id
    @Column(name = "student_name")
    private String name;

    private Date createdAt;

    @Column(name = "join_time")
    private Date joinTime;


}
