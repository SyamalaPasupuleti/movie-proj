package com.project.movie.repository;

import com.project.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByMovieNameContaining(String name);

    List<Movie> findByTitleContainingIgnoreCase(String title);
}
