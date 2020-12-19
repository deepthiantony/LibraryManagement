package com.library.libraryManagement.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    Long memberId;
    @Column(name = "member_name")
    String memberName;
    @Column(name = "member_address")
    String memberAddress;
    @Column(name = "email_id")
    String emailId;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "book_id")
//    List<Book> book;

    public Member() {
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

//    public List<Book> getBook() {
//        return book;
//    }
//
//    public void setBook(List<Book> book) {
//        this.book = book;
//    }
}
