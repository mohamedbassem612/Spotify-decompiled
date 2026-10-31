package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sp21 {
    public final long a;
    public final voe1 b;
    public String c;
    public String d = null;
    public Integer e = null;
    public Long f = null;
    public Long g = null;
    public Long h = null;
    public Long i = null;
    public Long j = null;
    public Long k = null;
    public Long l = null;
    public Long m = null;
    public Long n = null;
    public Long o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Long f110p = null;
    public boolean q = false;
    public boolean r = true;
    public gia s = gia.c;
    public int t = 2;
    public voe1 u = null;

    public sp21(long j, voe1 voe1Var, String str) {
        this.a = j;
        this.b = voe1Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp21)) {
            return false;
        }
        sp21 sp21Var = (sp21) obj;
        return this.a == sp21Var.a && this.b.equals(sp21Var.b) && this.c.equals(sp21Var.c) && u890.j(this.d, sp21Var.d) && u890.j(this.e, sp21Var.e) && u890.j(this.f, sp21Var.f) && u890.j(this.g, sp21Var.g) && u890.j(this.h, sp21Var.h) && u890.j(this.i, sp21Var.i) && u890.j(this.j, sp21Var.j) && u890.j(this.k, sp21Var.k) && u890.j(this.l, sp21Var.l) && u890.j(this.m, sp21Var.m) && u890.j(this.n, sp21Var.n) && u890.j(this.o, sp21Var.o) && u890.j(this.f110p, sp21Var.f110p) && this.q == sp21Var.q && this.r == sp21Var.r && this.s == sp21Var.s && this.t == sp21Var.t && u890.j(this.u, sp21Var.u);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.f(Long.hashCode(this.a) * 31, this.b.a, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        Long l = this.f;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.j;
        int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.k;
        int iHashCode8 = (iHashCode7 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.l;
        int iHashCode9 = (iHashCode8 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.m;
        int iHashCode10 = (iHashCode9 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.n;
        int iHashCode11 = (iHashCode10 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.o;
        int iHashCode12 = (iHashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f110p;
        int iK = ab80.k(this.t, (this.s.hashCode() + xcg1.g(xcg1.g((iHashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31, 31, this.q), 31, this.r)) * 31, 31);
        voe1 voe1Var = this.u;
        return iK + (voe1Var != null ? Long.hashCode(voe1Var.a) : 0);
    }
}
