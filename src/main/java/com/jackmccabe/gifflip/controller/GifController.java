package com.jackmccabe.gifflip.controller;

import com.jackmccabe.gifflip.data.GifRepo;
import com.jackmccabe.gifflip.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepo gifRepo;

    @RequestMapping("/")
    public String listOfGifs(ModelMap model){
        List<Gif> allGifs = gifRepo.getAllGifs();
        model.put("gifs", allGifs);
        return "index";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap ){
        Gif gif = gifRepo.findByName(name);
                modelMap.put("gif", gif);
        return "gif-details";
    }

    @RequestMapping("/favorites")
    public String listFavorites(ModelMap modelMap) {
        List<Gif> gifs = gifRepo.findByFavoriteMark();
        modelMap.put("gifs", gifs);
        return "favorites";
    }

    @RequestMapping(value="/", params="q")
    public String listSearch(@RequestParam("q") String q, ModelMap modelMap) {
        List<Gif> gifs= gifRepo.findBySearch(q);
        modelMap.put("gifs", gifs);
        return "index";
    }






}
