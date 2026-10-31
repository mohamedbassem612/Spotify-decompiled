package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xcv implements ycv {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final Map l;
    public final int m;

    public /* synthetic */ xcv(String str, String str2, String str3, boolean z, String str4, boolean z2, String str5, boolean z3, boolean z4, int i, Map map, int i2, int i3) {
        this(str, str2, str3, z, z, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? true : z2, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? false : z3, (i3 & 512) != 0 ? false : z4, (i3 & 1024) != 0 ? 1 : i, (i3 & 2048) != 0 ? b7x.a : map, (i3 & 4096) != 0 ? 4 : i2);
    }

    public static xcv c(xcv xcvVar, boolean z, int i) {
        return new xcv(xcvVar.a, xcvVar.b, xcvVar.c, (i & 8) != 0 ? xcvVar.d : true, z, xcvVar.f, xcvVar.g, xcvVar.h, xcvVar.i, xcvVar.j, xcvVar.k, xcvVar.l, xcvVar.m);
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcv)) {
            return false;
        }
        xcv xcvVar = (xcv) obj;
        return u890.j(this.a, xcvVar.a) && u890.j(this.b, xcvVar.b) && u890.j(this.c, xcvVar.c) && this.d == xcvVar.d && this.e == xcvVar.e && u890.j(this.f, xcvVar.f) && this.g == xcvVar.g && u890.j(this.h, xcvVar.h) && this.i == xcvVar.i && this.j == xcvVar.j && this.k == xcvVar.k && u890.j(this.l, xcvVar.l) && this.m == xcvVar.m;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return l1d.C(this.m) + cy30.e(ab80.k(this.k, xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j), 31), 31, this.l);
    }

    public xcv(String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, String str5, boolean z4, boolean z5, int i, Map map, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = z3;
        this.h = str5;
        this.i = z4;
        this.j = z5;
        this.k = i;
        this.l = map;
        this.m = i2;
    }
}
