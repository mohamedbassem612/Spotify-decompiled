package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xlm1 implements gmm1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final String g;
    public final long h;
    public final long i;
    public final long j;
    public final double k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public xlm1(String str, String str2, String str3, boolean z, boolean z2, int i, String str4, long j, long j2, long j3, double d, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = str4;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = d;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlm1)) {
            return false;
        }
        xlm1 xlm1Var = (xlm1) obj;
        return this.a.equals(xlm1Var.a) && this.b.equals(xlm1Var.b) && this.c.equals(xlm1Var.c) && this.d == xlm1Var.d && this.e == xlm1Var.e && this.f == xlm1Var.f && u890.j(this.g, xlm1Var.g) && this.h == xlm1Var.h && this.i == xlm1Var.i && this.j == xlm1Var.j && Double.compare(this.k, xlm1Var.k) == 0 && this.l == xlm1Var.l && this.m == xlm1Var.m && this.n == xlm1Var.n && this.o == xlm1Var.o;
    }

    public final int hashCode() {
        int iK = ab80.k(this.f, xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
        String str = this.g;
        return Boolean.hashCode(this.o) + xcg1.g(xcg1.g(xcg1.g(xcg1.e(this.k, cy30.f(cy30.f(cy30.f((iK + (str == null ? 0 : str.hashCode())) * 31, this.h, 31), this.i, 31), this.j, 31), 31), 31, this.l), 31, this.m), 31, this.n);
    }
}
