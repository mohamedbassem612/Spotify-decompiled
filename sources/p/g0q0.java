package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g0q0 implements i0q0 {
    public final boolean a;
    public final boolean b;

    public g0q0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0q0)) {
            return false;
        }
        g0q0 g0q0Var = (g0q0) obj;
        return this.a == g0q0Var.a && this.b == g0q0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
