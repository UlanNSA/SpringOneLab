package com.example.springapp1.repository;
import com.example.springapp1.database.Artist;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Component
public class ArtistRepositoryImpl implements ArtistRepository{
    private ArtistRepository artistRepository;
    @Override
    public List<Artist> findAll() {
        return Artist.getArtist();
    }

    @Override
    public List<Artist> findByCountry(String country) {
        List<Artist>artists = Artist.getArtist();
        return artists.stream().filter(s->s.getCountry().equals(country)).collect(Collectors.toList());
    }

    @Override
    public List<Artist> findByGenre(String genre) {
        List<Artist>artists = Artist.getArtist();
        return artists.stream().filter(s->s.getGenre().equals(genre)).collect(Collectors.toList());
    }

    @Override
    public List<Artist> findByLabels(String labels) {
        List<Artist>artists = Artist.getArtist();
        return artists.stream().filter(s->s.getLabels().equals(labels)).collect(Collectors.toList());
    }

    @Override
    public List<Artist> flipList() {
        List<Artist>artists = Artist.getArtist();
        return artists.stream().sorted(Comparator.comparingDouble(Artist::getArtistId).reversed()).collect(Collectors.toList());
    }

}
