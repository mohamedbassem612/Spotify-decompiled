package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xir0 extends x2s {
    public final rr20 b;
    public final w7u0 c;

    public xir0(rr20 rr20Var, w7u0 w7u0Var) {
        super(vf61.d1);
        this.b = rr20Var;
        this.c = w7u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xir0) {
            xir0 xir0Var = (xir0) obj;
            if (this.b == xir0Var.b && this.c == xir0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
