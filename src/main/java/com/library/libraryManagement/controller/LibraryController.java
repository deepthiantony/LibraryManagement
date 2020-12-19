package com.library.libraryManagement.controller;

import com.library.libraryManagement.model.Book;
import com.library.libraryManagement.model.Member;
import com.library.libraryManagement.service.BookService;
import com.library.libraryManagement.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibraryController {
    @Autowired
    BookService bookService;
    @Autowired
    MemberService memberService;

    //API to add books
    @PostMapping("/library-api-v1/book/add-book")
    ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book newBook = new Book();
        newBook = bookService.addBookService(book.getBookName(),book.getAuthorName(),
                book.getBookGenre());
        return ResponseEntity.ok().body(newBook);
    }

    //Resgister member
    @PostMapping("/library-api-v1/member/add-member")
    ResponseEntity<Member> addMember(@RequestBody Member member){
        Member newMember=new Member();
        newMember=memberService.addMemberService(member.getMemberName(),member.getEmailId(),member.getMemberAddress());
        return ResponseEntity.ok().body(newMember);
    }

}
