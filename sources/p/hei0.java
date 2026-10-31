package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hei0 {
    public final nbw0 a;
    public final yo60 b;
    public final jo70 c;
    public final prl d;
    public final xkk1 e;

    public hei0(nbw0 nbw0Var, yo60 yo60Var, jo70 jo70Var, prl prlVar, xkk1 xkk1Var) {
        this.a = nbw0Var;
        this.b = yo60Var;
        this.c = jo70Var;
        this.d = prlVar;
        this.e = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hei0)) {
            return false;
        }
        hei0 hei0Var = (hei0) obj;
        return this.a.equals(hei0Var.a) && this.b.equals(hei0Var.b) && u890.j(this.c, hei0Var.c) && u890.j(this.d, hei0Var.d) && u890.j(this.e, hei0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        jo70 jo70Var = this.c;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        prl prlVar = this.d;
        int iHashCode3 = (iHashCode2 + (prlVar == null ? 0 : prlVar.hashCode())) * 31;
        xkk1 xkk1Var = this.e;
        return iHashCode3 + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
