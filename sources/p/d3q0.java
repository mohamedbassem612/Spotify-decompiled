package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d3q0 implements e3q0 {
    public final int a;
    public final int b;

    public d3q0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3q0)) {
            return false;
        }
        d3q0 d3q0Var = (d3q0) obj;
        return this.a == d3q0Var.a && this.b == d3q0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
