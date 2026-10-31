package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p4r {
    public final jo70 a;
    public final xkk1 b;
    public final hll c;
    public final a7q0 d;
    public final zoy0 e;
    public final hzy f;
    public final fuj0 g;
    public final dxc0 h;
    public final ldj1 i;
    public final mtl j;
    public final Boolean k;

    public p4r(jo70 jo70Var, xkk1 xkk1Var, hll hllVar, a7q0 a7q0Var, zoy0 zoy0Var, hzy hzyVar, fuj0 fuj0Var, dxc0 dxc0Var, ldj1 ldj1Var, mtl mtlVar, Boolean bool) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = hllVar;
        this.d = a7q0Var;
        this.e = zoy0Var;
        this.f = hzyVar;
        this.g = fuj0Var;
        this.h = dxc0Var;
        this.i = ldj1Var;
        this.j = mtlVar;
        this.k = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4r)) {
            return false;
        }
        p4r p4rVar = (p4r) obj;
        return this.a.equals(p4rVar.a) && u890.j(this.b, p4rVar.b) && u890.j(this.c, p4rVar.c) && u890.j(this.d, p4rVar.d) && u890.j(this.e, p4rVar.e) && u890.j(this.f, p4rVar.f) && u890.j(this.g, p4rVar.g) && u890.j(this.h, p4rVar.h) && u890.j(this.i, p4rVar.i) && u890.j(this.j, p4rVar.j) && u890.j(this.k, p4rVar.k);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        hll hllVar = this.c;
        int iHashCode3 = (iHashCode2 + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        a7q0 a7q0Var = this.d;
        int iHashCode4 = (iHashCode3 + (a7q0Var == null ? 0 : a7q0Var.hashCode())) * 31;
        zoy0 zoy0Var = this.e;
        int iHashCode5 = (iHashCode4 + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        hzy hzyVar = this.f;
        int iC = (iHashCode5 + (hzyVar == null ? 0 : l1d.C(hzyVar.a))) * 31;
        fuj0 fuj0Var = this.g;
        int iHashCode6 = (iC + (fuj0Var == null ? 0 : Boolean.hashCode(fuj0Var.a))) * 31;
        dxc0 dxc0Var = this.h;
        int iHashCode7 = (iHashCode6 + (dxc0Var == null ? 0 : dxc0Var.hashCode())) * 31;
        ldj1 ldj1Var = this.i;
        int iHashCode8 = (iHashCode7 + (ldj1Var == null ? 0 : ldj1Var.a.hashCode())) * 31;
        mtl mtlVar = this.j;
        int iHashCode9 = (iHashCode8 + (mtlVar == null ? 0 : mtlVar.a.hashCode())) * 31;
        Boolean bool = this.k;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }
}
