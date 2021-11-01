package com.example.practice3.repository;

import com.example.practice3.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface StaffRep extends JpaRepository<Staff, Long> {

}
