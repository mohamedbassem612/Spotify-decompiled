package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class edk {
    public final xkk1 a;
    public final String b;
    public final String c;
    public final ydk d;
    public final eek e;
    public final d7d f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final boolean k;
    public final Boolean l;
    public final String m;
    public final List n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f11p;

    public edk(xkk1 xkk1Var, String str, String str2, ydk ydkVar, eek eekVar, d7d d7dVar, int i, int i2, String str3, String str4, boolean z, Boolean bool, String str5, List list, String str6, boolean z2) {
        this.a = xkk1Var;
        this.b = str;
        this.c = str2;
        this.d = ydkVar;
        this.e = eekVar;
        this.f = d7dVar;
        this.g = i;
        this.h = i2;
        this.i = str3;
        this.j = str4;
        this.k = z;
        this.l = bool;
        this.m = str5;
        this.n = list;
        this.o = str6;
        this.f11p = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edk)) {
            return false;
        }
        edk edkVar = (edk) obj;
        return u890.j(this.a, edkVar.a) && this.b.equals(edkVar.b) && this.c.equals(edkVar.c) && u890.j(this.d, edkVar.d) && this.e.equals(edkVar.e) && u890.j(this.f, edkVar.f) && this.g == edkVar.g && this.h == edkVar.h && this.i.equals(edkVar.i) && this.j.equals(edkVar.j) && this.k == edkVar.k && u890.j(this.l, edkVar.l) && this.m.equals(edkVar.m) && u890.j(this.n, edkVar.n) && u890.j(this.o, edkVar.o) && this.f11p == edkVar.f11p;
    }

    public final int hashCode() {
        xkk1 xkk1Var = this.a;
        int iD = cy30.d(cy30.d((xkk1Var == null ? 0 : xkk1Var.hashCode()) * 31, 31, this.b), 31, this.c);
        ydk ydkVar = this.d;
        int iF = p3d1.f(this.e.a, (iD + (ydkVar == null ? 0 : ydkVar.hashCode())) * 31, 31);
        d7d d7dVar = this.f;
        int iG = xcg1.g(cy30.d(cy30.d(kaa0.f(this.h, ab80.k(this.g, (iF + (d7dVar == null ? 0 : d7dVar.hashCode())) * 31, 31), 31), 31, this.i), 31, this.j), 31, this.k);
        Boolean bool = this.l;
        int iB = f4i1.b(cy30.d((iG + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.m), 31, this.n);
        String str = this.o;
        return Boolean.hashCode(this.f11p) + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }
}
