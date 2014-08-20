package root.service;

import java.util.ArrayList;
import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import root.meta.KhachHangMeta;
import root.model.KhachHang;

public class CustomerService {
    
    KhachHangMeta t = new KhachHangMeta();
    public void CreateUser()
    {
        List<KhachHang> list = new ArrayList<KhachHang>();
        for (int i = 0; i < 5; i++) {
            
            String k = String.valueOf(i);
            Key key = Datastore.createKey(KhachHang.class, k);
            KhachHang kh = new KhachHang();
            
            kh.setMaKhachHang(key);
            kh.setDiachi("abc");
            kh.setEmail("tan@gmail.com");
            kh.setTenkhachhang("Taan");
            kh.setPassword("12345");
        
            list.add(kh);
        }
        Datastore.put(list);
        
    }
    public List<KhachHang> getAllCustomer()
    {
        return Datastore.query(t).asList();
    }

}
