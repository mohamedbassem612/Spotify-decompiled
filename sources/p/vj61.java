package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vj61 extends ouo1 {
    public final qj61 b;
    public final uj61 c;

    public vj61(qj61 qj61Var, uj61 uj61Var) {
        this.b = qj61Var;
        this.c = uj61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj61)) {
            return false;
        }
        vj61 vj61Var = (vj61) obj;
        return this.b.equals(vj61Var.b) && u890.j(this.c, vj61Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        uj61 uj61Var = this.c;
        return iHashCode + (uj61Var == null ? 0 : uj61Var.a.hashCode());
    }
}
