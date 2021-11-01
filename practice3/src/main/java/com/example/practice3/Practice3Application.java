package com.example.practice3;

import com.example.practice3.repository.StaffRep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Practice3Application {

    private static StaffRep staffRep;

    public Practice3Application(StaffRep staffRep) {
        this.staffRep = staffRep;
    }

    public static void main(String[] args) {
        SpringApplication.run(Practice3Application.class, args);
        List<Staff> list = staffRep.findAll();
        list.forEach(System.out::println);
    }

}
