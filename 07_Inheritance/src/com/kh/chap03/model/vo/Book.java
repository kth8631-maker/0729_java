package com.kh.chap03.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	
	public Book() {}
	public Book(String title, String publisher, String author, int price) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public String publisher() {
		return publisher;
	}
	public String author() {
		return author;
	}
	public int price() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String information() {
		return "책정보 [책 제목 : " + title
				+", 출판사 : " + publisher
				+", 저자 : " + author
				+", 가격 : " + price + "]";
	}
}
