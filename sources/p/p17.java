package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p17 {
    public final h07 a;
    public final vno1 b;

    public p17(h07 h07Var, vno1 vno1Var) {
        this.a = h07Var;
        this.b = vno1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p17)) {
            return false;
        }
        p17 p17Var = (p17) obj;
        return this.a.equals(p17Var.a) && this.b.equals(p17Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + ((mpi1.i.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
