package com.liuyanan.movie.domain;

public class Movie {

	private Integer id;
	private String name;
	private String actor;
	private Integer price;
	private String playtime;
	private Integer longtime;
	private String type;
	private Integer year;
	private String area;
	private String status;
	public Movie(Integer id, String name, String actor, Integer price, String playtime, Integer longtime, String type,
			Integer year, String area, String status) {
		super();
		this.id = id;
		this.name = name;
		this.actor = actor;
		this.price = price;
		this.playtime = playtime;
		this.longtime = longtime;
		this.type = type;
		this.year = year;
		this.area = area;
		this.status = status;
	}
	public Movie() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getPlaytime() {
		return playtime;
	}
	public void setPlaytime(String playtime) {
		this.playtime = playtime;
	}
	public Integer getLongtime() {
		return longtime;
	}
	public void setLongtime(Integer longtime) {
		this.longtime = longtime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", actor=" + actor + ", price=" + price + ", playtime=" + playtime
				+ ", longtime=" + longtime + ", type=" + type + ", year=" + year + ", area=" + area + ", status="
				+ status + "]";
	}
	
	
	
}
