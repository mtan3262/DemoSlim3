package root.service;

import javax.servlet.http.HttpServletRequest;


public class LoginService {

      
      public boolean CheckForm(String user, String pass)
      {
         
          
          if(user.equals(pass))
          {
              return true;
          }
          return false;
      }
}
