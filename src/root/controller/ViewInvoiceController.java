package root.controller;

import java.util.ArrayList;
import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import root.model.Sach;

public class ViewInvoiceController extends Controller {

    List<Sach> listBook = new ArrayList();
    @Override
    public Navigation run() throws Exception {
        
        if(sessionScope("listbook")==null)
        {
            System.out.println("List book null");
            listBook = new ArrayList<Sach>();
            
        }
        else
        {
            listBook = sessionScope("listbook");
            
        }
        sessionScope("listbook", listBook);
        return forward("bookInvoice.jsp");
    }
}
