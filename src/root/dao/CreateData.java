package root.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slim3.datastore.Datastore;
import com.google.appengine.api.ThreadManager;
import root.model.Sach;

import com.google.appengine.api.datastore.Key;

public class CreateData {

    /**Tao co so du lieu cho bang sach*/
    private static void CreateBook()
    {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date today = Calendar.getInstance().getTime(); 

        List<Sach> list = new ArrayList<Sach>();
        int masach = 1;
        Key key = Datastore.createKey(Sach.class, masach);
        Sach s = new Sach();
        s.setMasach(key);
        s.setDate(df.format(today));
        s.setGiasach(50000);
        s.setMaloai("stn");
        s.setSoluong(3);
        s.setTacgia("To Hoai");
        s.setTensach("De Men Phieu Luu Ky");
        Datastore.put(s);
        masach = 2;
        key = Datastore.createKey(Sach.class, masach);
        s = new Sach();
        s.setMasach(key);
        s.setDate(df.format(today));
        s.setGiasach(70000);
        s.setMaloai("stn");
        s.setSoluong(5);
        s.setTacgia("To Hoai");
        s.setTensach("De Men Phieu Luu Ky 2");
        Datastore.put(s);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            CreateBook();
            System.out.println("Tao thanh cong");
        } catch (Exception e) {
            System.out.println("Loi" + e);
            // TODO: handle exception
        }

    }


}
