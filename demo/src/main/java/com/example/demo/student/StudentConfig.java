package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student kurtis = new Student(
                    "Kurtis",
                    "kurtis@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)

            );

            Student bradley = new Student(
                    "Bradley",
                    "bradley@gmail.com",
                    LocalDate.of(2005, SEPTEMBER, 5)

            );

            repository.saveAll(
                    List.of(kurtis, bradley)
            );
        };
    }
}