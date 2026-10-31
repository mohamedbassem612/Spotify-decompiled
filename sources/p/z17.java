package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z17 implements b27 {
    public final f27 a;
    public final int b;

    public z17(f27 f27Var, int i) {
        this.a = f27Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z17)) {
            return false;
        }
        z17 z17Var = (z17) obj;
        return this.a.equals(z17Var.a) && this.b == z17Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
