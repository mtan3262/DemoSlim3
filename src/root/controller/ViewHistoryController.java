package root.controller;

import java.util.ArrayList;
import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import root.model.HoaDon;
import root.service.CustomerService;
import root.service.InvoiceService;

public class ViewHistoryController extends Controller {

    List<HoaDon >hoadon= new ArrayList();
    InvoiceService invoiceService = new InvoiceService();
    CustomerService customerService = new CustomerService();
    
    @Override
    public Navigation run() throws Exception {
        
        /**Biến tenKhach lấy tên của người dùng để có thể lấy được lịch sử mua sắm của người đó*/
        String tenKhach = sessionScope("user");
        
        /**Lấy tất cả các hóa đơn của user có tên trong biến tenKhach và lưu trong list invoiceDto*/
        hoadon = invoiceService.getByCodeCustomer(customerService.getCodeCustomer(tenKhach));
        
        //đưa list này và request để show cho người dùng
        requestScope("history", hoadon);
       return forward("bookHistory.jsp");
    }
}
