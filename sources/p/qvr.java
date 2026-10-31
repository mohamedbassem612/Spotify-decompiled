package p;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.database.DatabaseIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qvr {
    public static final String e = g(3, 4);
    public static final String[] f = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    public final yab1 b;
    public boolean d;
    public final String a = "ExoPlayerDownloads";
    public final Object c = new Object();

    public qvr(yab1 yab1Var) {
        this.b = yab1Var;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String str2 = zoi1.a;
            for (String str3 : str.split(",", -1)) {
                String[] strArrSplit = str3.split("\\.", -1);
                dm5.y(strArrSplit.length == 3);
                arrayList.add(new vdc1(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
            }
        }
        return arrayList;
    }

    public static kru e(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        goq goqVar = new goq(Uri.parse(string2), string);
        goqVar.o(cursor.getString(1));
        goqVar.p(a(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        goqVar.n(blob);
        goqVar.l(cursor.getString(4));
        goqVar.m(cursor.getBlob(5));
        j0v j0vVarA = goqVar.a();
        dzu dzuVar = new dzu();
        dzuVar.a = cursor.getLong(13);
        dzuVar.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new kru(j0vVarA, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, dzuVar);
    }

    public static kru f(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        goq goqVar = new goq(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        goqVar.o(str);
        goqVar.p(a(cursor.getString(3)));
        goqVar.l(cursor.getString(4));
        goqVar.m(cursor.getBlob(5));
        j0v j0vVarA = goqVar.a();
        dzu dzuVar = new dzu();
        dzuVar.a = cursor.getLong(13);
        dzuVar.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new kru(j0vVarA, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, dzuVar);
    }

    public static String g(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList h(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!zoi1.k0(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(f(cursorQuery));
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void b() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            try {
                int iA = e5j1.a(this.b.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        e5j1.b(writableDatabase, 0, "", 3);
                        ArrayList arrayListH = iA == 2 ? h(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayListH.iterator();
                        while (it.hasNext()) {
                            j((kru) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.d = true;
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final Cursor c(String str, String[] strArr) throws DatabaseIOException {
        try {
            return this.b.getReadableDatabase().query(this.a, f, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final kru d(String str) throws DatabaseIOException {
        b();
        try {
            Cursor cursorC = c("id = ?", new String[]{str});
            try {
                if (cursorC.getCount() == 0) {
                    cursorC.close();
                    return null;
                }
                cursorC.moveToNext();
                kru kruVarE = e(cursorC);
                cursorC.close();
                return kruVarE;
            } catch (Throwable th) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
        throw new DatabaseIOException(e2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void i(kru kruVar) throws DatabaseIOException {
        b();
        try {
            j(kruVar, this.b.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void j(kru kruVar, SQLiteDatabase sQLiteDatabase) {
        j0v j0vVar = kruVar.a;
        byte[] bArr = j0vVar.e;
        if (bArr == null) {
            bArr = zoi1.b;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", j0vVar.a);
        contentValues.put("mime_type", j0vVar.c);
        contentValues.put("uri", j0vVar.b.toString());
        List list = j0vVar.d;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            vdc1 vdc1Var = (vdc1) list.get(i);
            sb.append(vdc1Var.a);
            sb.append('.');
            sb.append(vdc1Var.b);
            sb.append('.');
            sb.append(vdc1Var.c);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", j0vVar.f);
        contentValues.put("data", j0vVar.g);
        contentValues.put("state", Integer.valueOf(kruVar.b));
        contentValues.put("start_time_ms", Long.valueOf(kruVar.c));
        contentValues.put("update_time_ms", Long.valueOf(kruVar.d));
        contentValues.put("content_length", Long.valueOf(kruVar.e));
        contentValues.put("stop_reason", Integer.valueOf(kruVar.f));
        contentValues.put("failure_reason", Integer.valueOf(kruVar.g));
        contentValues.put("percent_downloaded", Float.valueOf(kruVar.b()));
        contentValues.put("bytes_downloaded", Long.valueOf(kruVar.a()));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.a, null, contentValues);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void k() throws DatabaseIOException {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void l() throws DatabaseIOException {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void m(int i, String str) throws DatabaseIOException {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, e + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }
}
