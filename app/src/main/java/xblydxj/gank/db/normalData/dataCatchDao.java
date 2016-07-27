package xblydxj.gank.db.normalData;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DATA_CATCH".
*/
public class dataCatchDao extends AbstractDao<dataCatch, Long> {

    public static final String TABLENAME = "DATA_CATCH";

    /**
     * Properties of entity dataCatch.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Desc = new Property(1, String.class, "desc", false, "DESC");
        public final static Property Time = new Property(2, String.class, "time", false, "TIME");
        public final static Property Author = new Property(3, String.class, "author", false, "AUTHOR");
        public final static Property Url = new Property(4, String.class, "url", false, "URL");
        public final static Property Type = new Property(5, String.class, "type", false, "TYPE");
    };


    public dataCatchDao(DaoConfig config) {
        super(config);
    }
    
    public dataCatchDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DATA_CATCH\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"DESC\" TEXT," + // 1: desc
                "\"TIME\" TEXT," + // 2: time
                "\"AUTHOR\" TEXT," + // 3: author
                "\"URL\" TEXT," + // 4: url
                "\"TYPE\" TEXT);"); // 5: type
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DATA_CATCH\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, dataCatch entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(2, desc);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(3, time);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(5, url);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public dataCatch readEntity(Cursor cursor, int offset) {
        dataCatch entity = new dataCatch( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // desc
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // time
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // url
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // type
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, dataCatch entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDesc(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setType(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(dataCatch entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(dataCatch entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}