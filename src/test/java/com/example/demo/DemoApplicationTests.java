package com.example.demo;

import com.example.demo.repo.ClassRoomRepo;
import com.example.demo.repo.CourseInfoRepo;
import com.example.demo.repo.RepoImple;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.spy;

@ExtendWith(MockitoExtension.class)
class DemoApplicationTests {

    @Spy
    CourseInfoRepo repoImple;

    @Test
    void anhthanhngungoc(){
        repoImple.equals("!23");
    }

}
