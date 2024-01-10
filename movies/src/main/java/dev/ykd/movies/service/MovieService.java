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
        System.out.println(env);
        String path1 = env.getProperty("sprint.data.mongodb.uri");
        System.out.println(path1);
        String path2 = env.getProperty("spring.data.mongodb.database");
        System.out.println(path2);
        return movieRepository.findAll();
    }
}
