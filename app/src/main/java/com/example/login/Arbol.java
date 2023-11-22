package com.example.login;

public class Arbol {
    String image;
    String title;
    String overview;

    public Arbol(String image, String title, String overview) {
        this.image = image;
        this.title = title;
        this.overview = overview;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }
}

