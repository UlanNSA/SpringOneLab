package com.example.practice2;

import com.example.practice2.DAO.StaffJdbcDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.mockito.Mockito.*;

class Practice2ApplicationTest {
    @Mock
    StaffJdbcDao staffJdbcDao;
    @InjectMocks
    Practice2Application practice2Application;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMain() {
        when(staffJdbcDao.getAllStaff()).thenReturn(Arrays.<Staff>asList(new Staff()));

        Practice2Application.main(new String[]{"args"});
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme