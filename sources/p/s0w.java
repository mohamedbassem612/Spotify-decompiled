package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s0w {
    public final boolean A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final hb9 i;
    public final Integer j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final xb41 n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f13p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final lrz0 x;
    public final boolean y;
    public final boolean z;

    public s0w(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, hb9 hb9Var, Integer num, boolean z4, int i, boolean z5, xb41 xb41Var, String str6, boolean z6, String str7, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, lrz0 lrz0Var, boolean z13, boolean z14, boolean z15, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str4;
        this.h = str5;
        this.i = hb9Var;
        this.j = num;
        this.k = z4;
        this.l = i;
        this.m = z5;
        this.n = xb41Var;
        this.o = str6;
        this.f13p = z6;
        this.q = str7;
        this.r = z7;
        this.s = z8;
        this.t = z9;
        this.u = z10;
        this.v = z11;
        this.w = z12;
        this.x = lrz0Var;
        this.y = z13;
        this.z = z14;
        this.A = z15;
        this.B = str8;
        boolean z16 = true;
        boolean z17 = z || z3 || z6 || z7;
        this.C = z17;
        this.D = z17 && ihc1.e1(str3).toString().length() > 0;
        if (jhc1.F(str5) && (jhc1.F(str4) || !z4 || z3)) {
            z16 = false;
        }
        this.E = z16;
    }

    public static s0w a(s0w s0wVar, String str, boolean z, String str2, hb9 hb9Var, Integer num, boolean z2, xb41 xb41Var, String str3, String str4, int i) {
        String str5 = s0wVar.a;
        String str6 = s0wVar.b;
        String str7 = (i & 4) != 0 ? s0wVar.c : str;
        boolean z3 = (i & 8) != 0 ? s0wVar.d : true;
        s0wVar.getClass();
        boolean z4 = (i & 32) != 0 ? s0wVar.e : z;
        boolean z5 = (i & 64) != 0 ? s0wVar.f : true;
        String str8 = str7;
        boolean z6 = z3;
        boolean z7 = z4;
        String str9 = s0wVar.g;
        String str10 = (i & 256) != 0 ? s0wVar.h : str2;
        hb9 hb9Var2 = (i & 512) != 0 ? s0wVar.i : hb9Var;
        Integer num2 = (i & 1024) != 0 ? s0wVar.j : num;
        hb9 hb9Var3 = hb9Var2;
        boolean z8 = s0wVar.k;
        boolean z9 = z5;
        String str11 = str10;
        Integer num3 = num2;
        int i2 = s0wVar.l;
        boolean z10 = (i & 8192) != 0 ? s0wVar.m : z2;
        xb41 xb41Var2 = (i & 16384) != 0 ? s0wVar.n : xb41Var;
        String str12 = (i & 32768) != 0 ? s0wVar.o : str3;
        boolean z11 = (i & 65536) != 0 ? s0wVar.f13p : true;
        String str13 = (i & 131072) != 0 ? s0wVar.q : str4;
        boolean z12 = (i & 262144) != 0 ? s0wVar.r : true;
        s0wVar.getClass();
        s0wVar.getClass();
        boolean z13 = s0wVar.s;
        boolean z14 = s0wVar.t;
        boolean z15 = s0wVar.u;
        boolean z16 = s0wVar.v;
        boolean z17 = s0wVar.w;
        lrz0 lrz0Var = s0wVar.x;
        boolean z18 = s0wVar.y;
        boolean z19 = s0wVar.z;
        boolean z20 = s0wVar.A;
        String str14 = s0wVar.B;
        s0wVar.getClass();
        return new s0w(str5, str6, str8, z6, z7, z9, str9, str11, hb9Var3, num3, z8, i2, z10, xb41Var2, str12, z11, str13, z12, z13, z14, z15, z16, z17, lrz0Var, z18, z19, z20, str14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0w)) {
            return false;
        }
        s0w s0wVar = (s0w) obj;
        return u890.j(this.a, s0wVar.a) && u890.j(this.b, s0wVar.b) && u890.j(this.c, s0wVar.c) && this.d == s0wVar.d && this.e == s0wVar.e && this.f == s0wVar.f && u890.j(this.g, s0wVar.g) && u890.j(this.h, s0wVar.h) && u890.j(this.i, s0wVar.i) && u890.j(this.j, s0wVar.j) && this.k == s0wVar.k && this.l == s0wVar.l && this.m == s0wVar.m && this.n.equals(s0wVar.n) && u890.j(this.o, s0wVar.o) && this.f13p == s0wVar.f13p && u890.j(this.q, s0wVar.q) && this.r == s0wVar.r && this.s == s0wVar.s && this.t == s0wVar.t && this.u == s0wVar.u && this.v == s0wVar.v && this.w == s0wVar.w && u890.j(this.x, s0wVar.x) && this.y == s0wVar.y && this.z == s0wVar.z && this.A == s0wVar.A && u890.j(this.B, s0wVar.B);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, false), 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode2 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        hb9 hb9Var = this.i;
        int iHashCode4 = (iHashCode3 + (hb9Var == null ? 0 : hb9Var.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode5 = (this.n.hashCode() + xcg1.g(kaa0.f(this.l, xcg1.g((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.k), 31), 31, this.m)) * 31;
        String str4 = this.o;
        int iG2 = xcg1.g((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f13p);
        String str5 = this.q;
        int iG3 = xcg1.g(xcg1.g(xcg1.g((this.x.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG2 + (str5 == null ? 0 : str5.hashCode())) * 31, 961, this.r), 31, false), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w)) * 31, 31, this.y), 31, this.z), 31, this.A);
        String str6 = this.B;
        return iG3 + (str6 != null ? str6.hashCode() : 0);
    }
}
