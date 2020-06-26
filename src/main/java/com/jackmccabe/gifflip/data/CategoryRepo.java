package com.jackmccabe.gifflip.data;

import com.jackmccabe.gifflip.model.Category;
import com.jackmccabe.gifflip.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepo {

    private static final List<Category> ALL_CATEGORY = Arrays.asList(
          new Category(1, "Tech"),
          new Category(2, "People"),
          new Category(3, "Destruction")
    );

    public List<Category> getAllCategory(){
        return ALL_CATEGORY;
    }

    public Category findById(int id){
        for (Category cat: ALL_CATEGORY) {
            if (cat.getId() == id){
                return cat;
            }
        }
        return null;
    }
}
