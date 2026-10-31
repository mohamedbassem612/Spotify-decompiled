package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t810 {
    public final ioj0 a;
    public final zkm b;
    public final hwt c;
    public final ijo d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y2u0 f44p;
    public final sq51 q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    public /* synthetic */ t810(ioj0 ioj0Var, zkm zkmVar, hwt hwtVar, ijo ijoVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, y2u0 y2u0Var, sq51 sq51Var, boolean z9, boolean z10, boolean z11, int i) {
        this(ioj0Var, (i & 2) != 0 ? null : zkmVar, (i & 4) != 0 ? null : hwtVar, (i & 8) != 0 ? null : ijoVar, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, true, (i & 512) != 0 ? true : z5, (i & 1024) != 0 ? false : z6, (i & 4096) != 0 ? false : z7, (i & 8192) != 0 ? false : z8, (32768 & i) != 0 ? null : y2u0Var, (65536 & i) != 0 ? null : sq51Var, (131072 & i) == 0, (262144 & i) != 0 ? false : z9, (524288 & i) != 0 ? false : z10, (i & 1048576) != 0 ? false : z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t810)) {
            return false;
        }
        t810 t810Var = (t810) obj;
        return u890.j(this.a, t810Var.a) && u890.j(this.b, t810Var.b) && u890.j(this.c, t810Var.c) && u890.j(this.d, t810Var.d) && this.e == t810Var.e && this.f == t810Var.f && this.g == t810Var.g && this.h == t810Var.h && this.i == t810Var.i && this.j == t810Var.j && this.k == t810Var.k && this.l == t810Var.l && this.m == t810Var.m && this.n == t810Var.n && this.o == t810Var.o && u890.j(this.f44p, t810Var.f44p) && u890.j(this.q, t810Var.q) && this.r == t810Var.r && this.s == t810Var.s && this.t == t810Var.t && this.u == t810Var.u;
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        zkm zkmVar = this.b;
        int iHashCode2 = (iHashCode + (zkmVar == null ? 0 : zkmVar.hashCode())) * 31;
        hwt hwtVar = this.c;
        int iHashCode3 = (iHashCode2 + (hwtVar == null ? 0 : hwtVar.hashCode())) * 31;
        ijo ijoVar = this.d;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode3 + (ijoVar == null ? 0 : ijoVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        y2u0 y2u0Var = this.f44p;
        int iHashCode4 = (iG + (y2u0Var == null ? 0 : y2u0Var.hashCode())) * 31;
        sq51 sq51Var = this.q;
        return Boolean.hashCode(this.u) + xcg1.g(xcg1.g(xcg1.g((iHashCode4 + (sq51Var != null ? sq51Var.hashCode() : 0)) * 31, 31, this.r), 31, this.s), 31, this.t);
    }

    public t810(ioj0 ioj0Var, zkm zkmVar, hwt hwtVar, ijo ijoVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, y2u0 y2u0Var, sq51 sq51Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = ioj0Var;
        this.b = zkmVar;
        this.c = hwtVar;
        this.d = ijoVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = true;
        this.m = z8;
        this.n = z9;
        this.o = true;
        this.f44p = y2u0Var;
        this.q = sq51Var;
        this.r = z10;
        this.s = z11;
        this.t = z12;
        this.u = z13;
    }
}
