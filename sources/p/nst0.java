package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nst0 implements ez00 {
    public final hhc0 a;
    public final ihc0 b;

    public nst0(hhc0 hhc0Var, ihc0 ihc0Var) {
        this.a = hhc0Var;
        this.b = ihc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nst0)) {
            return false;
        }
        nst0 nst0Var = (nst0) obj;
        return this.a.equals(nst0Var.a) && this.b.equals(nst0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
