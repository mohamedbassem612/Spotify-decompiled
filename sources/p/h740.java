package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h740 {
    public final l1z a;
    public final jo70 b;
    public final w281 c;
    public final sdy d;
    public final xkk1 e;

    public h740(l1z l1zVar, jo70 jo70Var, w281 w281Var, sdy sdyVar, xkk1 xkk1Var) {
        this.a = l1zVar;
        this.b = jo70Var;
        this.c = w281Var;
        this.d = sdyVar;
        this.e = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h740)) {
            return false;
        }
        h740 h740Var = (h740) obj;
        return u890.j(this.a, h740Var.a) && u890.j(this.b, h740Var.b) && u890.j(this.c, h740Var.c) && u890.j(this.d, h740Var.d) && u890.j(this.e, h740Var.e);
    }

    public final int hashCode() {
        l1z l1zVar = this.a;
        int iHashCode = (l1zVar == null ? 0 : l1zVar.hashCode()) * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        w281 w281Var = this.c;
        int iHashCode3 = (iHashCode2 + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        sdy sdyVar = this.d;
        int iC = (iHashCode3 + (sdyVar == null ? 0 : l1d.C(sdyVar.a))) * 31;
        xkk1 xkk1Var = this.e;
        return iC + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
