package com.cjon.book.service;

import com.cjon.book.dao.RentalDAO;

public class RentalService {

	public String getList(String keyword) {
		RentalDAO dao = new RentalDAO();
		return dao.select(keyword);
	}

	public Boolean rentBook(String isbn, String id) {
		RentalDAO dao = new RentalDAO();
		return dao.update(isbn, id);
	}

	public Boolean returnBook(String isbn, String id) {
		RentalDAO dao = new RentalDAO();
		return dao.update2(isbn, id);
	}

	public String getMyList(String id) {
		RentalDAO dao = new RentalDAO();
		return dao.select2(id);
	}

}
