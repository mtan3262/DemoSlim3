package root.controller;

import java.util.List;





import javax.servlet.http.HttpServletRequest;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestLocator;

import root.model.KhachHang;
import root.model.Sach;
import root.service.BookService;
import root.service.CustomerService;
import root.service.LoginService;


public class LoginController extends Controller {
   
    private LoginService loginService  = new LoginService();;
    private CustomerService customerSive = new CustomerService();
    private BookService bookService = new BookService();
   

    @Override
    public Navigation run() throws Exception {

        //goi parameter
        
        String user = asString("username");
        String pass = asString("password");
     //  System.out.println("==================="+bookService.getNameType("stn"));
        if(loginService.CheckForm(user,pass)  || sessionScope("user")!= null)
          {
         // Khi đã nhập đúng ta khởi tạo các session
          
            
            sessionScope("listbook", null);
            sessionScope("user",user);
            sessionScope("tongtien", 0);
            sessionScope("tongsach", 0);
       
            List<Sach> listK = bookService.getAllBook();
            requestScope("list", listK);
            
            
             return forward("bookHome.jsp");
          }
        return forward("index.jsp");
    }
    
    public LoginService getLoginService() {
        return loginService;
    }


    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
    
}
