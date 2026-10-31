package p;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m1d1 extends n1d1 {
    public final int d;

    public m1d1(sk30 sk30Var, String str, int i) {
        super(sk30Var, str);
        this.d = i;
    }

    public final void K(int i, String str) {
        a();
        vby0.y(25, "column index out of range");
        throw null;
    }

    public final String P0(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    public final void close() {
        ((n1d1) this).c = true;
    }

    public final boolean f1() throws IllegalAccessException, InvocationTargetException {
        int iC = l1d.C(this.d);
        sk30 sk30Var = ((n1d1) this).a;
        if (iC == 0) {
            sk30Var.h();
            sk30Var.e();
        } else if (iC == 1) {
            sk30Var.e();
        } else if (iC == 2) {
            sk30Var.a();
        } else if (iC == 3) {
            sk30Var.c();
        } else {
            if (iC != 4) {
                eg.o();
                return false;
            }
            SQLiteDatabase sQLiteDatabase = sk30Var.a;
            if (m4c.k() == null || m4c.l() == null) {
                sk30Var.a();
            } else {
                Method methodK = m4c.k();
                methodK.getClass();
                Method methodL = m4c.l();
                methodL.getClass();
                Object objInvoke = methodL.invoke(sQLiteDatabase, null);
                if (objInvoke != null) {
                    methodK.invoke(objInvoke, 0, null, 0, null);
                } else {
                    eg.m("Required value was null.");
                }
            }
        }
        return false;
    }

    public final byte[] getBlob(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    public final int getColumnCount() {
        a();
        return 0;
    }

    public final String getColumnName(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    public final long getLong(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    public final boolean isNull(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    public final void n(byte[] bArr, int i) {
        a();
        vby0.y(25, "column index out of range");
        throw null;
    }

    public final void r(int i, long j) {
        a();
        vby0.y(25, "column index out of range");
        throw null;
    }

    public final void s(double d, int i) {
        a();
        vby0.y(25, "column index out of range");
        throw null;
    }

    public final void t(int i) {
        a();
        vby0.y(25, "column index out of range");
        throw null;
    }
}
