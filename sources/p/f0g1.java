package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f0g1 {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final yzf1 g;
    public final agv h;

    public /* synthetic */ f0g1(String str, long j, long j2, boolean z, boolean z2, boolean z3, yzf1 yzf1Var, agv agvVar, int i) {
        this(str, j, j2, z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : yzf1Var, (i & 128) != 0 ? agv.a : agvVar);
    }

    public static f0g1 a(f0g1 f0g1Var, boolean z) {
        return new f0g1(f0g1Var.a, f0g1Var.b, f0g1Var.c, f0g1Var.d, z, f0g1Var.f, f0g1Var.g, f0g1Var.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0g1)) {
            return false;
        }
        f0g1 f0g1Var = (f0g1) obj;
        return u890.j(this.a, f0g1Var.a) && this.b == f0g1Var.b && this.c == f0g1Var.c && this.d == f0g1Var.d && this.e == f0g1Var.e && this.f == f0g1Var.f && u890.j(this.g, f0g1Var.g) && this.h == f0g1Var.h;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), 31, this.f);
        yzf1 yzf1Var = this.g;
        return this.h.hashCode() + ((iG + (yzf1Var == null ? 0 : yzf1Var.hashCode())) * 31);
    }

    public f0g1(String str, long j, long j2, boolean z, boolean z2, boolean z3, yzf1 yzf1Var, agv agvVar) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = yzf1Var;
        this.h = agvVar;
    }
}
