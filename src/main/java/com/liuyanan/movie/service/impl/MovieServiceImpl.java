package com.liuyanan.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyanan.movie.dao.MovieMapper;
import com.liuyanan.movie.domain.Movie;
import com.liuyanan.movie.domain.Vo;
import com.liuyanan.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieMapper movieMapper;
	@Override
	public List<Movie> list(Vo vo) {
		return movieMapper.list(vo);
	}
	@Override
	public int update(Movie movie) {
		return movieMapper.update(movie);
	}
	@Override
	public int delAll(Integer[] ids) {
		return movieMapper.delAll(ids);
	}

}
