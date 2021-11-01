package com.example.springapp1.repository;


import com.example.springapp1.database.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository {
    List<Artist> findAll();

    List<Artist> findByCountry(String country);

    List<Artist> findByGenre(String genre);

    List<Artist> findByLabels(String labels);

    List<Artist> flipList();
}

