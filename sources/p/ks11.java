package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ks11 {
    public final hux a;
    public final xu30 b;

    public ks11(hux huxVar, xu30 xu30Var) {
        this.a = huxVar;
        this.b = xu30Var;
    }

    public final xu30 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks11)) {
            return false;
        }
        ks11 ks11Var = (ks11) obj;
        return u890.j(this.a, ks11Var.a) && this.b.equals(ks11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + eqq.k(l1d.C(1) * 31, 31, this.a);
    }
}
