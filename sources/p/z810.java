package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z810 {
    public final boolean a;
    public final hy50 b;
    public final afv0 c;
    public final boolean d;
    public final d2k1 e;
    public final k4m f;
    public final jfv g;
    public final Long h;
    public final iix0 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f53p;

    public z810(boolean z, hy50 hy50Var, afv0 afv0Var, boolean z2, d2k1 d2k1Var, k4m k4mVar, jfv jfvVar, Long l, iix0 iix0Var, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, boolean z6) {
        this.a = z;
        this.b = hy50Var;
        this.c = afv0Var;
        this.d = z2;
        this.e = d2k1Var;
        this.f = k4mVar;
        this.g = jfvVar;
        this.h = l;
        this.i = iix0Var;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.f53p = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z810)) {
            return false;
        }
        z810 z810Var = (z810) obj;
        return this.a == z810Var.a && this.b.equals(z810Var.b) && u890.j(this.c, z810Var.c) && this.d == z810Var.d && u890.j(this.e, z810Var.e) && this.f == z810Var.f && u890.j(this.g, z810Var.g) && u890.j(this.h, z810Var.h) && this.i.equals(z810Var.i) && this.j == z810Var.j && this.k == z810Var.k && this.l == z810Var.l && u890.j(this.m, z810Var.m) && u890.j(this.n, z810Var.n) && u890.j(this.o, z810Var.o) && this.f53p == z810Var.f53p;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        afv0 afv0Var = this.c;
        int iG = xcg1.g(xcg1.g((iHashCode + (afv0Var == null ? 0 : afv0Var.hashCode())) * 31, 31, this.d), 31, false);
        d2k1 d2k1Var = this.e;
        int iHashCode2 = (iG + (d2k1Var == null ? 0 : d2k1Var.hashCode())) * 31;
        k4m k4mVar = this.f;
        int iHashCode3 = (iHashCode2 + (k4mVar == null ? 0 : k4mVar.hashCode())) * 31;
        jfv jfvVar = this.g;
        int iHashCode4 = (iHashCode3 + (jfvVar == null ? 0 : Long.hashCode(jfvVar.a))) * 31;
        Long l = this.h;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.i.hashCode() + ((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31)) * 31, 31, this.j), 31, true), 31, this.k), 31, this.l);
        String str = this.m;
        return Boolean.hashCode(this.f53p) + cy30.d(cy30.d((iG2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.n), 31, this.o);
    }
}
