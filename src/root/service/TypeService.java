package root.service;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import root.meta.LoaiSachMeta;
import root.model.LoaiSach;


public class TypeService {

    LoaiSachMeta l = new LoaiSachMeta();
    
    public void CreateTypeBook(String maloai, String tenloai)
    {
   
       Key key = Datastore.createKey(LoaiSach.class, maloai);
       LoaiSach ls = new LoaiSach();
       ls.setMaloai(key);
       ls.setTenloai(tenloai);
       Datastore.put(ls);
       
    }
    
    public void ListTypeBook()
    {
        CreateTypeBook("stn", "sach thieu nhi");
        CreateTypeBook("skt", "sach kinh te");
        CreateTypeBook("scn", "sach cong nghe");
        CreateTypeBook("snn", "sach ngoai ngu");
        
    }
}
