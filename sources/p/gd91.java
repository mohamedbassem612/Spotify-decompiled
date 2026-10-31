package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gd91 {
    public final boolean a;
    public final fy50 b;
    public final boolean c;
    public final afv0 d;
    public final boolean e;
    public final boolean f;
    public final d2k1 g;
    public final k4m h;
    public final jfv i;
    public final Long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f4p;
    public final boolean q;

    public gd91(boolean z, fy50 fy50Var, boolean z2, afv0 afv0Var, boolean z3, boolean z4, d2k1 d2k1Var, k4m k4mVar, jfv jfvVar, Long l, boolean z5, boolean z6, boolean z7, String str, String str2, String str3, boolean z8) {
        this.a = z;
        this.b = fy50Var;
        this.c = z2;
        this.d = afv0Var;
        this.e = z3;
        this.f = z4;
        this.g = d2k1Var;
        this.h = k4mVar;
        this.i = jfvVar;
        this.j = l;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = str;
        this.o = str2;
        this.f4p = str3;
        this.q = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd91)) {
            return false;
        }
        gd91 gd91Var = (gd91) obj;
        return this.a == gd91Var.a && u890.j(this.b, gd91Var.b) && this.c == gd91Var.c && u890.j(this.d, gd91Var.d) && this.e == gd91Var.e && this.f == gd91Var.f && u890.j(this.g, gd91Var.g) && this.h == gd91Var.h && u890.j(this.i, gd91Var.i) && u890.j(this.j, gd91Var.j) && this.k == gd91Var.k && this.l == gd91Var.l && this.m == gd91Var.m && u890.j(this.n, gd91Var.n) && u890.j(this.o, gd91Var.o) && u890.j(this.f4p, gd91Var.f4p) && this.q == gd91Var.q;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        fy50 fy50Var = this.b;
        int iG = xcg1.g((iHashCode + (fy50Var == null ? 0 : fy50Var.hashCode())) * 31, 31, this.c);
        afv0 afv0Var = this.d;
        int iG2 = xcg1.g(xcg1.g(xcg1.g((iG + (afv0Var == null ? 0 : afv0Var.hashCode())) * 31, 31, this.e), 31, this.f), 31, false);
        d2k1 d2k1Var = this.g;
        int iHashCode2 = (iG2 + (d2k1Var == null ? 0 : d2k1Var.hashCode())) * 31;
        k4m k4mVar = this.h;
        int iHashCode3 = (iHashCode2 + (k4mVar == null ? 0 : k4mVar.hashCode())) * 31;
        jfv jfvVar = this.i;
        int iHashCode4 = (iHashCode3 + (jfvVar == null ? 0 : Long.hashCode(jfvVar.a))) * 31;
        Long l = this.j;
        int iG3 = xcg1.g(xcg1.g(xcg1.g((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m);
        String str = this.n;
        return Boolean.hashCode(this.q) + cy30.d(cy30.d((iG3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.o), 31, this.f4p);
    }
}
