package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lai0 {
    public final nbw0 a;
    public final yo60 b;
    public final jo70 c;
    public final zoy0 d;
    public final xkk1 e;
    public final prl f;

    public lai0(nbw0 nbw0Var, yo60 yo60Var, jo70 jo70Var, zoy0 zoy0Var, xkk1 xkk1Var, prl prlVar) {
        this.a = nbw0Var;
        this.b = yo60Var;
        this.c = jo70Var;
        this.d = zoy0Var;
        this.e = xkk1Var;
        this.f = prlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lai0)) {
            return false;
        }
        lai0 lai0Var = (lai0) obj;
        return this.a.equals(lai0Var.a) && this.b.equals(lai0Var.b) && this.c.equals(lai0Var.c) && u890.j(this.d, lai0Var.d) && u890.j(this.e, lai0Var.e) && u890.j(this.f, lai0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        zoy0 zoy0Var = this.d;
        int iHashCode2 = (iHashCode + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        xkk1 xkk1Var = this.e;
        int iHashCode3 = (iHashCode2 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        prl prlVar = this.f;
        return iHashCode3 + (prlVar != null ? prlVar.hashCode() : 0);
    }
}
