package root.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slim3.datastore.Datastore;

import root.meta.KhachHangMeta;
import root.model.KhachHang;


public class LoginService {

      KhachHangMeta km = new KhachHangMeta();
      public boolean CheckForm(String user, String pass)
      {
          System.out.println(user);
          System.out.println(pass);
          km = KhachHangMeta.get();
          KhachHang khachhang = new KhachHang();
          khachhang = Datastore.query(km)
                  .filter(km.tenkhachhang.equal(user),km.password.equal(pass))
                  .asSingle();
          System.out.println("====================="+(khachhang==null));      
         if(khachhang != null)
         {
             return true;
         }
         return false;
      }
      
      
}
