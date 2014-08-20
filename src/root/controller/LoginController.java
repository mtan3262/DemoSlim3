package root.controller;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import root.model.KhachHang;
import root.service.CustomerService;
import root.service.LoginService;

public class LoginController extends Controller {
   
    private LoginService loginService  = new LoginService();;
    private CustomerService customerSive = new CustomerService();
    @Override
    public Navigation run() throws Exception {

        //goi parameter
        String user = asString("username");
        String pass = asString("password");
        
        if(loginService.CheckForm(user,pass))
          {
            List<KhachHang> listK = customerSive.getAllCustomer();
            requestScope("list", listK);
             return forward("success.jsp");
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
