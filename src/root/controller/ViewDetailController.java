package root.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import root.model.LoaiSach;
import root.model.Sach;
import root.service.BookService;

public class ViewDetailController extends Controller {
    
    BookService bookService = new BookService();
    Sach sach = new Sach();
    
    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public Navigation run() throws Exception {
        
     
        String masach = requestScope("masach");
        String maloai = requestScope("maloai");
        
        //tìm cuốn sách có mã là biến masach
        System.out.println(masach.substring(5, 6));
        Key key = Datastore.createKey(Sach.class,Integer.parseInt(masach.substring(5, 6)));
        sach = bookService.getBook(key);
        
        //tìm tên loại của bảng LoaiSach dựa vào maloai, masach trong bảng Sach
        
        key  = Datastore.createKey(LoaiSach.class,maloai);
        String tenloai = bookService.getNameType(key);
        sach.setTenloai(tenloai);
        requestScope("error","van con hang");
        requestScope("book", sach);
        
        System.out.println("======FINISH=========");
        return forward("bookDetail.jsp");
    }
}
