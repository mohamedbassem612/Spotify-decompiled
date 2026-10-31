package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wkn implements xkn {
    public final int a;
    public final w4i1 b;
    public final boolean c;
    public final boolean d;
    public final String e;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public wkn(int i, String str, w4i1 w4i1Var, boolean z, boolean z2) {
        this.a = i;
        this.b = w4i1Var;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkn)) {
            return false;
        }
        wkn wknVar = (wkn) obj;
        return this.a == wknVar.a && u890.j(this.b, wknVar.b) && this.c == wknVar.c && this.d == wknVar.d && this.e.equals(wknVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(xcg1.g(ydh.d(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }
}
