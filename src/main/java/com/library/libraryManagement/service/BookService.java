package com.library.libraryManagement.service;

import com.library.libraryManagement.constants.Constants;
import com.library.libraryManagement.model.Book;
import com.library.libraryManagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book addBookService(String bookName,String authorName,
                String bookGenre) {
        Book newBook=new Book();
        newBook.setBookName(bookName);
        newBook.setAuthorName(authorName);
        newBook.setBookGenre(bookGenre);
        newBook.setBookGenre(Constants.newArrival);
        return bookRepository.save(newBook);
    }
}
