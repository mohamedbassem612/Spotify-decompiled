package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gi90 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final long j;
    public final String k;
    public final m4m l;
    public final boolean m;
    public final int n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final usd f16p;
    public final String q;
    public final int r;
    public final boolean s;
    public final long t;

    public gi90(boolean z, String str, String str2, String str3, String str4, String str5, long j, long j2, String str6, long j3, String str7, m4m m4mVar, boolean z2, int i, String str8, usd usdVar, String str9, int i2, boolean z3, long j4) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = j;
        this.h = j2;
        this.i = str6;
        this.j = j3;
        this.k = str7;
        this.l = m4mVar;
        this.m = z2;
        this.n = i;
        this.o = str8;
        this.f16p = usdVar;
        this.q = str9;
        this.r = i2;
        this.s = z3;
        this.t = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi90)) {
            return false;
        }
        gi90 gi90Var = (gi90) obj;
        return this.a == gi90Var.a && this.b.equals(gi90Var.b) && u890.j(this.c, gi90Var.c) && this.d.equals(gi90Var.d) && u890.j(this.e, gi90Var.e) && u890.j(this.f, gi90Var.f) && this.g == gi90Var.g && this.h == gi90Var.h && this.i.equals(gi90Var.i) && this.j == gi90Var.j && u890.j(this.k, gi90Var.k) && this.l == gi90Var.l && this.m == gi90Var.m && this.n == gi90Var.n && this.o.equals(gi90Var.o) && this.f16p == gi90Var.f16p && this.q.equals(gi90Var.q) && this.r == gi90Var.r && this.s == gi90Var.s && this.t == gi90Var.t;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iF = cy30.f(cy30.d(cy30.f(cy30.f((iD + (str == null ? 0 : str.hashCode())) * 31, this.g, 31), this.h, 31), 31, this.i), this.j, 31);
        String str2 = this.k;
        return Long.hashCode(this.t) + xcg1.g(ab80.k(this.r, cy30.d((this.f16p.hashCode() + cy30.d(ab80.k(this.n, xcg1.g((this.l.hashCode() + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.m), 31), 31, this.o)) * 31, 31, this.q), 31), 31, this.s);
    }
}
