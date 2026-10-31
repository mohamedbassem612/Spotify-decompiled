package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wx71 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final w4i1 g;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public wx71(String str, String str2, String str3, String str4, String str5, long j, w4i1 w4i1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = w4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx71)) {
            return false;
        }
        wx71 wx71Var = (wx71) obj;
        return u890.j(this.a, wx71Var.a) && u890.j(this.b, wx71Var.b) && u890.j(this.c, wx71Var.c) && u890.j(this.d, wx71Var.d) && u890.j(this.e, wx71Var.e) && this.f == wx71Var.f && u890.j(this.g, wx71Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31);
    }
}
