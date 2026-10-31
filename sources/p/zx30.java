package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zx30 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final c9 g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final long l;
    public final long m;

    public zx30(String str, String str2, String str3, String str4, String str5, String str6, c9 c9Var, String str7, String str8, String str9, boolean z, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = c9Var;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = z;
        this.l = j;
        this.m = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx30)) {
            return false;
        }
        zx30 zx30Var = (zx30) obj;
        if (!this.a.equals(zx30Var.a) || !this.b.equals(zx30Var.b) || !this.c.equals(zx30Var.c) || !this.d.equals(zx30Var.d) || !this.e.equals(zx30Var.e) || !this.f.equals(zx30Var.f) || !u890.j(this.g, zx30Var.g) || !this.h.equals(zx30Var.h) || !this.i.equals(zx30Var.i) || !this.j.equals(zx30Var.j) || this.k != zx30Var.k) {
            return false;
        }
        long j = zx30Var.l;
        int i = u7h.l;
        return z4h1.b(this.l, j) && z4h1.b(this.m, zx30Var.m);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d((this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        int i = u7h.l;
        return Long.hashCode(this.m) + cy30.f(iG, this.l, 31);
    }
}
