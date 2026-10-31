package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wh6 {
    public final uh6 a;
    public final uh6 b;
    public final uh6 c;
    public final uh6 d;
    public final vu30 e;
    public final vu30 f;
    public final zyq0 g;
    public final yj41 h;
    public final c380 i;
    public final c380 j;
    public final rx7 k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f74p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final int t;
    public final boolean u;
    public final i26 v;

    public wh6(uh6 uh6Var, uh6 uh6Var2, uh6 uh6Var3, uh6 uh6Var4, uh6 uh6Var5, uh6 uh6Var6, zyq0 zyq0Var, yj41 yj41Var, c380 c380Var, c380 c380Var2, rx7 rx7Var, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, int i2, boolean z3, i26 i26Var) {
        this.a = uh6Var;
        this.b = uh6Var2;
        this.c = uh6Var3;
        this.d = uh6Var4;
        this.e = uh6Var5;
        this.f = uh6Var6;
        this.g = zyq0Var;
        this.h = yj41Var;
        this.i = c380Var;
        this.j = c380Var2;
        this.k = rx7Var;
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.f74p = str5;
        this.q = z;
        this.r = z2;
        this.s = i;
        this.t = i2;
        this.u = z3;
        this.v = i26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wh6) {
            wh6 wh6Var = (wh6) obj;
            return this.a == wh6Var.a && this.b == wh6Var.b && this.c == wh6Var.c && this.d == wh6Var.d && u890.j(this.e, wh6Var.e) && u890.j(this.f, wh6Var.f) && u890.j(this.g, wh6Var.g) && u890.j(this.h, wh6Var.h) && u890.j(this.i, wh6Var.i) && u890.j(this.j, wh6Var.j) && u890.j(this.k, wh6Var.k) && this.l.equals(wh6Var.l) && this.m.equals(wh6Var.m) && this.n.equals(wh6Var.n) && this.o.equals(wh6Var.o) && this.f74p.equals(wh6Var.f74p) && this.q == wh6Var.q && this.r == wh6Var.r && this.s == wh6Var.s && this.t == wh6Var.t && this.u == wh6Var.u && this.v == wh6Var.v;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        vu30 vu30Var = this.e;
        int iHashCode2 = (iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31;
        vu30 vu30Var2 = this.f;
        int iHashCode3 = (this.g.hashCode() + ((iHashCode2 + (vu30Var2 == null ? 0 : vu30Var2.hashCode())) * 31)) * 31;
        yj41 yj41Var = this.h;
        int iF = kk0.f(this.j, kk0.f(this.i, (iHashCode3 + (yj41Var == null ? 0 : yj41Var.hashCode())) * 31, 31), 31);
        rx7 rx7Var = this.k;
        int iG = xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iF + (rx7Var == null ? 0 : rx7Var.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f74p), 31, this.q), 31, this.r);
        int i = this.s;
        int iC = (iG + (i == 0 ? 0 : l1d.C(i))) * 31;
        int i2 = this.t;
        return this.v.hashCode() + xcg1.g((iC + (i2 != 0 ? l1d.C(i2) : 0)) * 31, 31, this.u);
    }
}
