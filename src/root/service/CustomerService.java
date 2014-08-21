package root.service;

import java.util.ArrayList;
import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import root.meta.KhachHangMeta;
import root.meta.SachMeta;
import root.model.KhachHang;
import root.model.Sach;

public class CustomerService {
    
    KhachHangMeta t = new KhachHangMeta();
    
    public void CreateUser()
    {
       
        String k = String.valueOf(1);
        Key key = Datastore.createKey(KhachHang.class, k);
        KhachHang kh = new KhachHang(); 
        kh.setMaKhachHang(key);
        kh.setDiachi("abc");
        kh.setEmail("tan@gmail.com");
        kh.setTenkhachhang("abc");
        kh.setPassword("123");
        Datastore.put(kh);
        
    }
    public List<KhachHang> getAllCustomer()
    {
        return Datastore.query(t).asList();
    }
    
    public String  getCodeCustomer(String name)
    {
        KhachHang kh = new KhachHang();
       KhachHangMeta khm = new KhachHangMeta();
       kh = Datastore.query(khm).filter(khm.tenkhachhang.equal(name)).asSingle();
       return String.valueOf(kh.getMaKhachHang());
    }
    
   

}
