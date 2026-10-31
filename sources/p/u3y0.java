package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u3y0 implements y3y0 {
    public final g3d0 a;
    public final cio b;

    public u3y0(g3d0 g3d0Var, cio cioVar) {
        this.a = g3d0Var;
        this.b = cioVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3y0)) {
            return false;
        }
        u3y0 u3y0Var = (u3y0) obj;
        w7x w7xVar = w7x.a;
        return w7xVar.equals(w7xVar) && u890.j(this.a, u3y0Var.a) && u890.j(this.b, u3y0Var.b);
    }

    public final int hashCode() {
        g3d0 g3d0Var = this.a;
        int iHashCode = (g3d0Var == null ? 0 : g3d0Var.hashCode()) * 31;
        cio cioVar = this.b;
        return iHashCode + (cioVar != null ? cioVar.hashCode() : 0);
    }
}
