package com.jackmccabe.gifflip.controller;

import com.jackmccabe.gifflip.data.CategoryRepo;
import com.jackmccabe.gifflip.data.GifRepo;
import com.jackmccabe.gifflip.model.Category;
import com.jackmccabe.gifflip.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CatergroryController {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private GifRepo gifRepo;

    @RequestMapping("/categories")
    public String getAllCategories(ModelMap modelMap){
        List<Category> allCat = categoryRepo.getAllCategory();
        modelMap.put("categories", allCat);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap){
        Category category = categoryRepo.findById(id);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepo.findById(id);
        modelMap.put("gifs", gifs);

        return "category";
    }

}
