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
        try {
            logger.info("All movies");
            return movieRepository.findAll();
        } catch (Exception e) {
            logger.error(e);
        }
        return null;
    }

    public Optional<Movie> findMovieByImdbId(String imdbId) {
        try {
            logger.info("Found Movie: " + imdbId);
            return movieRepository.findMovieByImdbId(imdbId);
        } catch (Exception e) {
            logger.error(e);
        }
        return null;
    }
}

