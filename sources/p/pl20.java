package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pl20 {
    public final dm20 a;
    public final tm20 b;
    public final q4r c;

    public pl20(dm20 dm20Var, tm20 tm20Var, q4r q4rVar) {
        this.a = dm20Var;
        this.b = tm20Var;
        this.c = q4rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl20)) {
            return false;
        }
        pl20 pl20Var = (pl20) obj;
        return this.a.equals(pl20Var.a) && this.b.equals(pl20Var.b) && u890.j(this.c, pl20Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        q4r q4rVar = this.c;
        return iHashCode + (q4rVar == null ? 0 : q4rVar.hashCode());
    }
}
