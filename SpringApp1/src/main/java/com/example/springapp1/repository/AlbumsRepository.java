package com.example.springapp1.repository;

import com.example.springapp1.database.Albums;
import com.example.springapp1.database.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumsRepository {
    List<Albums> findAll();

    List<Albums> albName(String name);




}
