package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h881 {
    public final String a;
    public final String b;
    public final g881 c;
    public final String d;
    public final boolean e;
    public final String f;
    public final int g;
    public final Long h;
    public final boolean i;
    public final r9v0 j;
    public final zc8 k;
    public final w281 l;
    public final iam m;
    public final xkk1 n;
    public final zoy0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hll f8p;
    public final xlw0 q;
    public final jo70 r;

    public h881(String str, String str2, g881 g881Var, String str3, boolean z, String str4, int i, Long l, boolean z2, r9v0 r9v0Var, zc8 zc8Var, w281 w281Var, iam iamVar, xkk1 xkk1Var, zoy0 zoy0Var, hll hllVar, xlw0 xlw0Var, jo70 jo70Var) {
        this.a = str;
        this.b = str2;
        this.c = g881Var;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = i;
        this.h = l;
        this.i = z2;
        this.j = r9v0Var;
        this.k = zc8Var;
        this.l = w281Var;
        this.m = iamVar;
        this.n = xkk1Var;
        this.o = zoy0Var;
        this.f8p = hllVar;
        this.q = xlw0Var;
        this.r = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h881)) {
            return false;
        }
        h881 h881Var = (h881) obj;
        return u890.j(this.a, h881Var.a) && u890.j(this.b, h881Var.b) && this.c.equals(h881Var.c) && u890.j(this.d, h881Var.d) && this.e == h881Var.e && u890.j(this.f, h881Var.f) && this.g == h881Var.g && u890.j(this.h, h881Var.h) && this.i == h881Var.i && u890.j(this.j, h881Var.j) && u890.j(this.k, h881Var.k) && u890.j(this.l, h881Var.l) && this.m.equals(h881Var.m) && u890.j(this.n, h881Var.n) && u890.j(this.o, h881Var.o) && u890.j(this.f8p, h881Var.f8p) && u890.j(this.q, h881Var.q) && u890.j(this.r, h881Var.r);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(cy30.d((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int iK = ab80.k(this.g, (iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Long l = this.h;
        int iG2 = xcg1.g((iK + (l == null ? 0 : l.hashCode())) * 31, 31, this.i);
        r9v0 r9v0Var = this.j;
        int iHashCode2 = (iG2 + (r9v0Var == null ? 0 : r9v0Var.a.hashCode())) * 31;
        zc8 zc8Var = this.k;
        int iHashCode3 = (iHashCode2 + (zc8Var == null ? 0 : zc8Var.hashCode())) * 31;
        w281 w281Var = this.l;
        int iK2 = ab80.k(this.m.a, (iHashCode3 + (w281Var == null ? 0 : w281Var.hashCode())) * 31, 31);
        xkk1 xkk1Var = this.n;
        int iHashCode4 = (iK2 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        zoy0 zoy0Var = this.o;
        int iHashCode5 = (iHashCode4 + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        hll hllVar = this.f8p;
        int iHashCode6 = (iHashCode5 + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        xlw0 xlw0Var = this.q;
        int iHashCode7 = (iHashCode6 + (xlw0Var == null ? 0 : xlw0Var.a.hashCode())) * 31;
        jo70 jo70Var = this.r;
        return iHashCode7 + (jo70Var != null ? jo70Var.hashCode() : 0);
    }
}
