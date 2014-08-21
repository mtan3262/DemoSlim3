package root.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slim3.datastore.Datastore;

import root.meta.HoaDonMeta;
import root.model.HoaDon;

import com.google.appengine.api.datastore.Key;

public class InvoiceService {
    
    public void CreateInvoice(int mahoadon, String makhachhang, int tongtien)
    {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date today = Calendar.getInstance().getTime(); 
        HoaDon hd = new HoaDon();
        Key key = Datastore.createKey(HoaDon.class, mahoadon);
        hd.setSohoadon(key);
        hd.setMakhachhang(makhachhang);
        hd.setNgayxuat(df.format(today));
        hd.setTongtien(tongtien);
        Datastore.put(hd);
    }
    
    public List<HoaDon> getByCodeCustomer(String code)
    {
        List<HoaDon> hdlist = new ArrayList();
        HoaDonMeta hdm = new HoaDonMeta();
        hdlist = Datastore.query(hdm).filter(hdm.makhachhang.equal(code)).asList();
         
                return hdlist;       
    }
    public List<HoaDon> getTotal()
    {
        List<HoaDon> hdlist = new ArrayList();
        HoaDonMeta hdm = new HoaDonMeta();
        hdlist = Datastore.query(hdm).asList();
         
                return hdlist;       
    }

}
