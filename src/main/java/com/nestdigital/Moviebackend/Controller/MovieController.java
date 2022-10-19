package com.nestdigital.Moviebackend.Controller;


import com.nestdigital.Moviebackend.Model.MovieModel;
import com.nestdigital.Moviebackend.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addMovie", consumes = "application/json", produces = "applications/json")
    public String Addmovie(@RequestBody MovieModel movie) {
        System.out.println(movie.toString());
        dao.save(movie);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewmovies")
    public List<MovieModel>viewmovies(){
        return (List<MovieModel>) dao.findAll();
    }

}

