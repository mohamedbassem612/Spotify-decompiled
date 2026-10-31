package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kmm1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final double g;
    public final boolean h;
    public final int i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f26p;

    public kmm1(String str, String str2, boolean z, long j, long j2, long j3, double d, boolean z2, int i, String str3, boolean z3, boolean z4, boolean z5, String str4, String str5, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = d;
        this.h = z2;
        this.i = i;
        this.j = str3;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = str4;
        this.o = str5;
        this.f26p = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmm1)) {
            return false;
        }
        kmm1 kmm1Var = (kmm1) obj;
        return this.a.equals(kmm1Var.a) && this.b.equals(kmm1Var.b) && this.c == kmm1Var.c && this.d == kmm1Var.d && this.e == kmm1Var.e && this.f == kmm1Var.f && Double.compare(this.g, kmm1Var.g) == 0 && this.h == kmm1Var.h && this.i == kmm1Var.i && u890.j(this.j, kmm1Var.j) && this.k == kmm1Var.k && this.l == kmm1Var.l && this.m == kmm1Var.m && this.n.equals(kmm1Var.n) && this.o.equals(kmm1Var.o) && this.f26p == kmm1Var.f26p;
    }

    public final int hashCode() {
        int iK = ab80.k(this.i, xcg1.g(xcg1.e(this.g, cy30.f(cy30.f(cy30.f(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), this.f, 31), 31), 31, this.h), 31);
        String str = this.j;
        return Boolean.hashCode(this.f26p) + cy30.d(cy30.d(xcg1.g(xcg1.g(xcg1.g((iK + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }
}
