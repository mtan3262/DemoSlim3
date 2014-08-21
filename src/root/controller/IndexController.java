package root.controller;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import root.model.KhachHang;
import root.service.BookService;
import root.service.CustomerService;
import root.service.TypeService;

public class IndexController extends Controller {

    CustomerService customerSive = new CustomerService();
    BookService bookService = new BookService();
    TypeService typeService = new TypeService();
    
    @Override
    public Navigation run() throws Exception {
        
        
//        customerSive.CreateUser();
//        bookService.CreateListBook();
//       typeService.ListTypeBook();

        return forward("index.jsp");
    }
}
