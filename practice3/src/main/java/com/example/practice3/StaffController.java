package com.example.practice3;


import com.example.practice3.Service.StaffService;
import com.example.practice3.repository.StaffRep;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffController {


private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @RequestMapping("/staff")
 public List<Staff> getStaff(){
        return staffService.getList();
 }
}
