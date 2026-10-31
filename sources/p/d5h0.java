package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d5h0 implements h5h0 {
    public final l7c1 a;
    public final boolean b;

    public d5h0(l7c1 l7c1Var, boolean z) {
        this.a = l7c1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5h0)) {
            return false;
        }
        d5h0 d5h0Var = (d5h0) obj;
        return u890.j(this.a, d5h0Var.a) && this.b == d5h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
