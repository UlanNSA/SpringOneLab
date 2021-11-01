package com.example.springapp1;

import com.example.springapp1.database.Albums;
import com.example.springapp1.database.Artist;
import com.example.springapp1.service.AlbumService;
import com.example.springapp1.service.ArtistService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.mockito.Mockito.*;

class SpringApp1ApplicationTest {
    @Mock
    ArtistService serviceArt;
    @Mock
    AlbumService serviceAlb;
    @InjectMocks
    SpringApp1Application springApp1Application;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMain() {
        when(serviceArt.getAll()).thenReturn(Arrays.<Artist>asList(new Artist()));
        when(serviceArt.getCountry(anyString())).thenReturn(Arrays.<Artist>asList(new Artist()));
        when(serviceArt.getGenre(anyString())).thenReturn(Arrays.<Artist>asList(new Artist()));
        when(serviceArt.getLabel(anyString())).thenReturn(Arrays.<Artist>asList(new Artist()));
        when(serviceArt.flipList()).thenReturn(Arrays.<Artist>asList(new Artist()));
        when(serviceAlb.getAll()).thenReturn(Arrays.<Albums>asList(new Albums()));
        when(serviceAlb.getByName(anyString())).thenReturn(Arrays.<Albums>asList(new Albums()));

        SpringApp1Application.main(new String[]{"args"});
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme