package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g2n0 {
    public final boolean a;
    public final f2n0 b;

    public g2n0(boolean z, f2n0 f2n0Var) {
        this.a = z;
        this.b = f2n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2n0)) {
            return false;
        }
        g2n0 g2n0Var = (g2n0) obj;
        return this.a == g2n0Var.a && this.b.equals(g2n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
