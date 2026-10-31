package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j2i0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Uri g;
    public final odn h;
    public final i2i0 i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f36p;
    public final Uri q;
    public final Uri r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;

    public j2i0(String str, String str2, boolean z, String str3, String str4, String str5, Uri uri, odn odnVar, i2i0 i2i0Var, boolean z2, boolean z3, String str6, String str7, String str8, String str9, String str10, Uri uri2, Uri uri3, boolean z4, boolean z5, boolean z6, String str11) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = uri;
        this.h = odnVar;
        this.i = i2i0Var;
        this.j = z2;
        this.k = z3;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.f36p = str10;
        this.q = uri2;
        this.r = uri3;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = str11;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2i0)) {
            return false;
        }
        j2i0 j2i0Var = (j2i0) obj;
        return u890.j(this.a, j2i0Var.a) && u890.j(this.b, j2i0Var.b) && this.c == j2i0Var.c && u890.j(this.d, j2i0Var.d) && u890.j(this.e, j2i0Var.e) && u890.j(this.f, j2i0Var.f) && u890.j(this.g, j2i0Var.g) && u890.j(this.h, j2i0Var.h) && u890.j(this.i, j2i0Var.i) && this.j == j2i0Var.j && this.k == j2i0Var.k && u890.j(this.l, j2i0Var.l) && u890.j(this.m, j2i0Var.m) && u890.j(this.n, j2i0Var.n) && u890.j(this.o, j2i0Var.o) && u890.j(this.f36p, j2i0Var.f36p) && u890.j(this.q, j2i0Var.q) && u890.j(this.r, j2i0Var.r) && this.s == j2i0Var.s && this.t == j2i0Var.t && this.u == j2i0Var.u && u890.j(this.v, j2i0Var.v);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iH = hrt.h(this.g, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        odn odnVar = this.h;
        int iD = cy30.d(cy30.d(xcg1.g(xcg1.g((this.i.hashCode() + ((iH + (odnVar == null ? 0 : odnVar.a.hashCode())) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str5 = this.n;
        return this.v.hashCode() + xcg1.g(xcg1.g(xcg1.g(hrt.h(this.r, hrt.h(this.q, cy30.d(cy30.d((iD + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.o), 31, this.f36p), 31), 31), 31, this.s), 31, this.t), 31, this.u);
    }
}
