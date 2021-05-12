package com.zking.mybaits01.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.mybaits01.mapper.BookMapper;
import com.zking.mybaits01.model.Book;
import com.zking.mybaits01.service.IBookService;
import com.zking.mybaits01.util.MybatisSessionFactoryUtils;
import com.zking.mybaits01.util.PageBean;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookServiceImplTest {

    Book book;
    IBookService bookService;

    SqlSession sqlSession;
    @Before
    public void setUp() throws Exception {
        book = new Book();
//        System.out.println("########"+12);
        sqlSession = MybatisSessionFactoryUtils.openSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        BookServiceImpl bookServiceImpl = new BookServiceImpl();
        bookServiceImpl.setBookMapper(mapper);
        this.bookService = bookServiceImpl;

    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void listBook() {
        book.setBookName("西游记");
        List<Book> books = bookService.listBook(book);
        for (Book book1 : books) {
            System.out.println(book1);
        }

//         book.setBookName("格列佛游记");
//         book.setPrice(63f);
//         book.setImg(1234l);
//        int insert = bookService.insert(book);
//        System.out.println(insert);

    }

    @Test
    public void listBookByPager() {
        PageBean  pageBean =new PageBean();
        if(null!=pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }

        List<Book> books = this.bookService.listBookByPage();

        for (Book book1 : books) {
            System.out.println(books);
        }

        PageInfo pageInfo = new PageInfo(books);
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getPageSize());

    }
}