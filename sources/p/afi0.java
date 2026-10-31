package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class afi0 {
    public final t810 a;
    public final xei0 b;

    public afi0(t810 t810Var, xei0 xei0Var) {
        this.a = t810Var;
        this.b = xei0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afi0)) {
            return false;
        }
        afi0 afi0Var = (afi0) obj;
        return this.a.equals(afi0Var.a) && u890.j(this.b, afi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
