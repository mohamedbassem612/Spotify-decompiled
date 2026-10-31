package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kob1 {
    public final String a;
    public final String b;
    public final String c;
    public final c380 d;
    public final boolean e;
    public final gm50 f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final String j;
    public final yq01 k;
    public final String l;
    public final String m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f15p;
    public final boolean q;
    public final String r;
    public final boolean s;
    public final hxz0 t;
    public final boolean u;

    public kob1(String str, String str2, String str3, c380 c380Var, boolean z, gm50 gm50Var, boolean z2, String str4, boolean z3, String str5, yq01 yq01Var, String str6, String str7, boolean z4, boolean z5, boolean z6, boolean z7, String str8, boolean z8, hxz0 hxz0Var, boolean z9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c380Var;
        this.e = z;
        this.f = gm50Var;
        this.g = z2;
        this.h = str4;
        this.i = z3;
        this.j = str5;
        this.k = yq01Var;
        this.l = str6;
        this.m = str7;
        this.n = z4;
        this.o = z5;
        this.f15p = z6;
        this.q = z7;
        this.r = str8;
        this.s = z8;
        this.t = hxz0Var;
        this.u = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kob1)) {
            return false;
        }
        kob1 kob1Var = (kob1) obj;
        return u890.j(this.a, kob1Var.a) && u890.j(this.b, kob1Var.b) && u890.j(this.c, kob1Var.c) && this.d.equals(kob1Var.d) && this.e == kob1Var.e && this.f.equals(kob1Var.f) && this.g == kob1Var.g && u890.j(this.h, kob1Var.h) && this.i == kob1Var.i && u890.j(this.j, kob1Var.j) && u890.j(this.k, kob1Var.k) && this.l.equals(kob1Var.l) && u890.j(this.m, kob1Var.m) && this.n == kob1Var.n && this.o == kob1Var.o && this.f15p == kob1Var.f15p && this.q == kob1Var.q && u890.j(this.r, kob1Var.r) && this.s == kob1Var.s && u890.j(this.t, kob1Var.t) && this.u == kob1Var.u;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g(cy30.d(xcg1.g((this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g(kk0.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, false), 31, this.e), 31, false)) * 961, 31, this.g), 31, this.h), 31, this.i);
        String str2 = this.j;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        yq01 yq01Var = this.k;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d((iHashCode + (yq01Var == null ? 0 : yq01Var.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f15p), 31, this.q);
        String str3 = this.r;
        int iG3 = xcg1.g((iG2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.s);
        hxz0 hxz0Var = this.t;
        return Boolean.hashCode(this.u) + ((iG3 + (hxz0Var != null ? hxz0Var.hashCode() : 0)) * 31);
    }
}
