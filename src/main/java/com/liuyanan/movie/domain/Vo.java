package com.liuyanan.movie.domain;

public class Vo {

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
	
	//排序方法：升序 降序
	private String orderMethod;
	//排序字段
	private String orderField;
	
	//查询条件
	private String startTime;
	private String endTime;
	
	private Integer startPrice;
	private Integer endPrice;
	
	private Integer startLong;
	private Integer endLong;
	public Vo(Integer id, String name, String actor, Integer price, String playtime, Integer longtime, String type,
			Integer year, String area, String status, String orderMethod, String orderField, String startTime,
			String endTime, Integer startPrice, Integer endPrice, Integer startLong, Integer endLong) {
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
		this.orderMethod = orderMethod;
		this.orderField = orderField;
		this.startTime = startTime;
		this.endTime = endTime;
		this.startPrice = startPrice;
		this.endPrice = endPrice;
		this.startLong = startLong;
		this.endLong = endLong;
	}
	public Vo() {
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
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	public String getOrderField() {
		return orderField;
	}
	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(Integer startPrice) {
		this.startPrice = startPrice;
	}
	public Integer getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(Integer endPrice) {
		this.endPrice = endPrice;
	}
	public Integer getStartLong() {
		return startLong;
	}
	public void setStartLong(Integer startLong) {
		this.startLong = startLong;
	}
	public Integer getEndLong() {
		return endLong;
	}
	public void setEndLong(Integer endLong) {
		this.endLong = endLong;
	}
	@Override
	public String toString() {
		return "Vo [id=" + id + ", name=" + name + ", actor=" + actor + ", price=" + price + ", playtime=" + playtime
				+ ", longtime=" + longtime + ", type=" + type + ", year=" + year + ", area=" + area + ", status="
				+ status + ", orderMethod=" + orderMethod + ", orderField=" + orderField + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", startPrice=" + startPrice + ", endPrice=" + endPrice + ", startLong="
				+ startLong + ", endLong=" + endLong + "]";
	}
	
	
}
