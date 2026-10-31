package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g281 {
    public final int A;
    public final Map B;
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final cen j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f29p;
    public final String q;
    public final String r;
    public final int s;
    public final f281 t;
    public final d281 u;
    public final e281 v;
    public final boolean w;
    public final boolean x;
    public final tu00 y;
    public final xwp0 z;

    public /* synthetic */ g281(String str, String str2, String str3, String str4, long j, String str5, String str6, cen cenVar, boolean z, boolean z2, boolean z3, String str7, long j2, String str8, String str9, int i, f281 f281Var, d281 d281Var, e281 e281Var, boolean z4, boolean z5, tu00 tu00Var, xwp0 xwp0Var, int i2, Map map, int i3) {
        this(str, null, 0, str2, str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? null : str6, cenVar, (i3 & 1024) != 0 ? false : z, (i3 & 2048) != 0 ? false : z2, (i3 & 4096) != 0 ? false : z3, (i3 & 8192) != 0 ? "" : str7, false, (32768 & i3) != 0 ? -1L : j2, (65536 & i3) != 0 ? "" : str8, (131072 & i3) != 0 ? "" : str9, (262144 & i3) != 0 ? 0 : i, (524288 & i3) != 0 ? f281.d : f281Var, (1048576 & i3) != 0 ? d281.a : d281Var, (2097152 & i3) != 0 ? e281.a : e281Var, (4194304 & i3) != 0 ? false : z4, (8388608 & i3) != 0 ? false : z5, (16777216 & i3) != 0 ? tu00.a : tu00Var, (33554432 & i3) != 0 ? rwp0.a : xwp0Var, (67108864 & i3) != 0 ? 1 : i2, (i3 & 268435456) != 0 ? b7x.a : map);
    }

    public static g281 a(g281 g281Var, String str) {
        return new g281(str, g281Var.b, g281Var.c, g281Var.d, g281Var.e, g281Var.f, g281Var.g, g281Var.h, g281Var.i, g281Var.j, g281Var.k, g281Var.l, g281Var.m, g281Var.n, g281Var.o, g281Var.f29p, g281Var.q, g281Var.r, g281Var.s, g281Var.t, g281Var.u, g281Var.v, g281Var.w, g281Var.x, g281Var.y, g281Var.z, g281Var.A, g281Var.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g281)) {
            return false;
        }
        g281 g281Var = (g281) obj;
        return u890.j(this.a, g281Var.a) && u890.j(this.b, g281Var.b) && this.c == g281Var.c && u890.j(this.d, g281Var.d) && u890.j(this.e, g281Var.e) && u890.j(this.f, g281Var.f) && this.g == g281Var.g && u890.j(this.h, g281Var.h) && u890.j(this.i, g281Var.i) && u890.j(this.j, g281Var.j) && this.k == g281Var.k && this.l == g281Var.l && this.m == g281Var.m && u890.j(this.n, g281Var.n) && this.o == g281Var.o && this.f29p == g281Var.f29p && u890.j(this.q, g281Var.q) && u890.j(this.r, g281Var.r) && this.s == g281Var.s && this.t == g281Var.t && this.u == g281Var.u && this.v == g281Var.v && this.w == g281Var.w && this.x == g281Var.x && u890.j(this.y, g281Var.y) && u890.j(this.z, g281Var.z) && this.A == g281Var.A && u890.j(this.B, g281Var.B);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(cy30.f(cy30.d(cy30.d(cy30.d(kaa0.f(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d), 31, this.e), 31, this.f), this.g, 31), 31, this.h);
        String str2 = this.i;
        return this.B.hashCode() + xcg1.g(ab80.k(this.A, (this.z.hashCode() + ((this.y.hashCode() + xcg1.g(xcg1.g((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + kaa0.f(this.s, cy30.d(cy30.d(cy30.f(xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g((this.j.hashCode() + ((iD + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), this.f29p, 31), 31, this.q), 31, this.r), 31)) * 31)) * 31)) * 31, 31, this.w), 31, this.x)) * 31)) * 31, 31), 31, false);
    }

    public g281(String str, String str2, int i, String str3, String str4, String str5, long j, String str6, String str7, cen cenVar, boolean z, boolean z2, boolean z3, String str8, boolean z4, long j2, String str9, String str10, int i2, f281 f281Var, d281 d281Var, e281 e281Var, boolean z5, boolean z6, tu00 tu00Var, xwp0 xwp0Var, int i3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = str7;
        this.j = cenVar;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = str8;
        this.o = z4;
        this.f29p = j2;
        this.q = str9;
        this.r = str10;
        this.s = i2;
        this.t = f281Var;
        this.u = d281Var;
        this.v = e281Var;
        this.w = z5;
        this.x = z6;
        this.y = tu00Var;
        this.z = xwp0Var;
        this.A = i3;
        this.B = map;
    }
}
