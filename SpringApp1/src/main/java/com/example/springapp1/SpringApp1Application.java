package com.example.springapp1;

import com.example.springapp1.database.Albums;
import com.example.springapp1.database.Artist;
import com.example.springapp1.repository.ArtistRepository;
import com.example.springapp1.repository.ArtistRepositoryImpl;
import com.example.springapp1.service.AlbumService;
import com.example.springapp1.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Optional;

@SpringBootApplication
public class SpringApp1Application {

    private static ArtistService serviceArt;
    @Autowired
    public void setService(ArtistService service){
        SpringApp1Application.serviceArt = service;
    }

    private static AlbumService serviceAlb;
    @Autowired
    public void setService(AlbumService serviceAlb){
        SpringApp1Application.serviceAlb = serviceAlb;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringApp1Application.class, args);
        serviceArt.getAll().forEach(System.out::println);
        System.out.println("--------------------------------------");
        serviceArt.getCountry("USA").forEach(System.out::println);
        System.out.println("--------------------------------------");
        serviceArt.getGenre("synth-pop").forEach(System.out::println);
        System.out.println("--------------------------------------");
        serviceArt.getLabel("MOLDANAZAR").forEach(System.out::println);
        System.out.println("--------------------------------------");
        serviceArt.flipList().forEach(System.out::println);
        System.out.println("--------------------------------------");
        serviceAlb.getAll().forEach(System.out::println);
        System.out.println("--------------------------------------");
        serviceAlb.getByName("Hot Fuss").forEach(System.out::println);


    }

}


