package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b0t {
    public final f7l1 a;
    public final bbl1 b;

    public b0t(f7l1 f7l1Var, bbl1 bbl1Var) {
        this.a = f7l1Var;
        this.b = bbl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0t)) {
            return false;
        }
        b0t b0tVar = (b0t) obj;
        return u890.j(this.a, b0tVar.a) && u890.j(this.b, b0tVar.b);
    }

    public final int hashCode() {
        f7l1 f7l1Var = this.a;
        int iHashCode = (f7l1Var == null ? 0 : f7l1Var.a.hashCode()) * 31;
        bbl1 bbl1Var = this.b;
        return iHashCode + (bbl1Var != null ? bbl1Var.hashCode() : 0);
    }
}
