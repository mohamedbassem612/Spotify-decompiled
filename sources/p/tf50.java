package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tf50 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final boolean f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final boolean k;
    public final t9b0 l;

    public tf50(int i, int i2, String str, String str2, long j, boolean z, long j2, long j3, String str3, String str4, boolean z2, t9b0 t9b0Var) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = z;
        this.g = j2;
        this.h = j3;
        this.i = str3;
        this.j = str4;
        this.k = z2;
        this.l = t9b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf50)) {
            return false;
        }
        tf50 tf50Var = (tf50) obj;
        if (this.a != tf50Var.a || this.b != tf50Var.b || !this.c.equals(tf50Var.c) || !this.d.equals(tf50Var.d)) {
            return false;
        }
        long j = tf50Var.e;
        int i = u7h.l;
        return z4h1.b(this.e, j) && this.f == tf50Var.f && z4h1.b(this.g, tf50Var.g) && z4h1.b(this.h, tf50Var.h) && this.i.equals(tf50Var.i) && this.j.equals(tf50Var.j) && this.k == tf50Var.k && u890.j(this.l, tf50Var.l);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        int i = u7h.l;
        int iG = xcg1.g(cy30.d(cy30.d(cy30.f(cy30.f(xcg1.g(cy30.f(iD, this.e, 31), 31, this.f), this.g, 31), this.h, 31), 31, this.i), 31, this.j), 31, this.k);
        t9b0 t9b0Var = this.l;
        return iG + (t9b0Var == null ? 0 : t9b0Var.hashCode());
    }
}
