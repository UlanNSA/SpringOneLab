package com.example.springapp1.repository;

import com.example.springapp1.database.Albums;
import com.example.springapp1.database.Artist;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
@Repository
@Component
public class AlbumRepositoryImpl implements AlbumsRepository{
    @Override
    public List<Albums> findAll() {
        return Albums.getAlbums();
    }

    @Override
    public List<Albums> albName(String name) {
        List<Albums>albums = Albums.getAlbums();
        return albums.stream().filter(s->s.getAlbName().equals(name)).collect(Collectors.toList());
    }


}

