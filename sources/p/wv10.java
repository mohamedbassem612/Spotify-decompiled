package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wv10 {
    public final uv10 a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final nho0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final String n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f75p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    public wv10(uv10 uv10Var, String str, Long l, boolean z, nho0 nho0Var, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, int i, int i2, String str3, boolean z7, String str4, String str5, boolean z8, boolean z9, boolean z10) {
        this.a = uv10Var;
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = nho0Var;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = str2;
        this.j = z5;
        this.k = z6;
        this.l = i;
        this.m = i2;
        this.n = str3;
        this.o = z7;
        this.f75p = str4;
        this.q = str5;
        this.r = z8;
        this.s = z9;
        this.t = z10;
    }

    public static wv10 a(wv10 wv10Var, uv10 uv10Var, String str, Long l, boolean z, nho0 nho0Var, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, int i, int i2, String str3, boolean z7, String str4, String str5, boolean z8, boolean z9, boolean z10, int i3) {
        uv10 uv10Var2 = (i3 & 1) != 0 ? wv10Var.a : uv10Var;
        return new wv10(uv10Var2, (i3 & 2) != 0 ? wv10Var.b : str, (i3 & 4) != 0 ? wv10Var.c : l, (i3 & 8) != 0 ? wv10Var.d : z, (i3 & 16) != 0 ? wv10Var.e : nho0Var, (i3 & 32) != 0 ? wv10Var.f : z2, (i3 & 64) != 0 ? wv10Var.g : z3, (i3 & 128) != 0 ? wv10Var.h : z4, (i3 & 256) != 0 ? wv10Var.i : str2, (i3 & 512) != 0 ? wv10Var.j : z5, (i3 & 1024) != 0 ? wv10Var.k : z6, (i3 & 2048) != 0 ? wv10Var.l : i, (i3 & 4096) != 0 ? wv10Var.m : i2, (i3 & 8192) != 0 ? wv10Var.n : str3, (i3 & 16384) != 0 ? wv10Var.o : z7, (i3 & 32768) != 0 ? wv10Var.f75p : str4, (i3 & 65536) != 0 ? wv10Var.q : str5, (i3 & 131072) != 0 ? wv10Var.r : z8, (i3 & 262144) != 0 ? wv10Var.s : z9, (i3 & 524288) != 0 ? wv10Var.t : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv10)) {
            return false;
        }
        wv10 wv10Var = (wv10) obj;
        return this.a.equals(wv10Var.a) && u890.j(this.b, wv10Var.b) && u890.j(this.c, wv10Var.c) && this.d == wv10Var.d && u890.j(this.e, wv10Var.e) && this.f == wv10Var.f && this.g == wv10Var.g && this.h == wv10Var.h && u890.j(this.i, wv10Var.i) && this.j == wv10Var.j && this.k == wv10Var.k && this.l == wv10Var.l && this.m == wv10Var.m && u890.j(this.n, wv10Var.n) && this.o == wv10Var.o && this.f75p.equals(wv10Var.f75p) && u890.j(this.q, wv10Var.q) && this.r == wv10Var.r && this.s == wv10Var.s && this.t == wv10Var.t;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int iG = xcg1.g((iD + (l == null ? 0 : l.hashCode())) * 31, 31, this.d);
        nho0 nho0Var = this.e;
        int iG2 = xcg1.g(xcg1.g(xcg1.g((iG + (nho0Var == null ? 0 : nho0Var.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int iF = kaa0.f(this.m, kaa0.f(this.l, xcg1.g(xcg1.g((iG2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31), 31);
        String str2 = this.n;
        int iD2 = cy30.d(xcg1.g((iF + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.o), 31, this.f75p);
        String str3 = this.q;
        return Boolean.hashCode(this.t) + xcg1.g(xcg1.g((iD2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.r), 31, this.s);
    }
}
