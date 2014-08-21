package root.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-08-21 11:21:45")
/** */
public final class SachMeta extends org.slim3.datastore.ModelMeta<root.model.Sach> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.Sach> date = new org.slim3.datastore.StringAttributeMeta<root.model.Sach>(this, "date", "date");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.Sach, java.lang.Integer> giasach = new org.slim3.datastore.CoreAttributeMeta<root.model.Sach, java.lang.Integer>(this, "giasach", "giasach", int.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<root.model.Sach, org.slim3.datastore.ModelRef<root.model.LoaiSach>, root.model.LoaiSach> loaisachRef = new org.slim3.datastore.ModelRefAttributeMeta<root.model.Sach, org.slim3.datastore.ModelRef<root.model.LoaiSach>, root.model.LoaiSach>(this, "loaisachRef", "loaisachRef", org.slim3.datastore.ModelRef.class, root.model.LoaiSach.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.Sach> maloai = new org.slim3.datastore.StringAttributeMeta<root.model.Sach>(this, "maloai", "maloai");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.Sach, com.google.appengine.api.datastore.Key> masach = new org.slim3.datastore.CoreAttributeMeta<root.model.Sach, com.google.appengine.api.datastore.Key>(this, "__key__", "masach", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.Sach> ngaycapnhat = new org.slim3.datastore.StringAttributeMeta<root.model.Sach>(this, "ngaycapnhat", "ngaycapnhat");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.Sach, java.lang.Integer> soluong = new org.slim3.datastore.CoreAttributeMeta<root.model.Sach, java.lang.Integer>(this, "soluong", "soluong", int.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.Sach> tacgia = new org.slim3.datastore.StringAttributeMeta<root.model.Sach>(this, "tacgia", "tacgia");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.Sach> tensach = new org.slim3.datastore.StringAttributeMeta<root.model.Sach>(this, "tensach", "tensach");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.Sach, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<root.model.Sach, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final SachMeta slim3_singleton = new SachMeta();

    /**
     * @return the singleton
     */
    public static SachMeta get() {
       return slim3_singleton;
    }

    /** */
    public SachMeta() {
        super("Sach", root.model.Sach.class);
    }

    @Override
    public root.model.Sach entityToModel(com.google.appengine.api.datastore.Entity entity) {
        root.model.Sach model = new root.model.Sach();
        model.setDate((java.lang.String) entity.getProperty("date"));
        model.setGiasach(longToPrimitiveInt((java.lang.Long) entity.getProperty("giasach")));
        if (model.getLoaisachRef() == null) {
            throw new NullPointerException("The property(loaisachRef) is null.");
        }
        model.getLoaisachRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("loaisachRef"));
        model.setMaloai((java.lang.String) entity.getProperty("maloai"));
        model.setMasach(entity.getKey());
        model.setNgaycapnhat((java.lang.String) entity.getProperty("ngaycapnhat"));
        model.setSoluong(longToPrimitiveInt((java.lang.Long) entity.getProperty("soluong")));
        model.setTacgia((java.lang.String) entity.getProperty("tacgia"));
        model.setTensach((java.lang.String) entity.getProperty("tensach"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        root.model.Sach m = (root.model.Sach) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getMasach() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getMasach());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("date", m.getDate());
        entity.setProperty("giasach", m.getGiasach());
        if (m.getLoaisachRef() == null) {
            throw new NullPointerException("The property(loaisachRef) must not be null.");
        }
        entity.setProperty("loaisachRef", m.getLoaisachRef().getKey());
        entity.setProperty("maloai", m.getMaloai());
        entity.setProperty("ngaycapnhat", m.getNgaycapnhat());
        entity.setProperty("soluong", m.getSoluong());
        entity.setProperty("tacgia", m.getTacgia());
        entity.setProperty("tensach", m.getTensach());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        root.model.Sach m = (root.model.Sach) model;
        return m.getMasach();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        root.model.Sach m = (root.model.Sach) model;
        m.setMasach(key);
    }

    @Override
    protected long getVersion(Object model) {
        root.model.Sach m = (root.model.Sach) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        root.model.Sach m = (root.model.Sach) model;
        if (m.getLoaisachRef() == null) {
            throw new NullPointerException("The property(loaisachRef) must not be null.");
        }
        m.getLoaisachRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        root.model.Sach m = (root.model.Sach) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        root.model.Sach m = (root.model.Sach) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getDate() != null){
            writer.setNextPropertyName("date");
            encoder0.encode(writer, m.getDate());
        }
        writer.setNextPropertyName("giasach");
        encoder0.encode(writer, m.getGiasach());
        if(m.getLoaisachRef() != null && m.getLoaisachRef().getKey() != null){
            writer.setNextPropertyName("loaisachRef");
            encoder0.encode(writer, m.getLoaisachRef(), maxDepth, currentDepth);
        }
        if(m.getMaloai() != null){
            writer.setNextPropertyName("maloai");
            encoder0.encode(writer, m.getMaloai());
        }
        if(m.getMasach() != null){
            writer.setNextPropertyName("masach");
            encoder0.encode(writer, m.getMasach());
        }
        if(m.getNgaycapnhat() != null){
            writer.setNextPropertyName("ngaycapnhat");
            encoder0.encode(writer, m.getNgaycapnhat());
        }
        writer.setNextPropertyName("soluong");
        encoder0.encode(writer, m.getSoluong());
        writer.setNextPropertyName("soluongmua");
        encoder0.encode(writer, m.getSoluongmua());
        writer.setNextPropertyName("stt");
        encoder0.encode(writer, m.getStt());
        if(m.getTacgia() != null){
            writer.setNextPropertyName("tacgia");
            encoder0.encode(writer, m.getTacgia());
        }
        if(m.getTenloai() != null){
            writer.setNextPropertyName("tenloai");
            encoder0.encode(writer, m.getTenloai());
        }
        if(m.getTensach() != null){
            writer.setNextPropertyName("tensach");
            encoder0.encode(writer, m.getTensach());
        }
        writer.setNextPropertyName("tongtienmua");
        encoder0.encode(writer, m.getTongtienmua());
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected root.model.Sach jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        root.model.Sach m = new root.model.Sach();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("date");
        m.setDate(decoder0.decode(reader, m.getDate()));
        reader = rootReader.newObjectReader("giasach");
        m.setGiasach(decoder0.decode(reader, m.getGiasach()));
        reader = rootReader.newObjectReader("loaisachRef");
        decoder0.decode(reader, m.getLoaisachRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("maloai");
        m.setMaloai(decoder0.decode(reader, m.getMaloai()));
        reader = rootReader.newObjectReader("masach");
        m.setMasach(decoder0.decode(reader, m.getMasach()));
        reader = rootReader.newObjectReader("ngaycapnhat");
        m.setNgaycapnhat(decoder0.decode(reader, m.getNgaycapnhat()));
        reader = rootReader.newObjectReader("soluong");
        m.setSoluong(decoder0.decode(reader, m.getSoluong()));
        reader = rootReader.newObjectReader("soluongmua");
        m.setSoluongmua(decoder0.decode(reader, m.getSoluongmua()));
        reader = rootReader.newObjectReader("stt");
        m.setStt(decoder0.decode(reader, m.getStt()));
        reader = rootReader.newObjectReader("tacgia");
        m.setTacgia(decoder0.decode(reader, m.getTacgia()));
        reader = rootReader.newObjectReader("tenloai");
        m.setTenloai(decoder0.decode(reader, m.getTenloai()));
        reader = rootReader.newObjectReader("tensach");
        m.setTensach(decoder0.decode(reader, m.getTensach()));
        reader = rootReader.newObjectReader("tongtienmua");
        m.setTongtienmua(decoder0.decode(reader, m.getTongtienmua()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}