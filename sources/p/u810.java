package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u810 {
    public final hwt a;
    public final oox0 b;
    public final yo60 c;
    public final prl d;

    public u810(hwt hwtVar, oox0 oox0Var, yo60 yo60Var, prl prlVar) {
        this.a = hwtVar;
        this.b = oox0Var;
        this.c = yo60Var;
        this.d = prlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u810)) {
            return false;
        }
        u810 u810Var = (u810) obj;
        return u890.j(this.a, u810Var.a) && this.b.equals(u810Var.b) && this.c.equals(u810Var.c) && u890.j(this.d, u810Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        prl prlVar = this.d;
        return iHashCode + (prlVar == null ? 0 : prlVar.hashCode());
    }
}
