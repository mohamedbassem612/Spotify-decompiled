package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dj1 extends ej1 {
    public final w4i1 a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String e;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public dj1(int i, String str, w4i1 w4i1Var, boolean z, boolean z2) {
        this.a = w4i1Var;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj1)) {
            return false;
        }
        dj1 dj1Var = (dj1) obj;
        return u890.j(this.a, dj1Var.a) && this.b == dj1Var.b && this.c == dj1Var.c && this.d == dj1Var.d && this.e.equals(dj1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
