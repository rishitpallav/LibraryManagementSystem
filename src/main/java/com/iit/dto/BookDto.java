package com.iit.dto;

public class BookDto {
	private int id;
	private String title;
	private int edition;
	private int year;
	private int book_publisher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(int book_publisher) {
		this.book_publisher = book_publisher;
	}
}
