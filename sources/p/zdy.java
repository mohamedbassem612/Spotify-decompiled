package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zdy {
    public final String a;
    public final String b;
    public final o17 c;
    public final aey d;
    public final fgx0 e;
    public final boolean f;
    public final String g;
    public final ttm1 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Set m;
    public final String n;
    public final n6r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f56p;

    public zdy(String str, String str2, o17 o17Var, aey aeyVar, fgx0 fgx0Var, boolean z, String str3, ttm1 ttm1Var, boolean z2, boolean z3, boolean z4, boolean z5, Set set, String str4, n6r n6rVar, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = o17Var;
        this.d = aeyVar;
        this.e = fgx0Var;
        this.f = z;
        this.g = str3;
        this.h = ttm1Var;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = set;
        this.n = str4;
        this.o = n6rVar;
        this.f56p = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdy)) {
            return false;
        }
        zdy zdyVar = (zdy) obj;
        return u890.j(this.a, zdyVar.a) && u890.j(this.b, zdyVar.b) && u890.j(this.c, zdyVar.c) && this.d == zdyVar.d && this.e.equals(zdyVar.e) && this.f == zdyVar.f && u890.j(this.g, zdyVar.g) && u890.j(this.h, zdyVar.h) && this.i == zdyVar.i && this.j == zdyVar.j && this.k == zdyVar.k && this.l == zdyVar.l && u890.j(this.m, zdyVar.m) && u890.j(this.n, zdyVar.n) && u890.j(this.o, zdyVar.o) && this.f56p == zdyVar.f56p;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f);
        String str = this.g;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        ttm1 ttm1Var = this.h;
        int iC = gvg.c(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode + (ttm1Var == null ? 0 : ttm1Var.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str2 = this.n;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        n6r n6rVar = this.o;
        return Boolean.hashCode(this.f56p) + ((iHashCode2 + (n6rVar != null ? Long.hashCode(n6rVar.a) : 0)) * 31);
    }
}
