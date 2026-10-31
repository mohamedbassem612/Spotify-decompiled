package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x1p0 implements y1p0 {
    public final ns60 a;
    public final int b;

    public x1p0(ns60 ns60Var, int i) {
        this.a = ns60Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1p0)) {
            return false;
        }
        x1p0 x1p0Var = (x1p0) obj;
        return u890.j(this.a, x1p0Var.a) && this.b == x1p0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
