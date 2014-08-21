package root.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-08-21 11:21:45")
/** */
public final class LoaiSachMeta extends org.slim3.datastore.ModelMeta<root.model.LoaiSach> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.LoaiSach, com.google.appengine.api.datastore.Key> maloai = new org.slim3.datastore.CoreAttributeMeta<root.model.LoaiSach, com.google.appengine.api.datastore.Key>(this, "__key__", "maloai", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<root.model.LoaiSach> tenloai = new org.slim3.datastore.StringAttributeMeta<root.model.LoaiSach>(this, "tenloai", "tenloai");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.LoaiSach, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<root.model.LoaiSach, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final LoaiSachMeta slim3_singleton = new LoaiSachMeta();

    /**
     * @return the singleton
     */
    public static LoaiSachMeta get() {
       return slim3_singleton;
    }

    /** */
    public LoaiSachMeta() {
        super("LoaiSach", root.model.LoaiSach.class);
    }

    @Override
    public root.model.LoaiSach entityToModel(com.google.appengine.api.datastore.Entity entity) {
        root.model.LoaiSach model = new root.model.LoaiSach();
        model.setMaloai(entity.getKey());
        model.setTenloai((java.lang.String) entity.getProperty("tenloai"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        root.model.LoaiSach m = (root.model.LoaiSach) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getMaloai() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getMaloai());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("tenloai", m.getTenloai());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        root.model.LoaiSach m = (root.model.LoaiSach) model;
        return m.getMaloai();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        root.model.LoaiSach m = (root.model.LoaiSach) model;
        m.setMaloai(key);
    }

    @Override
    protected long getVersion(Object model) {
        root.model.LoaiSach m = (root.model.LoaiSach) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        root.model.LoaiSach m = (root.model.LoaiSach) model;
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
        root.model.LoaiSach m = (root.model.LoaiSach) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getMaloai() != null){
            writer.setNextPropertyName("maloai");
            encoder0.encode(writer, m.getMaloai());
        }
        if(m.getTenloai() != null){
            writer.setNextPropertyName("tenloai");
            encoder0.encode(writer, m.getTenloai());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected root.model.LoaiSach jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        root.model.LoaiSach m = new root.model.LoaiSach();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("maloai");
        m.setMaloai(decoder0.decode(reader, m.getMaloai()));
        reader = rootReader.newObjectReader("tenloai");
        m.setTenloai(decoder0.decode(reader, m.getTenloai()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}