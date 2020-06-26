package com.jackmccabe.gifflip.model;

import java.time.LocalDate;

public class Gif {

    private String name;
    private LocalDate dateUpLoaded;
    private String username;
    private boolean isFavorite;
    private int catergoryId;

    public Gif(String name, LocalDate dateUpLoaded, String username, boolean isFavorite, int catergoryId) {
        this.name = name;
        this.dateUpLoaded = dateUpLoaded;
        this.username = username;
        this.isFavorite = isFavorite;
        this.catergoryId = catergoryId;
    }

    public int getCatergoryId() {
        return catergoryId;
    }

    public void setCatergoryId(int catergoryId) {
        this.catergoryId = catergoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUpLoaded() {
        return dateUpLoaded;
    }

    public void setDateUpLoaded(LocalDate dateUpLoaded) {
        this.dateUpLoaded = dateUpLoaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
