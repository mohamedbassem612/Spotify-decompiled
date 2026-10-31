package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aw70 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final xt70 f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final m9m k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f7p;
    public final bu70 q;
    public final boolean r;
    public final n1x s;
    public final boolean t;

    public aw70(int i, String str, String str2, String str3, String str4, xt70 xt70Var, String str5, String str6, String str7, String str8, m9m m9mVar, boolean z, boolean z2, boolean z3, boolean z4, Integer num, bu70 bu70Var, boolean z5, n1x n1xVar, boolean z6) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = xt70Var;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = m9mVar;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.f7p = num;
        this.q = bu70Var;
        this.r = z5;
        this.s = n1xVar;
        this.t = z6;
    }

    public static aw70 a(aw70 aw70Var, Integer num, bu70 bu70Var, int i) {
        return new aw70(aw70Var.a, aw70Var.b, aw70Var.c, aw70Var.d, aw70Var.e, aw70Var.f, aw70Var.g, aw70Var.h, aw70Var.i, aw70Var.j, aw70Var.k, aw70Var.l, aw70Var.m, aw70Var.n, aw70Var.o, (i & 32768) != 0 ? aw70Var.f7p : num, (i & 65536) != 0 ? aw70Var.q : bu70Var, aw70Var.r, aw70Var.s, aw70Var.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw70)) {
            return false;
        }
        aw70 aw70Var = (aw70) obj;
        return this.a == aw70Var.a && u890.j(this.b, aw70Var.b) && u890.j(this.c, aw70Var.c) && u890.j(this.d, aw70Var.d) && u890.j(this.e, aw70Var.e) && u890.j(this.f, aw70Var.f) && u890.j(this.g, aw70Var.g) && u890.j(this.h, aw70Var.h) && u890.j(this.i, aw70Var.i) && u890.j(this.j, aw70Var.j) && this.k == aw70Var.k && this.l == aw70Var.l && this.m == aw70Var.m && this.n == aw70Var.n && this.o == aw70Var.o && u890.j(this.f7p, aw70Var.f7p) && u890.j(this.q, aw70Var.q) && this.r == aw70Var.r && u890.j(this.s, aw70Var.s) && this.t == aw70Var.t;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d((this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        m9m m9mVar = this.k;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g((iD + (m9mVar == null ? 0 : m9mVar.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        Integer num = this.f7p;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        bu70 bu70Var = this.q;
        int iG2 = xcg1.g((iHashCode + (bu70Var == null ? 0 : bu70Var.hashCode())) * 31, 31, this.r);
        n1x n1xVar = this.s;
        return Boolean.hashCode(this.t) + ((iG2 + (n1xVar != null ? n1xVar.hashCode() : 0)) * 31);
    }
}
