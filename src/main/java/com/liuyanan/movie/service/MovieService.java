package com.liuyanan.movie.service;

import java.util.List;

import com.liuyanan.movie.domain.Movie;
import com.liuyanan.movie.domain.Vo;

public interface MovieService {

	List<Movie> list(Vo vo);

	int update(Movie movie);

	int delAll(Integer[] ids);

}
