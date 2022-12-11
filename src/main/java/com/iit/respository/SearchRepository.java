package com.iit.respository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iit.dto.journalIssueDto;
import com.iit.model.Book;
import com.iit.model.Journal;
import com.iit.model.JournalIssue;
import com.iit.model.Member;

@Repository
public interface SearchRepository extends JpaRepository<Book, Integer>{

	
	@Query(value = "SELECT * FROM book b WHERE b.id in (SELECT ba.book_id FROM book_author ba WHERE ba.author_id in (SELECT a.id FROM author a WHERE a.first_name = ?1));", nativeQuery = true)
	public List<Book> SearchBookByAuthor(String author);
	
	@Query(value = "SELECT * FROM book b WHERE b.title Like %?1%", nativeQuery = true)
	public List<Book> SearchBookByTitle(String title);

	
	@Query(value = "select * from journal_issue where id in (SELECT id FROM journal_article WHERE id IN (SELECT journal_article_id FROM journal_article_author WHERE author_id = (SELECT id FROM author WHERE first_name = '?1')));", nativeQuery = true)
	public List<journalIssueDto> SearchJournalByAuthor(String author);
	
	@Query(value = "SELECT id,publication_date,title FROM journal_issue WHERE title Like %?1%", nativeQuery = true)
	public List<journalIssueDto> SearchJournalByTitle(String title);
}
