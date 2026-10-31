package p;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sk30 implements Closeable {
    public static final String[] b;
    public static final String[] c;
    public static final znb0 d;
    public static final znb0 e;
    public final SQLiteDatabase a;

    static {
        new m4c((byte) 11);
        b = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        c = new String[0];
        d = dm5.S(2, new n4k((byte) 6));
        e = dm5.S(2, new n4k((byte) 7));
    }

    public sk30(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public final boolean V0() {
        return this.a.inTransaction();
    }

    public final void a() {
        this.a.beginTransaction();
    }

    public final void c() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final yk30 d(String str) {
        return new yk30(this.a.compileStatement(str));
    }

    public final void e() {
        this.a.endTransaction();
    }

    public final void f(String str) {
        this.a.execSQL(str);
    }

    public final void g(Object[] objArr) {
        this.a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final void h() {
        this.a.setTransactionSuccessful();
    }

    public final boolean isOpen() {
        return this.a.isOpen();
    }
}
