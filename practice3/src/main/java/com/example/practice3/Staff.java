package com.example.practice3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long staff_id;
    private String first_name;
    private String last_name;
    private int phone_number;
    private int age;
    private String stuff_type;
    private int salary;
}
