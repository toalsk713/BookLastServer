package com.cjon.book.service;

import com.cjon.book.dao.BookDAO;

public class BookService {

	// 리스트를 가져오는 일을 하는 method
	public String getList(String keyword) {
		// 일반적인 로직처리 나와요!!
		
		// 추가적으로 DB처리가 나올 수 있어요!
		// DB처리는 Service에서 처리는하는게 아니라..다른 객체를 이용해서
		// Database처리를 하게 되죠!!
		BookDAO dao = new BookDAO();
		String result = dao.select(keyword);	
		
		return result;
	}

	public String updateBook(String isbn, String title, String author, String price) {
		
		BookDAO dao = new BookDAO();
		String result = dao.update(isbn,title,author,price);
		return result;
	}

	public boolean insertBook(String imgurl, String isbn, String title, String author, String price) {
		
		BookDAO dao = new BookDAO();
		boolean result = dao.insert(imgurl,isbn,title,author,price);
		return result;
	}

	public boolean deleteBook(String isbn) {
		
		BookDAO dao = new BookDAO();
		boolean result = dao.delete(isbn);
		return result;
	}

	public String getInfo(String isbn) {
		
		BookDAO dao = new BookDAO();
		String result = dao.info(isbn);
		return result;
	}

	public Boolean insertMember(String id, String password, String email) {
		
		BookDAO dao = new BookDAO();
		boolean result = dao.insertMem(id,password,email);
		return result;
	}

	public Boolean login(String id, String password) {
		
		BookDAO dao = new BookDAO();
		boolean result = dao.login(id,password);
		return result;
	}

	public Boolean session(String id, String password) {
	
		BookDAO dao = new BookDAO();
		boolean result = dao.session(id,password);
		return result;
	}

	public String insertComment(String isbn, String review) {
	
		BookDAO dao = new BookDAO();
		String result = dao.comment(isbn, review);
		return result;
	}

	public Boolean insertReview(String isbn, String review, String lid) {
		
		BookDAO dao = new BookDAO();
		boolean result = dao.insertReview(isbn, review, lid);
		return result;
	}

	public String printReview(String isbn) {
		
		BookDAO dao = new BookDAO();
		String result = dao.print(isbn);	
		
		return result;
	}

	public boolean deleteReview(String num) {
		
		BookDAO dao = new BookDAO();
		boolean result = dao.deleteReview(num);
		return result;
	}

	public String searchReview(String keyword) {
		
		BookDAO dao = new BookDAO();
		String result = dao.search(keyword);	
		
		return result;
	}
	

}












