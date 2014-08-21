package root.controller;

import java.util.ArrayList;
import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import root.model.LoaiSach;
import root.model.Sach;
import root.service.BookService;

import com.google.appengine.api.datastore.Key;

public class BuyController extends Controller {

    BookService bookService = new BookService();
    Sach sach = new Sach();
    List<Sach> listSach = new ArrayList();
    
    public List<Sach> getListSach() {
        return listSach;
    }

    public void setListSach(List<Sach> listSach) {
        this.listSach = listSach;
    }

    @Override
    public Navigation run() throws Exception {
        
        int soluongmua;
        try {
            
            soluongmua = asInteger("soluongmua");
            
        } catch (Exception e) {
            // TODO: handle exception
            String masach = asString("masach");
            String maloai = asString("maloai");
            
            //tìm cuốn sách có mã là biến masach
            System.out.println(masach.substring(5, 6));
            Key key = Datastore.createKey(Sach.class,Integer.parseInt(masach.substring(5, 6)));
            sach = bookService.getBook(key);
            
            //tìm tên loại của bảng LoaiSach dựa vào maloai, masach trong bảng Sach
            
            key  = Datastore.createKey(LoaiSach.class,maloai);
            String tenloai = bookService.getNameType(key);
            sach.setTenloai(tenloai);
            requestScope("error","Xin hay nhap so");
            requestScope("book", sach);
            return forward("bookDetail.jsp");
        }
        /**Biến soluongcon là số lượng còn trong kho, ta dùng để so sánh với số lượng mua để xét tính hợp lệ trong thao tác của user */
        int soluongcon = asInteger("soluongcon");
        
     // nếu số lượng mua lớn hơn số lượng của đầu sách còn trong kho hay input của user là mua không sách thì ta báo lỗi
        if(soluongmua>soluongcon || soluongmua == 0)
        {
            
            String masach = asString("masach");
            String maloai = asString("maloai");
            
            //tìm cuốn sách có mã là biến masach
            System.out.println(masach.substring(5, 6));
            Key key = Datastore.createKey(Sach.class,Integer.parseInt(masach.substring(5, 6)));
            sach = bookService.getBook(key);
            
            //tìm tên loại của bảng LoaiSach dựa vào maloai, masach trong bảng Sach
            
            key  = Datastore.createKey(LoaiSach.class,maloai);
            String tenloai = bookService.getNameType(key);
            sach.setTenloai(tenloai);
            requestScope("error","Nhap so luong mua nho hon so luong con trong kho");
            requestScope("book", sach);
            return forward("bookDetail.jsp");
        }
        
     // Tạo ra một list Book để chứa sách trong giỏ
        if(sessionScope("listbook") == null)
        {
            listSach= new ArrayList<Sach>();
        
        }
        else
        {   
            listSach = sessionScope("listbook");
        }
        
        String masach = asString("masach");

        //tìm cuốn sách có mã là biến masach
        System.out.println(masach.substring(5, 6));
        Key key = Datastore.createKey(Sach.class,Integer.parseInt(masach.substring(5, 6)));
        sach = bookService.getBook(key);
        
      //set tổng số sách đã mua và tổng số tiền mua để chuẩn bị cho vào giỏ hàng
        sach.setSoluongmua(soluongmua);
        sach.setTongtienmua(soluongmua*asInteger("giasach"));
        sach.setStt(listSach.size()+1);
        
      //cho sách vào trong listBook, listBook chính là sách trong giỏ của user 
        listSach.add(sach);
      
        int tongsach = sessionScope("tongsach");
        int tongtien= sessionScope("tongtien");
        
      //Đưa các thuộc tính này vào session
        sessionScope("tongsach", soluongmua + tongsach);
        sessionScope("tongtien", tongtien+soluongmua*asInteger("giasach"));
        sessionScope("listbook", listSach);
        
        

        return forward("bookInvoice.jsp");
    }
}
