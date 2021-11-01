package com.example.practice2;

import com.example.practice2.DAO.StaffJdbcDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Practice2Application {

    private static StaffJdbcDao staffJdbcDao;

    public Practice2Application(StaffJdbcDao staffJdbcDao) {
        this.staffJdbcDao = staffJdbcDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(Practice2Application.class, args);
        List<Staff> list = staffJdbcDao.getAllStaff();
        list.forEach(System.out::println);


    }

}
