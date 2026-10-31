package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jmb1 implements unb1 {
    public final uv11 a;
    public final bv11 b;
    public final xn70 c;
    public final xn70 d;
    public final iix0 e;
    public final rrt0 f;
    public final dt11 g;
    public final n4m h;
    public final n6u i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final me2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f56p;
    public final boolean q;

    public jmb1(uv11 uv11Var, bv11 bv11Var, xn70 xn70Var, xn70 xn70Var2, iix0 iix0Var, rrt0 rrt0Var, dt11 dt11Var, n4m n4mVar, n6u n6uVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, me2 me2Var, Double d, boolean z6) {
        this.a = uv11Var;
        this.b = bv11Var;
        this.c = xn70Var;
        this.d = xn70Var2;
        this.e = iix0Var;
        this.f = rrt0Var;
        this.g = dt11Var;
        this.h = n4mVar;
        this.i = n6uVar;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = me2Var;
        this.f56p = d;
        this.q = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmb1)) {
            return false;
        }
        jmb1 jmb1Var = (jmb1) obj;
        return this.a.equals(jmb1Var.a) && u890.j(this.b, jmb1Var.b) && u890.j(this.c, jmb1Var.c) && u890.j(this.d, jmb1Var.d) && u890.j(this.e, jmb1Var.e) && this.f == jmb1Var.f && u890.j(this.g, jmb1Var.g) && this.h == jmb1Var.h && u890.j(this.i, jmb1Var.i) && this.j == jmb1Var.j && this.k == jmb1Var.k && this.l == jmb1Var.l && this.m == jmb1Var.m && this.n == jmb1Var.n && u890.j(this.o, jmb1Var.o) && u890.j(this.f56p, jmb1Var.f56p) && this.q == jmb1Var.q;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        xn70 xn70Var = this.c;
        int iHashCode2 = (iHashCode + (xn70Var == null ? 0 : xn70Var.hashCode())) * 31;
        xn70 xn70Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (xn70Var2 == null ? 0 : xn70Var2.hashCode())) * 31;
        iix0 iix0Var = this.e;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (iix0Var == null ? 0 : iix0Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        me2 me2Var = this.o;
        int iHashCode4 = (iG + (me2Var == null ? 0 : me2Var.hashCode())) * 31;
        Double d = this.f56p;
        return Boolean.hashCode(this.q) + ((iHashCode4 + (d != null ? d.hashCode() : 0)) * 31);
    }
}
