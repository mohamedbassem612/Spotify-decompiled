package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zaf0 {
    public final ual a;
    public final boolean b;
    public final boolean c;
    public final xa0 d;
    public final vdu0 e;
    public final igb f;
    public final u6o0 g;
    public final Boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public zaf0(ual ualVar, boolean z, boolean z2, xa0 xa0Var, vdu0 vdu0Var, igb igbVar, u6o0 u6o0Var, Boolean bool, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = ualVar;
        this.b = z;
        this.c = z2;
        this.d = xa0Var;
        this.e = vdu0Var;
        this.f = igbVar;
        this.g = u6o0Var;
        this.h = bool;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = z9;
    }

    public static zaf0 a(zaf0 zaf0Var, ual ualVar, boolean z, xa0 xa0Var, vdu0 vdu0Var, igb igbVar, u6o0 u6o0Var, Boolean bool, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        return new zaf0((i & 1) != 0 ? zaf0Var.a : ualVar, (i & 2) != 0 ? zaf0Var.b : z, zaf0Var.c, (i & 8) != 0 ? zaf0Var.d : xa0Var, (i & 16) != 0 ? zaf0Var.e : vdu0Var, (i & 32) != 0 ? zaf0Var.f : igbVar, (i & 64) != 0 ? zaf0Var.g : u6o0Var, (i & 128) != 0 ? zaf0Var.h : bool, (i & 256) != 0 ? zaf0Var.i : z2, (i & 512) != 0 ? zaf0Var.j : z3, (i & 1024) != 0 ? zaf0Var.k : z4, (i & 2048) != 0 ? zaf0Var.l : z5, (i & 4096) != 0 ? zaf0Var.m : z6, (i & 8192) != 0 ? zaf0Var.n : z7, (i & 16384) != 0 ? zaf0Var.o : z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaf0)) {
            return false;
        }
        zaf0 zaf0Var = (zaf0) obj;
        return this.a == zaf0Var.a && this.b == zaf0Var.b && this.c == zaf0Var.c && u890.j(this.d, zaf0Var.d) && this.e.equals(zaf0Var.e) && u890.j(this.f, zaf0Var.f) && this.g == zaf0Var.g && u890.j(this.h, zaf0Var.h) && this.i == zaf0Var.i && this.j == zaf0Var.j && this.k == zaf0Var.k && this.l == zaf0Var.l && this.m == zaf0Var.m && this.n == zaf0Var.n && this.o == zaf0Var.o;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        xa0 xa0Var = this.d;
        int iHashCode = (this.e.hashCode() + ((iG + (xa0Var == null ? 0 : xa0Var.hashCode())) * 31)) * 31;
        igb igbVar = this.f;
        int iHashCode2 = (this.g.hashCode() + ((iHashCode + (igbVar == null ? 0 : igbVar.a.hashCode())) * 31)) * 31;
        Boolean bool = this.h;
        return Boolean.hashCode(this.o) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }
}
