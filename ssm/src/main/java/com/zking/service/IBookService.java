package com.zking.service;

import com.zking.model.Book;
import com.zking.util.PageBean;


import java.util.List;


public interface IBookService {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> selectByPager(PageBean pageBean);

}