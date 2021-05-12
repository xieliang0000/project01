package com.zking.service.impl;

import com.zking.model.Book;
import com.zking.service.IBookService;
import com.zking.util.PageBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class BookServiceImplTest {


    @Autowired
    private IBookService bookService;
    Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void selectByPager() {
        PageBean pageBean = new PageBean();
        List<Book> books = bookService.selectByPager(pageBean);

            for (Book book1 : books) {
                System.out.println(book1);

            }
        System.out.println(pageBean.getTotal());
    }
}