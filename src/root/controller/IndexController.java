package root.controller;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import root.model.KhachHang;
import root.service.CustomerService;

public class IndexController extends Controller {

    CustomerService customerSive = new CustomerService();
    @Override
    public Navigation run() throws Exception {
        
        customerSive.CreateUser();
        
        
        
       
        
        
        return forward("index.jsp");
    }
}
