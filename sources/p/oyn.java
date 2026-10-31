package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oyn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final tn30 g;
    public final String h;
    public final String i = "";
    public final String j = "";
    public final String k;
    public final qyn l;
    public final Set m;
    public final boolean n;
    public final cyn o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cyn f27p;

    public oyn(String str, String str2, String str3, String str4, String str5, int i, tn30 tn30Var, String str6, String str7, qyn qynVar, Set set, boolean z, cyn cynVar, cyn cynVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = tn30Var;
        this.h = str6;
        this.k = str7;
        this.l = qynVar;
        this.m = set;
        this.n = z;
        this.o = cynVar;
        this.f27p = cynVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyn)) {
            return false;
        }
        oyn oynVar = (oyn) obj;
        return u890.j(this.a, oynVar.a) && this.b.equals(oynVar.b) && this.c.equals(oynVar.c) && this.d.equals(oynVar.d) && this.e.equals(oynVar.e) && this.f == oynVar.f && u890.j(this.g, oynVar.g) && u890.j(this.h, oynVar.h) && this.i.equals(oynVar.i) && this.j.equals(oynVar.j) && this.k.equals(oynVar.k) && this.l.equals(oynVar.l) && this.m.equals(oynVar.m) && this.n == oynVar.n && u890.j(this.o, oynVar.o) && u890.j(this.f27p, oynVar.f27p);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = this.f;
        int iC = (iD + (i == 0 ? 0 : l1d.C(i))) * 31;
        tn30 tn30Var = this.g;
        int iHashCode = (iC + (tn30Var == null ? 0 : tn30Var.hashCode())) * 31;
        String str = this.h;
        int iG = xcg1.g(gvg.c((this.l.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, false)) * 31, 31, this.m), 31, this.n);
        cyn cynVar = this.o;
        int iHashCode2 = (iG + (cynVar == null ? 0 : cynVar.hashCode())) * 31;
        cyn cynVar2 = this.f27p;
        return iHashCode2 + (cynVar2 != null ? cynVar2.hashCode() : 0);
    }
}
