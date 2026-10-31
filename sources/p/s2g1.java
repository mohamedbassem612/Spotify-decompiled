package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2g1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final boolean f;
    public final String g;

    public s2g1(String str, String str2, String str3, String str4, long j, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = z;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2g1)) {
            return false;
        }
        s2g1 s2g1Var = (s2g1) obj;
        return this.a.equals(s2g1Var.a) && this.b.equals(s2g1Var.b) && this.c.equals(s2g1Var.c) && this.d.equals(s2g1Var.d) && this.e == s2g1Var.e && this.f == s2g1Var.f && u890.j(this.g, s2g1Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.f(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), 31, this.f);
        String str = this.g;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
