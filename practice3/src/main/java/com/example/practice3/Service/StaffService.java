package com.example.practice3.Service;

import com.example.practice3.Staff;
import com.example.practice3.repository.StaffRep;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffService {

    public final StaffRep staffRep;

    public StaffService(StaffRep staffRep) {
        this.staffRep = staffRep;
    }

    public List<Staff> getList(){
        return staffRep.findAll();
    }
}
