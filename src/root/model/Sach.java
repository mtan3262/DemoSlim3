package root.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModelRef;

@Model(schemaVersion = 1)
public class Sach implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key masach;
    
    /**Foreign Key with "LoaiSach" table*/
    private ModelRef<LoaiSach> loaisachRef = new ModelRef<LoaiSach>(LoaiSach.class);
    
    
    public ModelRef<LoaiSach> getLoaisachRef() {
        return loaisachRef;
    }
    @Attribute(persistent = false)
    private int  soluongmua;
    @Attribute(persistent = false)
    private int  stt;
    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    @Attribute(persistent = false)
    private int tongtienmua;
    @Attribute(persistent = false)
    private String tenloai;
    public int getSoluongmua() {
        return soluongmua;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }

    public int getTongtienmua() {
        return tongtienmua;
    }

    public void setTongtienmua(int tongtienmua) {
        this.tongtienmua = tongtienmua;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }
    private String tensach;
    private String maloai;
    private String tacgia;
    private int giasach;
    private int soluong;
    private String date;
    private String ngaycapnhat;
    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getGiasach() {
        return giasach;
    }

    public void setGiasach(int giasach) {
        this.giasach = giasach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(String ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    @Attribute(version = true)
    private Long version;


    public Key getMasach() {
        return masach;
    }

    public void setMasach(Key masach) {
        this.masach = masach;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((masach == null) ? 0 : masach.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Sach other = (Sach) obj;
        if (masach == null) {
            if (other.masach != null) {
                return false;
            }
        } else if (!masach.equals(other.masach)) {
            return false;
        }
        return true;
    }

}
