package com.java401d18.songr.repositories;

import com.java401d18.songr.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {

    public Song findByTitle(String title);
}