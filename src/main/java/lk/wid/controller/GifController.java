package lk.wid.controller;

import lk.wid.repository.GifRepository;
import lk.wid.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/")
    public String listGifs(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifRepository.getAllGifs());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.findByName(name);
        modelMap.addAttribute("gif", gif);
        return "gif-details";
    }

    @GetMapping("/favorites")
    public String gifFavorites(ModelMap modelMap) {
        modelMap.addAttribute("gifs",gifRepository.getFavorites());
        return "favorites";
    }

    @GetMapping("/search")
    public String gifSearch(@RequestParam("q") String name, ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifRepository.findByName(name));
        return "search";
    }
}
