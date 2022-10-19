package com.nestdigital.Moviebackend.dao;

import com.nestdigital.Moviebackend.Model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<MovieModel,Integer> {
}
