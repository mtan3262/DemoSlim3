package root.controller;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import root.model.Sach;
import root.service.BookService;

public class GoHomeController extends Controller {
    BookService bookService = new BookService();
    public BookService getBookService() {
        return bookService;
    }
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
    @Override
    public Navigation run() throws Exception {
        List<Sach> listK = bookService.getAllBook();
        requestScope("list", listK);
        
        
         return forward("bookHome.jsp");
     
    }
}
