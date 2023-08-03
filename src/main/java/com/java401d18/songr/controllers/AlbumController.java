package com.java401d18.songr.controllers;

import com.java401d18.songr.model.Album;
import com.java401d18.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

@Controller
public class AlbumController {
    //Step6: add an Autowired instance of repository to the controller
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String albums(Model model) {
        List<Album> albumList = albumRepository.findAll();
        model.addAttribute("albumList", albumList);
        return "albums";
    }


    @GetMapping("/add-album")
    public String getAlbumsPage() {
        return "add-album.html";
    }

    @PostMapping("/add-album")
    public RedirectView addAlbumFromForm(String title, String artist, int songCount, int length, String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }
}











//        List<Album> albumList = new ArrayList<>();
//        albumList.add(new Album("Led Zeppelin III", "Led Zeppelin", 10, (43 * 60) + 3, "https://static.qobuz.com/images/covers/17/46/0603497904617_600.jpg"));
//        albumList.add(new Album("Disraeli Gears", "Cream", 11, (33 * 60) + 2, "https://www.americanhitnetwork.com/sites/default/files/styles/show_image_700x400/public/show_images/reaction-594003-cream-front.jpg"));
//        albumList.add(new Album("And the War Came", "Shakey Graves", 11, (42 * 60) + 17, "https://www.besteveralbums.com/albumart/album_large_68554_54341699b488c.jpg"));
//
//        model.addAttribute("albumList", albumList);
//
//        return "albums";

