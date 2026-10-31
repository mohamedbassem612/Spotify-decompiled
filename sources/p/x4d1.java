package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x4d1 implements g5d1 {
    public final g7d1 a;
    public final k6d1 b;

    public x4d1(g7d1 g7d1Var, k6d1 k6d1Var) {
        this.a = g7d1Var;
        this.b = k6d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x4d1) {
            x4d1 x4d1Var = (x4d1) obj;
            return this.a.equals(x4d1Var.a) && this.b == x4d1Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
