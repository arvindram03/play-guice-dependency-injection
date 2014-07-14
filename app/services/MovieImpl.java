package services;


import models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieImpl implements MovieService {
    @Override
    public List<models.Movie> getMovies() {
        List<Movie> movieList = new ArrayList<Movie>();

        Movie movie = new Movie("Kochadayaan");
        movieList.add(movie);
        return movieList;
    }
}
