package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g1 {
    public final jo70 a;
    public final hzy b;
    public final pnt c;
    public final xkk1 d;
    public final a7q0 e;
    public final zoy0 f;
    public final uio g;
    public final pn30 h;

    public g1(jo70 jo70Var, hzy hzyVar, pnt pntVar, xkk1 xkk1Var, a7q0 a7q0Var, zoy0 zoy0Var, uio uioVar, pn30 pn30Var) {
        this.a = jo70Var;
        this.b = hzyVar;
        this.c = pntVar;
        this.d = xkk1Var;
        this.e = a7q0Var;
        this.f = zoy0Var;
        this.g = uioVar;
        this.h = pn30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.a.equals(g1Var.a) && this.b.equals(g1Var.b) && u890.j(this.c, g1Var.c) && u890.j(this.d, g1Var.d) && u890.j(this.e, g1Var.e) && u890.j(this.f, g1Var.f) && u890.j(this.g, g1Var.g) && u890.j(this.h, g1Var.h);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b.a, this.a.hashCode() * 31, 31);
        pnt pntVar = this.c;
        int iHashCode = (iK + (pntVar == null ? 0 : pntVar.hashCode())) * 31;
        xkk1 xkk1Var = this.d;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        a7q0 a7q0Var = this.e;
        int iHashCode3 = (iHashCode2 + (a7q0Var == null ? 0 : a7q0Var.hashCode())) * 31;
        zoy0 zoy0Var = this.f;
        int iHashCode4 = (iHashCode3 + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        uio uioVar = this.g;
        int iHashCode5 = (iHashCode4 + (uioVar == null ? 0 : uioVar.hashCode())) * 31;
        pn30 pn30Var = this.h;
        return iHashCode5 + (pn30Var != null ? pn30Var.hashCode() : 0);
    }
}
