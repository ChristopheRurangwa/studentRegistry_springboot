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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Chries=new Student("Chries ru", "mydo23erc@yeahoo.com", LocalDate.of(2000, Month.FEBRUARY,5));
            Student Marieam=new Student( "Maeriam", "mydoc@yahoo.com", LocalDate.of(2004, Month.FEBRUARY,5));


            repository.saveAll(List.of(Marieam, Chries));
        };


    }
}
