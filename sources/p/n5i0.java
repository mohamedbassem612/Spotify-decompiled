package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n5i0 {
    public final v5i0 a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final long m;
    public final long n;

    public n5i0(v5i0 v5i0Var, String str, long j, long j2, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str3, long j3, long j4) {
        this.a = v5i0Var;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = str2;
        this.f = i;
        this.g = i2;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = str3;
        this.m = j3;
        this.n = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5i0)) {
            return false;
        }
        n5i0 n5i0Var = (n5i0) obj;
        return this.a.equals(n5i0Var.a) && u890.j(this.b, n5i0Var.b) && this.c == n5i0Var.c && this.d == n5i0Var.d && u890.j(this.e, n5i0Var.e) && this.f == n5i0Var.f && this.g == n5i0Var.g && this.h == n5i0Var.h && this.i == n5i0Var.i && this.j == n5i0Var.j && this.k == n5i0Var.k && u890.j(this.l, n5i0Var.l) && this.m == n5i0Var.m && this.n == n5i0Var.n;
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
        String str = this.e;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.g, ab80.k(this.f, (iF + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str2 = this.l;
        return Long.hashCode(this.n) + cy30.f((iG + (str2 != null ? str2.hashCode() : 0)) * 31, this.m, 31);
    }
}
