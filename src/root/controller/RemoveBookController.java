package root.controller;

import java.util.ArrayList;
import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import root.model.Sach;

public class RemoveBookController extends Controller {
    List<Sach> listBook = new ArrayList();

    @Override
    public Navigation run() throws Exception {
        
        listBook = sessionScope("listbook");
        List<Sach> listNewBook = new ArrayList();
        int t = asInteger("removeBook");
        for(int i = 0 ; i<listBook.size();i++)
        {
            if(listBook.get(i).getStt() != t)
            {
               listNewBook.add(listBook.get(i));
           
            }
        }
        for(int i = 0 ; i<listNewBook.size();i++)
        {
           listNewBook.get(i).setStt(i+1);
        }
        int tongsach = sessionScope("tongsach");
        int tongtien = sessionScope("tongtien");
        sessionScope("tongsach", tongsach -asInteger("booktotal"));
        sessionScope("tongtien", tongtien -asInteger("moneytotal"));
        sessionScope("listbook", listNewBook);
        return forward("bookInvoice.jsp");
    }
}
