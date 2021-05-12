package com.zking.mybaits01.model;

public class Book {
    private Integer bookId;

    private String bookName;

    private Float price;

    private Long img;

    public Book(Integer bookId, String bookName, Float price, Long img) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.img = img;
    }

    public Book() {
        super();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getImg() {
        return img;
    }

    public void setImg(Long img) {
        this.img = img;
    }
}