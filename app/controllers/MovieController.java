package controllers;


import models.Movie;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.MovieImpl;

import java.util.List;

public class MovieController extends Controller {

    public static Result getMovies() {

        MovieImpl movieImpl = new MovieImpl();
        List<Movie> movieList = movieImpl.getMovies();
        return ok(Json.toJson(movieList));
    }
}
