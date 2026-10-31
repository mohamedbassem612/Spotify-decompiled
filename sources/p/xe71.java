package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xe71 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final w4i1 g;

    public xe71(String str, String str2, String str3, String str4, String str5, long j, w4i1 w4i1Var) {
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
        if (!(obj instanceof xe71)) {
            return false;
        }
        xe71 xe71Var = (xe71) obj;
        return u890.j(this.a, xe71Var.a) && u890.j(this.b, xe71Var.b) && u890.j(this.c, xe71Var.c) && u890.j(this.d, xe71Var.d) && u890.j(this.e, xe71Var.e) && this.f == xe71Var.f && u890.j(this.g, xe71Var.g);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ydh.d(this.g, cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), 31);
    }
}
