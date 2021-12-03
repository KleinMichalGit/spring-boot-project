package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student michal = new Student(
                "Michal",
                "kleinmichalgm@gmail.com",
                LocalDate.of(2000, 9, 22)
            );
            Student laura = new Student(
                    "Laura",
                    "laura@gmail.com",
                    LocalDate.of(2005, 9, 22)
            );
            repository.saveAll(
                    List.of(michal, laura)
            );
        };
    }
}
