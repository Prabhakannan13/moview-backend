package com.nestdigital.Moviebackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieModel {
    @Id
    @GeneratedValue
    private int id;
    private String moviename;
    private String releaseyear;
    private String language;

    public MovieModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(String releaseyear) {
        this.releaseyear = releaseyear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public MovieModel(int id, String moviename, String releaseyear, String language) {
        this.id = id;
        this.moviename = moviename;
        this.releaseyear = releaseyear;
        this.language = language;
    }
}

