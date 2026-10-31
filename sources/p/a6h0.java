package p;

import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a6h0 {
    public final long A;
    public final i28 B;
    public final Uri C;
    public final String D;
    public final long E;
    public final Set F;
    public final c380 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;
    public final lpu h;
    public final tv80 i;
    public final boolean j;
    public final zh80 k;
    public final ehv0 l;
    public final boolean m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f3p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final c380 t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public a6h0(c380 c380Var, String str, boolean z, boolean z2, String str2, boolean z3, String str3, lpu lpuVar, tv80 tv80Var, boolean z4, zh80 zh80Var, ehv0 ehv0Var, boolean z5, String str4, String str5, Map map, boolean z6, boolean z7, String str6, c380 c380Var2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, long j, i28 i28Var, Uri uri, String str7, long j2, Set set) {
        this.a = c380Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = z3;
        this.g = str3;
        this.h = lpuVar;
        this.i = tv80Var;
        this.j = z4;
        this.k = zh80Var;
        this.l = ehv0Var;
        this.m = z5;
        this.n = str4;
        this.o = str5;
        this.f3p = map;
        this.q = z6;
        this.r = z7;
        this.s = str6;
        this.t = c380Var2;
        this.u = z8;
        this.v = z9;
        this.w = z10;
        this.x = z11;
        this.y = z12;
        this.z = z13;
        this.A = j;
        this.B = i28Var;
        this.C = uri;
        this.D = str7;
        this.E = j2;
        this.F = set;
    }

    public static a6h0 a(a6h0 a6h0Var, c380 c380Var, String str, boolean z, boolean z2, String str2, boolean z3, lpu lpuVar, tv80 tv80Var, boolean z4, zh80 zh80Var, ehv0 ehv0Var, boolean z5, String str3, String str4, Map map, boolean z6, boolean z7, String str5, c380 c380Var2, boolean z8, long j, i28 i28Var, Uri uri, String str6, long j2, Set set, int i) {
        c380 c380Var3 = (i & 1) != 0 ? a6h0Var.a : c380Var;
        String str7 = (i & 2) != 0 ? a6h0Var.b : str;
        boolean z9 = (i & 4) != 0 ? a6h0Var.c : z;
        boolean z10 = (i & 8) != 0 ? a6h0Var.d : z2;
        String str8 = (i & 16) != 0 ? a6h0Var.e : str2;
        boolean z11 = (i & 32) != 0 ? a6h0Var.f : z3;
        String str9 = (i & 64) != 0 ? a6h0Var.g : null;
        lpu lpuVar2 = (i & 128) != 0 ? a6h0Var.h : lpuVar;
        tv80 tv80Var2 = (i & 256) != 0 ? a6h0Var.i : tv80Var;
        boolean z12 = (i & 512) != 0 ? a6h0Var.j : z4;
        zh80 zh80Var2 = (i & 1024) != 0 ? a6h0Var.k : zh80Var;
        ehv0 ehv0Var2 = (i & 2048) != 0 ? a6h0Var.l : ehv0Var;
        boolean z13 = (i & 4096) != 0 ? a6h0Var.m : z5;
        String str10 = (i & 8192) != 0 ? a6h0Var.n : str3;
        String str11 = (i & 16384) != 0 ? a6h0Var.o : str4;
        Map map2 = (32768 & i) != 0 ? a6h0Var.f3p : map;
        boolean z14 = (65536 & i) != 0 ? a6h0Var.q : z6;
        boolean z15 = (131072 & i) != 0 ? a6h0Var.r : z7;
        String str12 = (262144 & i) != 0 ? a6h0Var.s : str5;
        c380 c380Var4 = (524288 & i) != 0 ? a6h0Var.t : c380Var2;
        boolean z16 = (1048576 & i) != 0 ? a6h0Var.u : false;
        boolean z17 = (2097152 & i) != 0 ? a6h0Var.v : false;
        boolean z18 = a6h0Var.w;
        boolean z19 = a6h0Var.x;
        boolean z20 = a6h0Var.y;
        boolean z21 = (i & 33554432) != 0 ? a6h0Var.z : z8;
        long j3 = (i & 67108864) != 0 ? a6h0Var.A : j;
        i28 i28Var2 = (i & 134217728) != 0 ? a6h0Var.B : i28Var;
        Uri uri2 = (i & 268435456) != 0 ? a6h0Var.C : uri;
        String str13 = (i & 536870912) != 0 ? a6h0Var.D : str6;
        long j4 = (i & 1073741824) != 0 ? a6h0Var.E : j2;
        Set set2 = (i & Integer.MIN_VALUE) != 0 ? a6h0Var.F : set;
        a6h0Var.getClass();
        return new a6h0(c380Var3, str7, z9, z10, str8, z11, str9, lpuVar2, tv80Var2, z12, zh80Var2, ehv0Var2, z13, str10, str11, map2, z14, z15, str12, c380Var4, z16, z17, z18, z19, z20, z21, j3, i28Var2, uri2, str13, j4, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6h0)) {
            return false;
        }
        a6h0 a6h0Var = (a6h0) obj;
        return u890.j(this.a, a6h0Var.a) && u890.j(this.b, a6h0Var.b) && this.c == a6h0Var.c && this.d == a6h0Var.d && u890.j(this.e, a6h0Var.e) && this.f == a6h0Var.f && u890.j(this.g, a6h0Var.g) && this.h.equals(a6h0Var.h) && u890.j(this.i, a6h0Var.i) && this.j == a6h0Var.j && this.k == a6h0Var.k && u890.j(this.l, a6h0Var.l) && this.m == a6h0Var.m && u890.j(this.n, a6h0Var.n) && u890.j(this.o, a6h0Var.o) && u890.j(this.f3p, a6h0Var.f3p) && this.q == a6h0Var.q && this.r == a6h0Var.r && u890.j(this.s, a6h0Var.s) && u890.j(this.t, a6h0Var.t) && this.u == a6h0Var.u && this.v == a6h0Var.v && this.w == a6h0Var.w && this.x == a6h0Var.x && this.y == a6h0Var.y && this.z == a6h0Var.z && this.A == a6h0Var.A && this.B == a6h0Var.B && u890.j(this.C, a6h0Var.C) && u890.j(this.D, a6h0Var.D) && this.E == a6h0Var.E && u890.j(this.F, a6h0Var.F);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int iG2 = xcg1.g((iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        int iHashCode2 = (this.h.hashCode() + ((iG2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        tv80 tv80Var = this.i;
        int iHashCode3 = (this.k.hashCode() + xcg1.g((iHashCode2 + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, 31, this.j)) * 31;
        ehv0 ehv0Var = this.l;
        int iG3 = xcg1.g((iHashCode3 + (ehv0Var == null ? 0 : ehv0Var.hashCode())) * 31, 31, this.m);
        String str4 = this.n;
        int iHashCode4 = (iG3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iG4 = xcg1.g(xcg1.g(cy30.e((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f3p), 31, this.q), 31, this.r);
        String str6 = this.s;
        int iF = cy30.f(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kk0.f(this.t, (iG4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), this.A, 31);
        i28 i28Var = this.B;
        int iHashCode5 = (iF + (i28Var == null ? 0 : i28Var.hashCode())) * 31;
        Uri uri = this.C;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str7 = this.D;
        return this.F.hashCode() + cy30.f((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31, this.E, 31);
    }
}
