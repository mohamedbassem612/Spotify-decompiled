package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p6j1 {
    public final oox0 a;
    public final yo60 b;
    public final prl c;

    public p6j1(oox0 oox0Var, yo60 yo60Var, prl prlVar) {
        this.a = oox0Var;
        this.b = yo60Var;
        this.c = prlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6j1)) {
            return false;
        }
        p6j1 p6j1Var = (p6j1) obj;
        return this.a.equals(p6j1Var.a) && this.b.equals(p6j1Var.b) && u890.j(this.c, p6j1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        prl prlVar = this.c;
        return iHashCode + (prlVar == null ? 0 : prlVar.hashCode());
    }
}
