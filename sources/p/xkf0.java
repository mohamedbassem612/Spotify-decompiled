package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xkf0 {
    public final wkf0 a;
    public final bff0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final nkf0 g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final aog1 k;
    public final boolean l;
    public final jkf0 m;
    public final ob30 n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f50p;
    public final boolean q;
    public final tm21 r;

    public xkf0(wkf0 wkf0Var, bff0 bff0Var, String str, String str2, String str3, String str4, nkf0 nkf0Var, String str5, boolean z, boolean z2, aog1 aog1Var, boolean z3, jkf0 jkf0Var, ob30 ob30Var, boolean z4, boolean z5, boolean z6, tm21 tm21Var) {
        this.a = wkf0Var;
        this.b = bff0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = nkf0Var;
        this.h = str5;
        this.i = z;
        this.j = z2;
        this.k = aog1Var;
        this.l = z3;
        this.m = jkf0Var;
        this.n = ob30Var;
        this.o = z4;
        this.f50p = z5;
        this.q = z6;
        this.r = tm21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkf0)) {
            return false;
        }
        xkf0 xkf0Var = (xkf0) obj;
        return this.a.equals(xkf0Var.a) && u890.j(this.b, xkf0Var.b) && u890.j(this.c, xkf0Var.c) && u890.j(this.d, xkf0Var.d) && this.e.equals(xkf0Var.e) && this.f.equals(xkf0Var.f) && this.g.equals(xkf0Var.g) && this.h.equals(xkf0Var.h) && this.i == xkf0Var.i && this.j == xkf0Var.j && u890.j(this.k, xkf0Var.k) && this.l == xkf0Var.l && this.m.equals(xkf0Var.m) && this.n.equals(xkf0Var.n) && this.o == xkf0Var.o && this.f50p == xkf0Var.f50p && this.q == xkf0Var.q && u890.j(this.r, xkf0Var.r);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g((this.n.hashCode() + ((this.m.hashCode() + xcg1.g((this.k.hashCode() + xcg1.g(xcg1.g(cy30.d((this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l)) * 31)) * 31, 31, this.o), 31, this.f50p), 31, this.q);
        tm21 tm21Var = this.r;
        return iG + (tm21Var == null ? 0 : tm21Var.hashCode());
    }
}
