package dev.kinyua.movies;

<<<<<<< HEAD
import org.bson.types.ObjectId;
=======
>>>>>>> e18ff8c84ca1d4d17baa6fc52125d2aba26d3807
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> e18ff8c84ca1d4d17baa6fc52125d2aba26d3807

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
<<<<<<< HEAD
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
=======
>>>>>>> e18ff8c84ca1d4d17baa6fc52125d2aba26d3807
}
