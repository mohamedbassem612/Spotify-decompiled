package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wve {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final w4i1 h;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public wve(int i, String str, String str2, String str3, String str4, String str5, long j, w4i1 w4i1Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = j;
        this.h = w4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wve)) {
            return false;
        }
        wve wveVar = (wve) obj;
        return this.a == wveVar.a && u890.j(this.b, wveVar.b) && u890.j(this.c, wveVar.c) && u890.j(this.d, wveVar.d) && u890.j(this.e, wveVar.e) && u890.j(this.f, wveVar.f) && this.g == wveVar.g && u890.j(this.h, wveVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), this.g, 31);
    }
}
