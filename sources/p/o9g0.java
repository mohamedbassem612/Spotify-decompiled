package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o9g0 extends hki0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final Boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final d850 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f35p;

    public o9g0(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, boolean z, Boolean bool, boolean z2, String str7, String str8, String str9, d850 d850Var, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i2;
        this.i = z;
        this.j = bool;
        this.k = z2;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = d850Var;
        this.f35p = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9g0)) {
            return false;
        }
        o9g0 o9g0Var = (o9g0) obj;
        return this.a.equals(o9g0Var.a) && this.b.equals(o9g0Var.b) && this.c == o9g0Var.c && this.d.equals(o9g0Var.d) && this.e.equals(o9g0Var.e) && this.f.equals(o9g0Var.f) && this.g.equals(o9g0Var.g) && this.h == o9g0Var.h && this.i == o9g0Var.i && u890.j(this.j, o9g0Var.j) && this.k == o9g0Var.k && this.l.equals(o9g0Var.l) && this.m.equals(o9g0Var.m) && this.n.equals(o9g0Var.n) && this.o.equals(o9g0Var.o) && this.f35p == o9g0Var.f35p;
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.h, cy30.d(cy30.d(cy30.d(cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i);
        Boolean bool = this.j;
        return Boolean.hashCode(this.f35p) + ((this.o.hashCode() + cy30.d(cy30.d(cy30.d(xcg1.g((iG + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31);
    }
}
