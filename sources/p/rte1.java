package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rte1 implements yq80 {
    public final qte1 a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final int f;
    public final Long g;
    public final lte1 h;
    public final nte1 i;
    public final String j;
    public final u7h k;
    public final u7h l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pje1 f39p;

    public rte1(qte1 qte1Var, String str, Long l, String str2, String str3, int i, Long l2, lte1 lte1Var, nte1 nte1Var, String str4, u7h u7hVar, u7h u7hVar2, boolean z, boolean z2, boolean z3, pje1 pje1Var) {
        this.a = qte1Var;
        this.b = str;
        this.c = l;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = l2;
        this.h = lte1Var;
        this.i = nte1Var;
        this.j = str4;
        this.k = u7hVar;
        this.l = u7hVar2;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.f39p = pje1Var;
    }

    public final pje1 a() {
        return this.f39p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rte1)) {
            return false;
        }
        rte1 rte1Var = (rte1) obj;
        return this.a.equals(rte1Var.a) && u890.j(this.b, rte1Var.b) && u890.j(this.c, rte1Var.c) && u890.j(this.d, rte1Var.d) && u890.j(this.e, rte1Var.e) && this.f == rte1Var.f && u890.j(this.g, rte1Var.g) && u890.j(this.h, rte1Var.h) && u890.j(this.i, rte1Var.i) && u890.j(this.j, rte1Var.j) && u890.j(this.k, rte1Var.k) && u890.j(this.l, rte1Var.l) && this.m == rte1Var.m && this.n == rte1Var.n && this.o == rte1Var.o && u890.j(this.f39p, rte1Var.f39p);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iD = cy30.d((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iK = ab80.k(this.f, (iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Long l2 = this.g;
        int iHashCode3 = (iK + (l2 == null ? 0 : l2.hashCode())) * 31;
        lte1 lte1Var = this.h;
        int iHashCode4 = (iHashCode3 + (lte1Var == null ? 0 : lte1Var.hashCode())) * 31;
        nte1 nte1Var = this.i;
        int iHashCode5 = (iHashCode4 + (nte1Var == null ? 0 : nte1Var.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        u7h u7hVar = this.k;
        int iHashCode7 = (iHashCode6 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        u7h u7hVar2 = this.l;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode7 + (u7hVar2 == null ? 0 : Long.hashCode(u7hVar2.a))) * 31, 31, this.m), 31, this.n), 31, this.o);
        pje1 pje1Var = this.f39p;
        return iG + (pje1Var != null ? pje1Var.hashCode() : 0);
    }
}
