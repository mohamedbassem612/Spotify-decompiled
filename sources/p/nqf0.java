package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nqf0 {
    public final ksf0 a;
    public final iu30 b;

    public nqf0(ksf0 ksf0Var, iu30 iu30Var) {
        this.a = ksf0Var;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqf0)) {
            return false;
        }
        nqf0 nqf0Var = (nqf0) obj;
        return this.a.equals(nqf0Var.a) && u890.j(this.b, nqf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
