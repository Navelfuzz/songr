package com.java401d18.songr.repositories;

import com.java401d18.songr.model.Album;

import org.springframework.data.jpa.repository.JpaRepository;

//Step 4: create a repository that extends JpaRepository
public interface AlbumRepository extends JpaRepository<Album, String> {
    // default -> save(), delete(), update(), findByTitle(), findAll()

    //Step 5: add MAGIC method declarations
    public Album findByTitle(String title);
}


