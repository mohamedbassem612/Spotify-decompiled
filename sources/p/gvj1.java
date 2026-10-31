package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gvj1 {
    public final jo70 a;
    public final hll b;
    public final pjw0 c;
    public final yo60 d;
    public final zoy0 e;
    public final prl f;
    public final xkk1 g;

    public gvj1(jo70 jo70Var, hll hllVar, pjw0 pjw0Var, yo60 yo60Var, zoy0 zoy0Var, prl prlVar, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = hllVar;
        this.c = pjw0Var;
        this.d = yo60Var;
        this.e = zoy0Var;
        this.f = prlVar;
        this.g = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvj1)) {
            return false;
        }
        gvj1 gvj1Var = (gvj1) obj;
        return this.a.equals(gvj1Var.a) && this.b.equals(gvj1Var.b) && u890.j(this.c, gvj1Var.c) && u890.j(this.d, gvj1Var.d) && u890.j(this.e, gvj1Var.e) && u890.j(this.f, gvj1Var.f) && u890.j(this.g, gvj1Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        pjw0 pjw0Var = this.c;
        int iHashCode2 = (iHashCode + (pjw0Var == null ? 0 : pjw0Var.hashCode())) * 31;
        yo60 yo60Var = this.d;
        int iHashCode3 = (iHashCode2 + (yo60Var == null ? 0 : yo60Var.hashCode())) * 31;
        zoy0 zoy0Var = this.e;
        int iHashCode4 = (iHashCode3 + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        prl prlVar = this.f;
        int iHashCode5 = (iHashCode4 + (prlVar == null ? 0 : prlVar.hashCode())) * 31;
        xkk1 xkk1Var = this.g;
        return iHashCode5 + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
