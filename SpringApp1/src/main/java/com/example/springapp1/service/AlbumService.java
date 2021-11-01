package com.example.springapp1.service;

import com.example.springapp1.database.Albums;
import com.example.springapp1.database.Artist;
import com.example.springapp1.repository.AlbumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class AlbumService{
    private final AlbumsRepository albumsRepository;
    @Autowired
    public AlbumService(AlbumsRepository albumsRepository) {
        this.albumsRepository = albumsRepository;
    }

    public List<Albums> getAll(){
        return albumsRepository.findAll();
    }

    public List<Albums> getByName(String name){

        return albumsRepository.albName(name);
    }


}
