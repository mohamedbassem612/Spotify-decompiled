package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g3o0 {
    public final int a;
    public final int b;

    public g3o0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3o0)) {
            return false;
        }
        g3o0 g3o0Var = (g3o0) obj;
        return this.a == g3o0Var.a && this.b == g3o0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
