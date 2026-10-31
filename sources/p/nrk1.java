package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nrk1 implements rrk1 {
    public final xl61 a;
    public final boolean b;

    public nrk1(xl61 xl61Var, boolean z) {
        this.a = xl61Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrk1)) {
            return false;
        }
        nrk1 nrk1Var = (nrk1) obj;
        return this.a.equals(nrk1Var.a) && this.b == nrk1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
