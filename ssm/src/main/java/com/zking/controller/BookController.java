package com.zking.controller;

import com.zking.model.Book;
import com.zking.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @ModelAttribute
    public void init(Model model){

        Book book = new Book();
        model.addAttribute("book",book);
    }


    @RequestMapping(value = "/bookadd")
    public String bookAdd(Book book){
        bookService.insert(book);
        return "index";
    }

    @RequestMapping(value = "/toAdd")
    public String bookadd(Book book){


        return "book/bookAdd";
    }
}
