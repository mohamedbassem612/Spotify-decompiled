package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pl6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final d8r0 l;
    public final hl6 m;
    public final boolean n;
    public final il6 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f32p;

    public pl6(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, d8r0 d8r0Var, hl6 hl6Var, boolean z7, il6 il6Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = str5;
        this.l = d8r0Var;
        this.m = hl6Var;
        this.n = z7;
        this.o = il6Var;
        this.f32p = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl6)) {
            return false;
        }
        pl6 pl6Var = (pl6) obj;
        return u890.j(this.a, pl6Var.a) && u890.j(this.b, pl6Var.b) && u890.j(this.c, pl6Var.c) && u890.j(this.d, pl6Var.d) && this.e == pl6Var.e && this.f == pl6Var.f && this.g == pl6Var.g && this.h == pl6Var.h && this.i == pl6Var.i && this.j == pl6Var.j && u890.j(this.k, pl6Var.k) && this.l.equals(pl6Var.l) && u890.j(this.m, pl6Var.m) && this.n == pl6Var.n && u890.j(this.o, pl6Var.o) && this.f32p == pl6Var.f32p;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int i = hrt.i(this.l, cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31);
        hl6 hl6Var = this.m;
        int iG = xcg1.g((i + (hl6Var == null ? 0 : hl6Var.hashCode())) * 31, 31, this.n);
        il6 il6Var = this.o;
        return Integer.hashCode(this.f32p) + ((iG + (il6Var != null ? il6Var.hashCode() : 0)) * 31);
    }
}
