package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g1d0 {
    public final int a;
    public final int b;

    public g1d0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1d0)) {
            return false;
        }
        g1d0 g1d0Var = (g1d0) obj;
        return this.a == g1d0Var.a && this.b == g1d0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
