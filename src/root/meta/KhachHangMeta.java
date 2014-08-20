package root.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-08-19 16:31:40")
/** */
public final class KhachHangMeta extends org.slim3.datastore.ModelMeta<root.model.KhachHang> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.KhachHang> Email = new org.slim3.datastore.StringAttributeMeta<root.model.KhachHang>(this, "Email", "Email");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.KhachHang> diachi = new org.slim3.datastore.StringAttributeMeta<root.model.KhachHang>(this, "diachi", "diachi");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.KhachHang, com.google.appengine.api.datastore.Key> maKhachHang = new org.slim3.datastore.CoreAttributeMeta<root.model.KhachHang, com.google.appengine.api.datastore.Key>(this, "__key__", "maKhachHang", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.KhachHang> password = new org.slim3.datastore.StringAttributeMeta<root.model.KhachHang>(this, "password", "password");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.KhachHang> tenkhachhang = new org.slim3.datastore.StringAttributeMeta<root.model.KhachHang>(this, "tenkhachhang", "tenkhachhang");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.KhachHang, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<root.model.KhachHang, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final KhachHangMeta slim3_singleton = new KhachHangMeta();

    /**
     * @return the singleton
     */
    public static KhachHangMeta get() {
       return slim3_singleton;
    }

    /** */
    public KhachHangMeta() {
        super("KhachHang", root.model.KhachHang.class);
    }

    @Override
    public root.model.KhachHang entityToModel(com.google.appengine.api.datastore.Entity entity) {
        root.model.KhachHang model = new root.model.KhachHang();
        model.setEmail((java.lang.String) entity.getProperty("Email"));
        model.setDiachi((java.lang.String) entity.getProperty("diachi"));
        model.setMaKhachHang(entity.getKey());
        model.setPassword((java.lang.String) entity.getProperty("password"));
        model.setTenkhachhang((java.lang.String) entity.getProperty("tenkhachhang"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        root.model.KhachHang m = (root.model.KhachHang) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getMaKhachHang() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getMaKhachHang());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("Email", m.getEmail());
        entity.setProperty("diachi", m.getDiachi());
        entity.setProperty("password", m.getPassword());
        entity.setProperty("tenkhachhang", m.getTenkhachhang());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        root.model.KhachHang m = (root.model.KhachHang) model;
        return m.getMaKhachHang();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        root.model.KhachHang m = (root.model.KhachHang) model;
        m.setMaKhachHang(key);
    }

    @Override
    protected long getVersion(Object model) {
        root.model.KhachHang m = (root.model.KhachHang) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        root.model.KhachHang m = (root.model.KhachHang) model;
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
        root.model.KhachHang m = (root.model.KhachHang) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getEmail() != null){
            writer.setNextPropertyName("Email");
            encoder0.encode(writer, m.getEmail());
        }
        if(m.getDiachi() != null){
            writer.setNextPropertyName("diachi");
            encoder0.encode(writer, m.getDiachi());
        }
        if(m.getMaKhachHang() != null){
            writer.setNextPropertyName("maKhachHang");
            encoder0.encode(writer, m.getMaKhachHang());
        }
        if(m.getPassword() != null){
            writer.setNextPropertyName("password");
            encoder0.encode(writer, m.getPassword());
        }
        if(m.getTenkhachhang() != null){
            writer.setNextPropertyName("tenkhachhang");
            encoder0.encode(writer, m.getTenkhachhang());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected root.model.KhachHang jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        root.model.KhachHang m = new root.model.KhachHang();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("Email");
        m.setEmail(decoder0.decode(reader, m.getEmail()));
        reader = rootReader.newObjectReader("diachi");
        m.setDiachi(decoder0.decode(reader, m.getDiachi()));
        reader = rootReader.newObjectReader("maKhachHang");
        m.setMaKhachHang(decoder0.decode(reader, m.getMaKhachHang()));
        reader = rootReader.newObjectReader("password");
        m.setPassword(decoder0.decode(reader, m.getPassword()));
        reader = rootReader.newObjectReader("tenkhachhang");
        m.setTenkhachhang(decoder0.decode(reader, m.getTenkhachhang()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}