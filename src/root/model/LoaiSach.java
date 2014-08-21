package root.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelRef;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class LoaiSach implements Serializable {

    private static final long serialVersionUID = 1L;

    //field of "LoaiSach" entity
    @Attribute(primaryKey = true)
    private Key maloai;
    private String tenloai;
    
    /**Foreign key with "Sach" entity*/
    @Attribute(persistent = false)
    private InverseModelRef<Sach, LoaiSach> loaisachRef = new InverseModelRef<Sach, LoaiSach>(Sach.class,"loaisachRef" ,this);
    
    
    public InverseModelRef<Sach, LoaiSach> getLoaisachRef() {
        return loaisachRef;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }

    public Key getMaloai() {
        return maloai;
    }

    public void setMaloai(Key maloai) {
        this.maloai = maloai;
    }

    @Attribute(version = true)
    private Long version;

   

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
        result = prime * result + ((maloai == null) ? 0 : maloai.hashCode());
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
        LoaiSach other = (LoaiSach) obj;
        if (maloai == null) {
            if (other.maloai != null) {
                return false;
            }
        } else if (!maloai.equals(other.maloai)) {
            return false;
        }
        return true;
    }
}
