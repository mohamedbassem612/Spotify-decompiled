package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cbq0 {
    public final p5j1 a;
    public final ug7 b;

    public cbq0(p5j1 p5j1Var, ug7 ug7Var) {
        this.a = p5j1Var;
        this.b = ug7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbq0)) {
            return false;
        }
        cbq0 cbq0Var = (cbq0) obj;
        return u890.j(this.a, cbq0Var.a) && u890.j(this.b, cbq0Var.b);
    }

    public final int hashCode() {
        p5j1 p5j1Var = this.a;
        int iHashCode = (p5j1Var == null ? 0 : p5j1Var.hashCode()) * 31;
        ug7 ug7Var = this.b;
        return iHashCode + (ug7Var != null ? ug7Var.hashCode() : 0);
    }
}
