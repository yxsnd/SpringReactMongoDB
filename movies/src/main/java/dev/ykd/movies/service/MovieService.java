package dev.ykd.movies.service;

import dev.ykd.movies.model.Movie;
import dev.ykd.movies.repository.MovieRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private Environment env;

    private static Logger logger = LogManager.getLogger(MovieService.class);

    public List<Movie> getAllMovies() {

        logger.info("All movies");
        return movieRepository.findAll();

    }

    public Optional<Movie> findMovieByImdbId(String imdbId) {
        logger.info("Found Movie: " + imdbId);
        return movieRepository.findMovieByImdbId(imdbId);

    }
}

