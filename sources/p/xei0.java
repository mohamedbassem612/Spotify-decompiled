package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xei0 {
    public final nbw0 a;
    public final yo60 b;
    public final jo70 c;
    public final prl d;
    public final xkk1 e;
    public final e2k1 f;
    public final w281 g;
    public final xkk1 h;
    public final l1z i;
    public final mtl j;
    public final hzy k;

    public xei0(nbw0 nbw0Var, yo60 yo60Var, jo70 jo70Var, prl prlVar, xkk1 xkk1Var, e2k1 e2k1Var, w281 w281Var, xkk1 xkk1Var2, l1z l1zVar, mtl mtlVar, hzy hzyVar, int i) {
        xkk1Var2 = (i & 128) != 0 ? null : xkk1Var2;
        hzyVar = (i & 1024) != 0 ? null : hzyVar;
        this.a = nbw0Var;
        this.b = yo60Var;
        this.c = jo70Var;
        this.d = prlVar;
        this.e = xkk1Var;
        this.f = e2k1Var;
        this.g = w281Var;
        this.h = xkk1Var2;
        this.i = l1zVar;
        this.j = mtlVar;
        this.k = hzyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xei0)) {
            return false;
        }
        xei0 xei0Var = (xei0) obj;
        return this.a.equals(xei0Var.a) && u890.j(this.b, xei0Var.b) && u890.j(this.c, xei0Var.c) && u890.j(this.d, xei0Var.d) && u890.j(this.e, xei0Var.e) && u890.j(this.f, xei0Var.f) && u890.j(this.g, xei0Var.g) && u890.j(this.h, xei0Var.h) && u890.j(this.i, xei0Var.i) && u890.j(this.j, xei0Var.j) && u890.j(this.k, xei0Var.k);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yo60 yo60Var = this.b;
        int iHashCode2 = (iHashCode + (yo60Var == null ? 0 : yo60Var.hashCode())) * 31;
        jo70 jo70Var = this.c;
        int iHashCode3 = (iHashCode2 + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        prl prlVar = this.d;
        int iHashCode4 = (iHashCode3 + (prlVar == null ? 0 : prlVar.hashCode())) * 31;
        xkk1 xkk1Var = this.e;
        int iHashCode5 = (iHashCode4 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        e2k1 e2k1Var = this.f;
        int iHashCode6 = (iHashCode5 + (e2k1Var == null ? 0 : Long.hashCode(e2k1Var.a))) * 31;
        w281 w281Var = this.g;
        int iHashCode7 = (iHashCode6 + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        xkk1 xkk1Var2 = this.h;
        int iHashCode8 = (iHashCode7 + (xkk1Var2 == null ? 0 : xkk1Var2.hashCode())) * 31;
        l1z l1zVar = this.i;
        int iHashCode9 = (iHashCode8 + (l1zVar == null ? 0 : l1zVar.hashCode())) * 31;
        mtl mtlVar = this.j;
        int iHashCode10 = (iHashCode9 + (mtlVar == null ? 0 : mtlVar.a.hashCode())) * 31;
        hzy hzyVar = this.k;
        return iHashCode10 + (hzyVar != null ? l1d.C(hzyVar.a) : 0);
    }
}
