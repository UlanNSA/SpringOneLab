package com.example.practice3.bootstrap;

import com.example.practice3.Staff;
import com.example.practice3.repository.StaffRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final StaffRep staffRep;

    public BootstrapData(StaffRep staffRep) {
        this.staffRep = staffRep;
    }

    @Override
    public void run(String... args) throws Exception {
        Staff st1 = new Staff(
                null, "Lola", "Bunny", 18,8077785,"Maid", 50000
        );
        staffRep.save(st1);
    }
}
