package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lpy {
    public final String a;
    public final String b;
    public final o17 c;
    public final boolean d;
    public final aey e;
    public final boolean f;
    public final fgx0 g;
    public final ttm1 h;
    public final boolean i;
    public final Set j;
    public final n6r k;
    public final gi l;
    public final String m;
    public final boolean n;
    public final boolean o;

    public lpy(String str, String str2, o17 o17Var, boolean z, aey aeyVar, boolean z2, fgx0 fgx0Var, ttm1 ttm1Var, boolean z3, Set set, n6r n6rVar, gi giVar, String str3, boolean z4, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = o17Var;
        this.d = z;
        this.e = aeyVar;
        this.f = z2;
        this.g = fgx0Var;
        this.h = ttm1Var;
        this.i = z3;
        this.j = set;
        this.k = n6rVar;
        this.l = giVar;
        this.m = str3;
        this.n = z4;
        this.o = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpy)) {
            return false;
        }
        lpy lpyVar = (lpy) obj;
        return u890.j(this.a, lpyVar.a) && u890.j(this.b, lpyVar.b) && u890.j(this.c, lpyVar.c) && this.d == lpyVar.d && this.e == lpyVar.e && this.f == lpyVar.f && this.g.equals(lpyVar.g) && u890.j(this.h, lpyVar.h) && this.i == lpyVar.i && this.j.equals(lpyVar.j) && u890.j(this.k, lpyVar.k) && this.l.equals(lpyVar.l) && u890.j(this.m, lpyVar.m) && this.n == lpyVar.n && this.o == lpyVar.o;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + xcg1.g((this.e.hashCode() + xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31, 31, this.f)) * 961;
        ttm1 ttm1Var = this.h;
        int iC = gvg.c(xcg1.g((iHashCode + (ttm1Var == null ? 0 : ttm1Var.hashCode())) * 31, 31, this.i), 31, this.j);
        n6r n6rVar = this.k;
        int iHashCode2 = (this.l.hashCode() + ((iC + (n6rVar == null ? 0 : Long.hashCode(n6rVar.a))) * 31)) * 31;
        String str = this.m;
        return Boolean.hashCode(this.o) + xcg1.g((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.n);
    }
}
