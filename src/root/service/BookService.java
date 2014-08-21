package root.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slim3.datastore.Datastore;

import root.meta.LoaiSachMeta;
import root.meta.SachMeta;
import root.model.LoaiSach;
import root.model.Sach;

import com.google.appengine.api.datastore.Key;



public class BookService {
    
    SachMeta s = new SachMeta();
    LoaiSachMeta ls = new LoaiSachMeta();
    public void CreateBook(int masach, int giasach, String maloai, int soluong,String tacgia, String tensach)
    {
        
        //Tao loai sach 
        
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date today = Calendar.getInstance().getTime(); 
        Key key = Datastore.createKey(Sach.class, masach);
        Sach s = new Sach();
        s.setMasach(key);
        s.setDate(df.format(today));
        s.setGiasach(giasach);
        s.setMaloai(maloai);
        s.setSoluong(soluong);
        s.setTacgia(tacgia);
        s.setTensach(tensach);
        Datastore.put(s);
      
    }
    public void CreateListBook()
    {
        CreateBook(1, 50000,"stn", 100, "to hoai","De men phieu luu ki");
        CreateBook(2, 23000,"stn", 100, "nguyen nhat anh","Chuc mot ngay tot lanh");
        CreateBook(3, 20000,"skt", 100, "tim sanders","Hom nay ta giau co");
        CreateBook(4, 55000,"snn", 100, "ken baum","Tu duy kinh doanh vuot troi");
        CreateBook(5, 99000,"snn", 100, "mark","Finish TOIEC RC");
        CreateBook(6, 45000,"scn", 100, "mark","Finish TOIEC LC");
        CreateBook(7, 12000,"scn", 100, "Joel Murach","Lap trinh PHP & MySQL");
        CreateBook(8, 45000,"skt", 100, "Stuve Suehring","JavaScript");
        
    }
    public List<Sach> getAllBook()
    {
       
        return Datastore.query(s).asList();
    }
    
   public String getNameType(Key maloai)
   {
       //lay ten loai cua
       LoaiSach ls = Datastore.get(LoaiSach.class,maloai);
  //     Sach s = ls.getLoaisachRef().getModel();
       
       return ls.getTenloai();
   }
   
   public Sach getBook(Key masach)
   {
    
       Sach sach = new Sach();
    
      sach = Datastore.get(Sach.class, masach);

       return sach;
   }
   
   public void UpdateBook(Key masach, int soluongmua)
   {
       SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
       Date today = Calendar.getInstance().getTime(); 
       Sach sach = Datastore.get(Sach.class,masach);
       sach.setDate(df.format(today));
       sach.setSoluong(sach.getSoluong()-soluongmua);
       Datastore.put(sach);
   }
}
