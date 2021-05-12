package com.zking.mybaits01.service;

import com.zking.mybaits01.model.Book;

import java.util.List;

public interface IBookService {

    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> listBook(Book book);

    List<Book>  listBookByPage();
}