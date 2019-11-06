package com.liuyanan.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.liuyanan.movie.domain.Movie;
import com.liuyanan.movie.domain.Vo;

public interface MovieMapper {

	List<Movie> list(@ModelAttribute Vo vo);

	@Update("update t_movie set status=#{status} where id=#{id}")
	int update(Movie movie);

	int delAll(Integer[] ids);

}
