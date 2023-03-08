package dev.kinyua.movies;

<<<<<<< HEAD
import org.bson.types.ObjectId;
=======
>>>>>>> e18ff8c84ca1d4d17baa6fc52125d2aba26d3807
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> e18ff8c84ca1d4d17baa6fc52125d2aba26d3807

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
<<<<<<< HEAD
    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId),
                HttpStatus.OK);
=======
>>>>>>> e18ff8c84ca1d4d17baa6fc52125d2aba26d3807
    }
}
