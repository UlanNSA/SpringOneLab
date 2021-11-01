package com.example.springapp1.service;


import com.example.springapp1.database.Artist;
import com.example.springapp1.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;
    @Autowired
    public ArtistService(ArtistRepository artistRepository){
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAll(){
        return artistRepository.findAll();
    }

    public List<Artist> getCountry(String country){
        return artistRepository.findByCountry(country);
    }

    public List<Artist> getGenre(String genre){
        return artistRepository.findByGenre(genre);
    }

    public List<Artist> getLabel(String labels){
        return artistRepository.findByLabels(labels);
    }

    public List<Artist> flipList(){
        return artistRepository.flipList();
    }

}
