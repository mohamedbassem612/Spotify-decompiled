package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i5h {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final c380 i;
    public final y0q0 j;
    public final String k;
    public final u7h l;
    public final boolean m;
    public final Boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24p;
    public final boolean q;
    public final boolean r;
    public final float s;

    public i5h(String str, int i, String str2, String str3, String str4, String str5, boolean z, boolean z2, c380 c380Var, y0q0 y0q0Var, String str6, u7h u7hVar, boolean z3, Boolean bool, boolean z4, boolean z5, boolean z6, boolean z7, float f) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = c380Var;
        this.j = y0q0Var;
        this.k = str6;
        this.l = u7hVar;
        this.m = z3;
        this.n = bool;
        this.o = z4;
        this.f24p = z5;
        this.q = z6;
        this.r = z7;
        this.s = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5h)) {
            return false;
        }
        i5h i5hVar = (i5h) obj;
        return u890.j(this.a, i5hVar.a) && this.b == i5hVar.b && this.c.equals(i5hVar.c) && u890.j(this.d, i5hVar.d) && u890.j(this.e, i5hVar.e) && u890.j(this.f, i5hVar.f) && this.g == i5hVar.g && this.h == i5hVar.h && u890.j(this.i, i5hVar.i) && u890.j(this.j, i5hVar.j) && u890.j(this.k, i5hVar.k) && u890.j(this.l, i5hVar.l) && this.m == i5hVar.m && u890.j(this.n, i5hVar.n) && this.o == i5hVar.o && this.f24p == i5hVar.f24p && this.q == i5hVar.q && this.r == i5hVar.r && p3v.c(this.s, i5hVar.s);
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iF = kk0.f(this.i, xcg1.g(xcg1.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g), 31, this.h), 31);
        y0q0 y0q0Var = this.j;
        int iHashCode3 = (iF + (y0q0Var == null ? 0 : y0q0Var.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        u7h u7hVar = this.l;
        int iG = xcg1.g((iHashCode4 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31, 31, this.m);
        Boolean bool = this.n;
        return Float.hashCode(this.s) + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.o), 31, this.f24p), 31, this.q), 31, this.r);
    }
}
