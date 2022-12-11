package com.iit.respository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iit.model.Book;
import com.iit.model.Member;

@Repository
public interface SearchRepository extends JpaRepository<Book, Integer>{

	
	@Query(value = "SELECT * FROM book b WHERE b.id in (SELECT ba.book_id FROM book_author ba WHERE ba.author_id in (SELECT a.id FROM author a WHERE a.first_name = ?1));", nativeQuery = true)
	public List<Book> SearchBookByAuthor(String author);
	
	@Query(value = "SELECT * FROM book b WHERE b.title Like %?1%", nativeQuery = true)
	public List<Book> SearchBookByTitle(String title);
}
