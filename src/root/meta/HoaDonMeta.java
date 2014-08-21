package root.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-08-21 09:38:35")
/** */
public final class HoaDonMeta extends org.slim3.datastore.ModelMeta<root.model.HoaDon> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.HoaDon> makhachhang = new org.slim3.datastore.StringAttributeMeta<root.model.HoaDon>(this, "makhachhang", "makhachhang");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.HoaDon> ngayxuat = new org.slim3.datastore.StringAttributeMeta<root.model.HoaDon>(this, "ngayxuat", "ngayxuat");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.HoaDon, com.google.appengine.api.datastore.Key> sohoadon = new org.slim3.datastore.CoreAttributeMeta<root.model.HoaDon, com.google.appengine.api.datastore.Key>(this, "__key__", "sohoadon", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.HoaDon, java.lang.Integer> tongtien = new org.slim3.datastore.CoreAttributeMeta<root.model.HoaDon, java.lang.Integer>(this, "tongtien", "tongtien", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.HoaDon, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<root.model.HoaDon, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final HoaDonMeta slim3_singleton = new HoaDonMeta();

    /**
     * @return the singleton
     */
    public static HoaDonMeta get() {
       return slim3_singleton;
    }

    /** */
    public HoaDonMeta() {
        super("HoaDon", root.model.HoaDon.class);
    }

    @Override
    public root.model.HoaDon entityToModel(com.google.appengine.api.datastore.Entity entity) {
        root.model.HoaDon model = new root.model.HoaDon();
        model.setMakhachhang((java.lang.String) entity.getProperty("makhachhang"));
        model.setNgayxuat((java.lang.String) entity.getProperty("ngayxuat"));
        model.setSohoadon(entity.getKey());
        model.setTongtien(longToPrimitiveInt((java.lang.Long) entity.getProperty("tongtien")));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        root.model.HoaDon m = (root.model.HoaDon) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getSohoadon() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getSohoadon());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("makhachhang", m.getMakhachhang());
        entity.setProperty("ngayxuat", m.getNgayxuat());
        entity.setProperty("tongtien", m.getTongtien());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        root.model.HoaDon m = (root.model.HoaDon) model;
        return m.getSohoadon();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        root.model.HoaDon m = (root.model.HoaDon) model;
        m.setSohoadon(key);
    }

    @Override
    protected long getVersion(Object model) {
        root.model.HoaDon m = (root.model.HoaDon) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        root.model.HoaDon m = (root.model.HoaDon) model;
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
        root.model.HoaDon m = (root.model.HoaDon) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getMakhachhang() != null){
            writer.setNextPropertyName("makhachhang");
            encoder0.encode(writer, m.getMakhachhang());
        }
        if(m.getNgayxuat() != null){
            writer.setNextPropertyName("ngayxuat");
            encoder0.encode(writer, m.getNgayxuat());
        }
        if(m.getSohoadon() != null){
            writer.setNextPropertyName("sohoadon");
            encoder0.encode(writer, m.getSohoadon());
        }
        writer.setNextPropertyName("tongtien");
        encoder0.encode(writer, m.getTongtien());
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected root.model.HoaDon jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        root.model.HoaDon m = new root.model.HoaDon();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("makhachhang");
        m.setMakhachhang(decoder0.decode(reader, m.getMakhachhang()));
        reader = rootReader.newObjectReader("ngayxuat");
        m.setNgayxuat(decoder0.decode(reader, m.getNgayxuat()));
        reader = rootReader.newObjectReader("sohoadon");
        m.setSohoadon(decoder0.decode(reader, m.getSohoadon()));
        reader = rootReader.newObjectReader("tongtien");
        m.setTongtien(decoder0.decode(reader, m.getTongtien()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}