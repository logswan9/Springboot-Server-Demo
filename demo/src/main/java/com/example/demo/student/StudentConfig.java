package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student logan = new Student(
                    "Logan",
                    LocalDate.of(1998, Month.MARCH, 16),
                    "logswan9@gmail.com"

            );

            Student marena = new Student(
                    "Marena",
                    LocalDate.of(1998, Month.NOVEMBER, 28),
                    "marequaIsLit@gmail.com"

            );

            Student hazel = new Student(
                    "Hazel",
                    LocalDate.of(2017, Month.AUGUST, 18),
                    "badBishhhh@gmail.com"

            );

            repository.saveAll(
                    List.of(logan, marena, hazel)
            );
        };
    }

}
