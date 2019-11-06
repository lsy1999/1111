package com.liuyanan.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuyanan.movie.domain.Movie;
import com.liuyanan.movie.domain.Vo;
import com.liuyanan.movie.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping("list")
	public ModelAndView list(@RequestParam(defaultValue = "1")Integer pageNum,Vo vo) {
		ModelAndView mv = new ModelAndView("list");
		PageHelper.startPage(pageNum, 3);
		if(vo.getOrderMethod()==null) {
			vo.setOrderMethod("asc");
		}
		System.out.println(vo);
		mv.addObject("vo", vo);
		List<Movie> list=movieService.list(vo);
		PageInfo<Movie> page = new PageInfo<Movie>(list);
		mv.addObject("page", page);
		
		return mv;
	}
	
	@RequestMapping("update.do")
	@ResponseBody
	public String udpate(Movie movie) {
		int num=movieService.update(movie);
		if(num>0) {
			return "true";
		}
		return "";
	}
	
	@RequestMapping("delAll.do")
	@ResponseBody
	public String delAll(@RequestParam("ids")Integer[] ids) {
		int num=movieService.delAll(ids);
		if(num>0) {
			return "true";
		}
		return "";
	}
}
