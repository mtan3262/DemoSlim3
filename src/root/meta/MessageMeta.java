package root.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-08-19 13:40:36")
/** */
public final class MessageMeta extends org.slim3.datastore.ModelMeta<root.model.Message> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.Message, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<root.model.Message, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<root.model.Message, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<root.model.Message, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final MessageMeta slim3_singleton = new MessageMeta();

    /**
     * @return the singleton
     */
    public static MessageMeta get() {
       return slim3_singleton;
    }

    /** */
    public MessageMeta() {
        super("Message", root.model.Message.class);
    }

    @Override
    public root.model.Message entityToModel(com.google.appengine.api.datastore.Entity entity) {
        root.model.Message model = new root.model.Message();
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        root.model.Message m = (root.model.Message) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        root.model.Message m = (root.model.Message) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        root.model.Message m = (root.model.Message) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        root.model.Message m = (root.model.Message) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        root.model.Message m = (root.model.Message) model;
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
        root.model.Message m = (root.model.Message) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected root.model.Message jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        root.model.Message m = new root.model.Message();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}