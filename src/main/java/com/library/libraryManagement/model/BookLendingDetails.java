package com.library.libraryManagement.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "lending_details")
public class BookLendingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lending_id")
    Long lendindId;
    @Column(name = "lending_time")
    Date lendingTime;
    @Column(name = "returned_time")
    Date returnedTime;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    Book book;

    public BookLendingDetails() {
    }

    public Long getLendindId() {
        return lendindId;
    }

    public void setLendindId(Long lendindId) {
        this.lendindId = lendindId;
    }

    public Date getLendingTime() {
        return lendingTime;
    }

    public void setLendingTime(Date lendingTime) {
        this.lendingTime = lendingTime;
    }

    public Date getReturnedTime() {
        return returnedTime;
    }

    public void setReturnedTime(Date returnedTime) {
        this.returnedTime = returnedTime;
    }
}
