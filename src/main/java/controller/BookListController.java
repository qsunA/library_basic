package controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import service.BookListServiceImpl;

public class BookListController {

    private static final Logger logger = LoggerFactory.getLogger(BookListController.class);

    @Autowired
    private BookListServiceImpl bookListServiceImpl;


}
