package com.java401d18.songr.controllers;

import com.java401d18.songr.model.Album;
import com.java401d18.songr.model.Song;
import com.java401d18.songr.repositories.AlbumRepository;
import com.java401d18.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    private final AlbumRepository albumRepository;
    private final SongRepository songRepository;


    @Autowired
    public AlbumController(AlbumRepository albumRepository, SongRepository songRepository) {
        this.albumRepository = albumRepository;
        this.songRepository = songRepository;
    }


    @GetMapping("/albums")
    public String albums(Model model) {
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "albums.html";
    }

    @GetMapping("/addAlbum")
    public String addAlbumForm(Model model) {
        model.addAttribute("album", new Album());
        return "addAlbum.html";
    }



    @PostMapping("/addAlbum")
    public String addAlbumSubmit(@ModelAttribute Album album) {
        albumRepository.save(album);
        return "redirect:/albums";
    }


    //lab 13
    @GetMapping("/songs")
    public String songs(Model model) {
        List<Song> songs = songRepository.findAll();
        model.addAttribute("songs", songs);
        return "songs.html";
    }

    @GetMapping("/{id}")
    public String getAlbum(Model model, @PathVariable Long id) {
        Album album = albumRepository.getById(id);
        model.addAttribute("album", album);
        return "albums";
    }

    @PostMapping("/addAlbum/{id}")
    public RedirectView addSongToAlbum(
            @PathVariable Long id,
            String title,
            int songLength,
            int trackNumber
    ) {
        Album album = albumRepository.findById(id).orElse(null);
        if (album != null) {
            Song song = new Song(title, songLength, trackNumber, album);
            songRepository.save(song);
        }
        return new RedirectView("/albums/" + id);
    }
}
