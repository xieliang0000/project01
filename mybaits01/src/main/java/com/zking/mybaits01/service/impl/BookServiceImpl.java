package com.zking.mybaits01.service.impl;

import com.zking.mybaits01.mapper.BookMapper;
import com.zking.mybaits01.model.Book;
import com.zking.mybaits01.service.IBookService;

import java.util.List;

public class BookServiceImpl implements IBookService {
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer bookId) {
        return 0;
    }

    @Override
    public int insert(Book record) {

        return bookMapper.insert(record);
    }

    @Override
    public int insertSelective(Book record) {
        return 0;
    }

    @Override
    public Book selectByPrimaryKey(Integer bookId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return 0;
    }

    @Override
    public List<Book> listBook(Book book) {
        return bookMapper.listBook(book);
    }

    @Override
    public List<Book> listBookByPage() {
        return bookMapper.listBookByPage();
    }
}
