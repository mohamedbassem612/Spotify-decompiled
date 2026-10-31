package p;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u310 {
    public final Map A;
    public final String B;
    public final String C;
    public final oz0 D;
    public final Uri E;
    public final q510 F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final Uri f;
    public final Uri g;
    public final Uri h;
    public final Uri i;
    public final Uri j;
    public final Uri k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f67p;
    public final Integer q;
    public final Integer r;
    public final boolean s;
    public final String t;
    public final String u;
    public final Integer v;
    public final y310 w;
    public final String x;
    public final Long y;
    public final String z;

    public /* synthetic */ u310(String str, String str2, String str3, String str4, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, Double d, Integer num, Integer num2, boolean z5, String str5, String str6, Integer num3, int i4, y310 y310Var, String str7, Long l, String str8, Map map, String str9, String str10, oz0 oz0Var, int i5, int i6) {
        this(str, (i5 & 2) != 0 ? null : str2, str3, (i5 & 8) != 0 ? null : str4, (i5 & 16) != 0 ? Uri.EMPTY : uri, (i5 & 32) != 0 ? null : uri2, (i5 & 64) != 0 ? Uri.EMPTY : uri3, (i5 & 128) != 0 ? Uri.EMPTY : uri4, (i5 & 256) != 0 ? Uri.EMPTY : uri5, (i5 & 512) != 0 ? null : uri6, (i5 & 1024) != 0 ? null : uri7, i, (i5 & 4096) != 0 ? false : z, (i5 & 8192) != 0 ? false : z2, (i5 & 16384) != 0 ? false : z3, (32768 & i5) != 0 ? false : z4, (65536 & i5) != 0 ? 3 : i2, (131072 & i5) != 0 ? 4 : i3, (262144 & i5) != 0 ? null : d, (524288 & i5) != 0 ? null : num, (1048576 & i5) != 0 ? null : num2, (2097152 & i5) != 0 ? false : z5, (4194304 & i5) != 0 ? null : str5, (8388608 & i5) != 0 ? null : str6, (16777216 & i5) != 0 ? null : num3, (33554432 & i5) != 0 ? 0 : i4, (67108864 & i5) != 0 ? null : y310Var, (134217728 & i5) != 0 ? null : str7, (268435456 & i5) != 0 ? null : l, (536870912 & i5) != 0 ? null : str8, (1073741824 & i5) != 0 ? b7x.a : map, (i5 & Integer.MIN_VALUE) != 0 ? null : str9, (i6 & 1) != 0 ? null : str10, (i6 & 2) != 0 ? null : oz0Var, (Uri) null, (q510) null);
    }

    public static u310 b(u310 u310Var, String str, String str2, Uri uri, int i, Double d, String str3, int i2, y310 y310Var, String str4, Map map, Uri uri2, q510 q510Var, int i3, int i4) {
        String str5 = (i3 & 1) != 0 ? u310Var.a : str;
        String str6 = u310Var.b;
        String str7 = u310Var.c;
        String str8 = (i3 & 8) != 0 ? u310Var.d : str2;
        Uri uri3 = u310Var.e;
        Uri uri4 = u310Var.f;
        Uri uri5 = (i3 & 64) != 0 ? u310Var.g : uri;
        Uri uri6 = u310Var.h;
        Uri uri7 = u310Var.i;
        Uri uri8 = u310Var.j;
        Uri uri9 = u310Var.k;
        int i5 = u310Var.G;
        boolean z = u310Var.l;
        boolean z2 = u310Var.m;
        boolean z3 = u310Var.n;
        boolean z4 = u310Var.o;
        int i6 = (i3 & 65536) != 0 ? u310Var.H : i;
        int i7 = u310Var.I;
        Double d2 = (i3 & 262144) != 0 ? u310Var.f67p : d;
        Integer num = u310Var.q;
        Integer num2 = u310Var.r;
        boolean z5 = u310Var.s;
        String str9 = (i3 & 4194304) != 0 ? u310Var.t : "home";
        String str10 = (i3 & 8388608) != 0 ? u310Var.u : str3;
        Integer num3 = u310Var.v;
        int i8 = (i3 & 33554432) != 0 ? u310Var.J : i2;
        y310 y310Var2 = (i3 & 67108864) != 0 ? u310Var.w : y310Var;
        String str11 = (i3 & 134217728) != 0 ? u310Var.x : str4;
        Long l = u310Var.y;
        String str12 = u310Var.z;
        Map map2 = (i3 & 1073741824) != 0 ? u310Var.A : map;
        String str13 = u310Var.B;
        String str14 = u310Var.C;
        oz0 oz0Var = u310Var.D;
        Uri uri10 = (i4 & 4) != 0 ? u310Var.E : uri2;
        q510 q510Var2 = (i4 & 8) != 0 ? u310Var.F : q510Var;
        u310Var.getClass();
        return new u310(str5, str6, str7, str8, uri3, uri4, uri5, uri6, uri7, uri8, uri9, i5, z, z2, z3, z4, i6, i7, d2, num, num2, z5, str9, str10, num3, i8, y310Var2, str11, l, str12, map2, str13, str14, oz0Var, uri10, q510Var2);
    }

    public final String a() {
        return this.a;
    }

    public final int c() {
        return this.J;
    }

    public final Uri d() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u310)) {
            return false;
        }
        u310 u310Var = (u310) obj;
        return u890.j(this.a, u310Var.a) && u890.j(this.b, u310Var.b) && u890.j(this.c, u310Var.c) && u890.j(this.d, u310Var.d) && u890.j(this.e, u310Var.e) && u890.j(this.f, u310Var.f) && u890.j(this.g, u310Var.g) && u890.j(this.h, u310Var.h) && u890.j(this.i, u310Var.i) && u890.j(this.j, u310Var.j) && u890.j(this.k, u310Var.k) && this.G == u310Var.G && this.l == u310Var.l && this.m == u310Var.m && this.n == u310Var.n && this.o == u310Var.o && this.H == u310Var.H && this.I == u310Var.I && u890.j(this.f67p, u310Var.f67p) && u890.j(this.q, u310Var.q) && u890.j(this.r, u310Var.r) && this.s == u310Var.s && u890.j(this.t, u310Var.t) && u890.j(this.u, u310Var.u) && u890.j(this.v, u310Var.v) && this.J == u310Var.J && u890.j(this.w, u310Var.w) && u890.j(this.x, u310Var.x) && u890.j(this.y, u310Var.y) && u890.j(this.z, u310Var.z) && u890.j(this.A, u310Var.A) && u890.j(this.B, u310Var.B) && u890.j(this.C, u310Var.C) && u890.j(this.D, u310Var.D) && u890.j(this.E, u310Var.E) && u890.j(this.F, u310Var.F);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.e;
        int iHashCode5 = (iHashCode4 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f;
        int iHashCode6 = (iHashCode5 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.g;
        int iHashCode7 = (iHashCode6 + (uri3 == null ? 0 : uri3.hashCode())) * 31;
        Uri uri4 = this.h;
        int iHashCode8 = (iHashCode7 + (uri4 == null ? 0 : uri4.hashCode())) * 31;
        Uri uri5 = this.i;
        int iHashCode9 = (iHashCode8 + (uri5 == null ? 0 : uri5.hashCode())) * 31;
        Uri uri6 = this.j;
        int iHashCode10 = (iHashCode9 + (uri6 == null ? 0 : uri6.hashCode())) * 31;
        Uri uri7 = this.k;
        int iK = ab80.k(this.I, ab80.k(this.H, xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.G, (iHashCode10 + (uri7 == null ? 0 : uri7.hashCode())) * 31, 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31);
        Double d = this.f67p;
        int iHashCode11 = (iK + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.q;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.r;
        int iG = xcg1.g((iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.s);
        String str4 = this.t;
        int iHashCode13 = (iG + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.u;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.v;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        int i = this.J;
        int iC = (iHashCode15 + (i == 0 ? 0 : l1d.C(i))) * 31;
        y310 y310Var = this.w;
        int iHashCode16 = (iC + (y310Var == null ? 0 : y310Var.a.hashCode())) * 31;
        String str6 = this.x;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.y;
        int iHashCode18 = (iHashCode17 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.z;
        int iE = cy30.e((iHashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.A);
        String str8 = this.B;
        int iHashCode19 = (iE + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.C;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        oz0 oz0Var = this.D;
        int iHashCode21 = (iHashCode20 + (oz0Var == null ? 0 : oz0Var.hashCode())) * 31;
        Uri uri8 = this.E;
        int iHashCode22 = (iHashCode21 + (uri8 == null ? 0 : uri8.hashCode())) * 31;
        q510 q510Var = this.F;
        return iHashCode22 + (q510Var != null ? q510Var.hashCode() : 0);
    }

    public u310(String str, String str2, String str3, String str4, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, Double d, Integer num, Integer num2, boolean z5, String str5, String str6, Integer num3, int i4, y310 y310Var, String str7, Long l, String str8, Map map, String str9, String str10, oz0 oz0Var, Uri uri8, q510 q510Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = uri2;
        this.g = uri3;
        this.h = uri4;
        this.i = uri5;
        this.j = uri6;
        this.k = uri7;
        this.G = i;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.H = i2;
        this.I = i3;
        this.f67p = d;
        this.q = num;
        this.r = num2;
        this.s = z5;
        this.t = str5;
        this.u = str6;
        this.v = num3;
        this.J = i4;
        this.w = y310Var;
        this.x = str7;
        this.y = l;
        this.z = str8;
        this.A = map;
        this.B = str9;
        this.C = str10;
        this.D = oz0Var;
        this.E = uri8;
        this.F = q510Var;
    }
}
