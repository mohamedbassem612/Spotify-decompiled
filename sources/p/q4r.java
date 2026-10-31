package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q4r {
    public final jo70 a;
    public final xkk1 b;
    public final hll c;
    public final a7q0 d;
    public final zoy0 e;
    public final ldj1 f;
    public final mtl g;
    public final String h;
    public final String i;
    public final String j;
    public final vnb1 k;
    public final boolean l;
    public final t351 m;
    public final qfd n;

    public q4r(jo70 jo70Var, xkk1 xkk1Var, hll hllVar, a7q0 a7q0Var, zoy0 zoy0Var, ldj1 ldj1Var, mtl mtlVar, String str, String str2, String str3, vnb1 vnb1Var, boolean z, t351 t351Var, qfd qfdVar) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = hllVar;
        this.d = a7q0Var;
        this.e = zoy0Var;
        this.f = ldj1Var;
        this.g = mtlVar;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = vnb1Var;
        this.l = z;
        this.m = t351Var;
        this.n = qfdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4r)) {
            return false;
        }
        q4r q4rVar = (q4r) obj;
        return u890.j(this.a, q4rVar.a) && u890.j(this.b, q4rVar.b) && u890.j(this.c, q4rVar.c) && u890.j(this.d, q4rVar.d) && u890.j(this.e, q4rVar.e) && u890.j(this.f, q4rVar.f) && u890.j(this.g, q4rVar.g) && u890.j(this.h, q4rVar.h) && u890.j(this.i, q4rVar.i) && u890.j(this.j, q4rVar.j) && u890.j(this.k, q4rVar.k) && this.l == q4rVar.l && u890.j(this.m, q4rVar.m) && u890.j(this.n, q4rVar.n);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        hll hllVar = this.c;
        int iHashCode3 = (iHashCode2 + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        a7q0 a7q0Var = this.d;
        int iHashCode4 = (iHashCode3 + (a7q0Var == null ? 0 : a7q0Var.hashCode())) * 31;
        zoy0 zoy0Var = this.e;
        int iHashCode5 = (iHashCode4 + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        ldj1 ldj1Var = this.f;
        int iHashCode6 = (iHashCode5 + (ldj1Var == null ? 0 : ldj1Var.a.hashCode())) * 31;
        mtl mtlVar = this.g;
        int iHashCode7 = (iHashCode6 + (mtlVar == null ? 0 : mtlVar.a.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        vnb1 vnb1Var = this.k;
        int iG = xcg1.g((iHashCode10 + (vnb1Var == null ? 0 : vnb1Var.hashCode())) * 31, 31, this.l);
        t351 t351Var = this.m;
        int iHashCode11 = (iG + (t351Var == null ? 0 : t351Var.hashCode())) * 31;
        qfd qfdVar = this.n;
        return iHashCode11 + (qfdVar != null ? qfdVar.hashCode() : 0);
    }
}
