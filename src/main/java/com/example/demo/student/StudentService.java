package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "mariam",
                        "asishbeniya@gmail.com",

                        LocalDate.of(2000, Month.APRIL, 5),

                        21

                )
        );
    }
}
