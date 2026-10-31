package p;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l1d1 extends n1d1 {
    public int[] d;
    public long[] e;
    public double[] f;
    public String[] g;
    public byte[][] h;
    public Cursor i;

    public l1d1(sk30 sk30Var, String str) {
        super(sk30Var, str);
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }

    public static void e(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            vby0.y(25, "column index out of range");
            throw null;
        }
    }

    @Override // p.d441
    public final void K(int i, String str) {
        a();
        c(3, i);
        this.d[i] = 3;
        this.g[i] = str;
    }

    @Override // p.d441
    public final String P0(int i) {
        a();
        Cursor cursorF = f();
        e(cursorF, i);
        return cursorF.getString(i);
    }

    public final void c(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.d;
        if (iArr.length < i3) {
            this.d = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.e;
            if (jArr.length < i3) {
                this.e = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f;
            if (dArr.length < i3) {
                this.f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.g;
            if (strArr.length < i3) {
                this.g = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.h;
        if (bArr.length < i3) {
            this.h = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            x();
            reset();
        }
        this.c = true;
    }

    public final void d() {
        if (this.i == null) {
            ezb1 ezb1Var = new ezb1(this, (byte) 4);
            sk30 sk30Var = this.a;
            sk30Var.getClass();
            final qk30 qk30Var = new qk30(ezb1Var);
            this.i = sk30Var.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: p.rk30
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) qk30Var.J(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ezb1Var.e(), sk30.c, null);
        }
    }

    public final Cursor f() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        vby0.y(21, "no row");
        throw null;
    }

    @Override // p.d441
    public final boolean f1() {
        a();
        d();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        eg.m("Required value was null.");
        return false;
    }

    @Override // p.d441
    public final byte[] getBlob(int i) {
        a();
        Cursor cursorF = f();
        e(cursorF, i);
        return cursorF.getBlob(i);
    }

    @Override // p.d441
    public final int getColumnCount() {
        a();
        d();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // p.d441
    public final String getColumnName(int i) {
        a();
        d();
        Cursor cursor = this.i;
        if (cursor != null) {
            e(cursor, i);
            return cursor.getColumnName(i);
        }
        eg.m("Required value was null.");
        return null;
    }

    @Override // p.d441
    public final long getLong(int i) {
        a();
        Cursor cursorF = f();
        e(cursorF, i);
        return cursorF.getLong(i);
    }

    @Override // p.d441
    public final boolean isNull(int i) {
        a();
        Cursor cursorF = f();
        e(cursorF, i);
        return cursorF.isNull(i);
    }

    @Override // p.d441
    public final void n(byte[] bArr, int i) {
        a();
        c(4, i);
        this.d[i] = 4;
        this.h[i] = bArr;
    }

    @Override // p.d441
    public final void r(int i, long j) {
        a();
        c(1, i);
        this.d[i] = 1;
        this.e[i] = j;
    }

    @Override // p.n1d1, p.d441
    public final void reset() {
        a();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // p.d441
    public final void s(double d, int i) {
        a();
        c(2, i);
        this.d[i] = 2;
        this.f[i] = d;
    }

    @Override // p.d441
    public final void t(int i) {
        a();
        c(5, i);
        this.d[i] = 5;
    }

    @Override // p.n1d1, p.d441
    public final void x() {
        a();
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }
}
