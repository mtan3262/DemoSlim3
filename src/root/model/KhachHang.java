package root.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class KhachHang implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    @Attribute(primaryKey = true)
    private Key maKhachHang;

    @Attribute(version = true)
    private Long version;
    
    private String tenkhachhang;
    private String password;
    private String diachi;
    private String Email;

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getVersion() {
        return version;
    }

    public Key getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Key maKhachHang) {
        this.maKhachHang = maKhachHang;
    }


    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maKhachHang == null) ? 0 : maKhachHang.hashCode());
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
        KhachHang other = (KhachHang) obj;
        if (maKhachHang == null) {
            if (other.maKhachHang != null) {
                return false;
            }
        } else if (!maKhachHang.equals(other.maKhachHang)) {
            return false;
        }
        return true;
    }
}
