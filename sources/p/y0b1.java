package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y0b1 {
    public final int a;
    public final x0b1 b;

    public y0b1(int i, x0b1 x0b1Var) {
        this.a = i;
        this.b = x0b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0b1)) {
            return false;
        }
        y0b1 y0b1Var = (y0b1) obj;
        return this.a == y0b1Var.a && this.b.equals(y0b1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
