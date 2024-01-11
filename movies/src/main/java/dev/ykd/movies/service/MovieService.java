package dev.ykd.movies.service;

import dev.ykd.movies.model.Movie;
import dev.ykd.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private Environment env;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
