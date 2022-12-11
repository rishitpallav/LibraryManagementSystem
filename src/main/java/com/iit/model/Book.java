package com.iit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	private int id;
	private String title;
	private int edition;
	private int year;
	
	@ManyToOne(targetEntity = Publisher.class)
	@JoinColumn(name = "book_publisher_fk", referencedColumnName = "id")
	Publisher publisher;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "BOOK_AUTHOR",
		joinColumns = {
				@JoinColumn(name = "book_id", referencedColumnName = "id")
		},
		inverseJoinColumns = {
				@JoinColumn(name = "author_id", referencedColumnName = "id")
		}
	)
	private List<Author> authors;

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

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

}
