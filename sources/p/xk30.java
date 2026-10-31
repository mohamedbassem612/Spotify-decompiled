package p;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class xk30 implements i1d1 {
    public final SQLiteProgram a;

    public xk30(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // p.i1d1
    public final void n(byte[] bArr, int i) {
        this.a.bindBlob(i, bArr);
    }

    @Override // p.i1d1
    public final void r(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // p.i1d1
    public final void s(double d, int i) {
        this.a.bindDouble(i, d);
    }

    @Override // p.i1d1
    public final void t(int i) {
        this.a.bindNull(i);
    }

    @Override // p.i1d1
    public final void w0(int i, String str) {
        this.a.bindString(i, str);
    }

    @Override // p.i1d1
    public final void x() {
        this.a.clearBindings();
    }
}
