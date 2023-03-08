package dev.kinyua.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
        Optional<Movie> findMovieByImdbId(String imdbId);
=======
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
>>>>>>> e18ff8c84ca1d4d17baa6fc52125d2aba26d3807
}
