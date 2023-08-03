package com.java401d18.songr.repositories;

import com.java401d18.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    // default -> save(), delete(), update(), findAll()

    public Album findByTitle(String title);


}