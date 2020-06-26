package com.jackmccabe.gifflip.data;

import com.jackmccabe.gifflip.model.Gif;
import com.sun.javafx.iio.gif.GIFDescriptor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepo {


    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015,2,13), "Jack McCabe", false,1),
            new Gif("ben-and-mike", LocalDate.of(2015,10,30), "HomeBoy", true,2),
            new Gif("book-dominos", LocalDate.of(2015,9,15), "BigUp", false,1),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "Kcurtis", true,3),
            new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false,2),
            new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true,1),
            new Gif("baby-yoda", LocalDate.of(2020,3,23), "Jack", true,3),
            new Gif("yoda", LocalDate.of(2020,2,23), "Yoda", true,3),
            new Gif("yoda-eating", LocalDate.of(2020,4,23), "Baby Yoda", true,3)

    );

    public Gif findByName(String name){
        for (Gif gif: ALL_GIFS) {
            if (gif.getName().equals(name)){
                return gif;
            }

        }
        return null;
    }

    public  List<Gif> findById(int id){
        List<Gif> gifs = new ArrayList<>();
        for (Gif gif: ALL_GIFS) {
            if (gif.getCatergoryId() == id){
                gifs.add(gif);
            }

        }
        return gifs;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<Gif> findByFavoriteMark() {
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif : ALL_GIFS) {
            if(gif.isFavorite()) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    public List<Gif> findBySearch(String search) {
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif : ALL_GIFS) {
            if(gif.getName().toLowerCase().contains(search)) {
                gifs.add(gif);
            }
        }
        return gifs;
    }
}
