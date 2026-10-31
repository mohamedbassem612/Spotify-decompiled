package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qfw0 {
    public final sbw0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final i091 e;
    public final boolean f;
    public final sz20 g;
    public final hwt h;
    public final zkm i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final xii1 m;
    public final xii1 n;

    public qfw0(sbw0 sbw0Var, boolean z, boolean z2, boolean z3, i091 i091Var, boolean z4, sz20 sz20Var, hwt hwtVar, zkm zkmVar, boolean z5, boolean z6, boolean z7, xii1 xii1Var, xii1 xii1Var2) {
        this.a = sbw0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i091Var;
        this.f = z4;
        this.g = sz20Var;
        this.h = hwtVar;
        this.i = zkmVar;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = xii1Var;
        this.n = xii1Var2;
    }

    public static qfw0 a(qfw0 qfw0Var, sbw0 sbw0Var, boolean z, boolean z2, boolean z3, i091 i091Var, boolean z4, sz20 sz20Var, hwt hwtVar, zkm zkmVar, boolean z5, boolean z6, boolean z7, xii1 xii1Var, xii1 xii1Var2, int i) {
        sbw0 sbw0Var2 = (i & 1) != 0 ? qfw0Var.a : sbw0Var;
        boolean z8 = (i & 2) != 0 ? qfw0Var.b : z;
        boolean z9 = (i & 4) != 0 ? qfw0Var.c : z2;
        boolean z10 = (i & 8) != 0 ? qfw0Var.d : z3;
        i091 i091Var2 = (i & 16) != 0 ? qfw0Var.e : i091Var;
        boolean z11 = (i & 32) != 0 ? qfw0Var.f : z4;
        sz20 sz20Var2 = (i & 64) != 0 ? qfw0Var.g : sz20Var;
        hwt hwtVar2 = (i & 128) != 0 ? qfw0Var.h : hwtVar;
        zkm zkmVar2 = (i & 256) != 0 ? qfw0Var.i : zkmVar;
        boolean z12 = (i & 512) != 0 ? qfw0Var.j : z5;
        boolean z13 = (i & 1024) != 0 ? qfw0Var.k : z6;
        boolean z14 = (i & 2048) != 0 ? qfw0Var.l : z7;
        xii1 xii1Var3 = (i & 4096) != 0 ? qfw0Var.m : xii1Var;
        xii1 xii1Var4 = (i & 8192) != 0 ? qfw0Var.n : xii1Var2;
        qfw0Var.getClass();
        return new qfw0(sbw0Var2, z8, z9, z10, i091Var2, z11, sz20Var2, hwtVar2, zkmVar2, z12, z13, z14, xii1Var3, xii1Var4);
    }

    public final boolean b() {
        return (this.a.i || this.d || this.k || this.c || this.j) ? false : true;
    }

    public final boolean c() {
        if ((this.c || this.l) && !this.d) {
            return (fqo1.C(this.h) && this.a.i) ? false : true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfw0)) {
            return false;
        }
        qfw0 qfw0Var = (qfw0) obj;
        return u890.j(this.a, qfw0Var.a) && this.b == qfw0Var.b && this.c == qfw0Var.c && this.d == qfw0Var.d && u890.j(this.e, qfw0Var.e) && this.f == qfw0Var.f && this.g.equals(qfw0Var.g) && u890.j(this.h, qfw0Var.h) && u890.j(this.i, qfw0Var.i) && this.j == qfw0Var.j && this.k == qfw0Var.k && this.l == qfw0Var.l && u890.j(this.m, qfw0Var.m) && u890.j(this.n, qfw0Var.n);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        i091 i091Var = this.e;
        int iG2 = xcg1.g(xcg1.g(xcg1.g((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + xcg1.g((iG + (i091Var == null ? 0 : i091Var.hashCode())) * 31, 31, this.f)) * 31)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l);
        xii1 xii1Var = this.m;
        int iHashCode = (iG2 + (xii1Var == null ? 0 : xii1Var.hashCode())) * 31;
        xii1 xii1Var2 = this.n;
        return iHashCode + (xii1Var2 != null ? xii1Var2.hashCode() : 0);
    }
}
