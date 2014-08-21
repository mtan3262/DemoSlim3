package root.controller;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import root.model.Sach;
import root.service.BookService;
import root.service.CustomerService;
import root.service.InvoiceService;

public class UpdateController extends Controller {
    
    InvoiceService invoiceService = new InvoiceService();
    BookService bookService = new BookService();
    CustomerService customerService = new CustomerService();
    List<Sach> listBook = new ArrayList();
   List< Sach> book = new ArrayList();
    @Override
    public Navigation run() throws Exception {
        
      //Lấy các dữ liệu từ session xuống để chuẩn bị insert một hóa đơn mới
          book =sessionScope("listbook");
        String user = sessionScope("user");
        int tongtien = sessionScope("tongtien");
        
        //tien hanh update sach
        for (int i = 0; i < book.size(); i++) {
            
            bookService.UpdateBook(book.get(i).getMasach(), book.get(i).getSoluongmua());
            
        }
       
     // Set lại các session sau khi đã thanh toán xong
        listBook = new ArrayList<Sach>();
        sessionScope("tongsach", 0);
        sessionScope("tongtien", 0);
        sessionScope("listbook", listBook);
        
      //Insert hoa don vao database
        invoiceService.CreateInvoice(invoiceService.getTotal().size()+1, customerService.getCodeCustomer(user), tongtien);
        
        return forward("BookFinish.jsp");
    }
}
