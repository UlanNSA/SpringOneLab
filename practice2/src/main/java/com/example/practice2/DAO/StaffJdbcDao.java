package com.example.practice2.DAO;


import com.example.practice2.Staff;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StaffJdbcDao {

    private JdbcTemplate jdbcTemplate;

    public StaffJdbcDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Staff> getAllStaff(){
        String sql = "SELECT * FROM STAFF";
        return jdbcTemplate.query(sql,((rs, rowNum) -> {
            Staff st1 = new Staff();
            st1.setStaff_id(rs.getInt("staff_id"));
            st1.setFirst_name(rs.getString("first_name"));
            st1.setLast_name(rs.getString("last_name"));
            st1.setPhone_number(rs.getInt("phone_number"));
            st1.setAge(rs.getInt("age"));
            st1.setStuff_type(rs.getString("stuff_type"));
            st1.setSalary(rs.getInt("salary"));
            return  st1;

        }));
    };
}
