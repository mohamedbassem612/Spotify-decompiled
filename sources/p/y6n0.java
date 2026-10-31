package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y6n0 extends c7n0 {
    public final llw0 a;
    public final jlw0 b;

    public y6n0(llw0 llw0Var, jlw0 jlw0Var) {
        this.a = llw0Var;
        this.b = jlw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6n0)) {
            return false;
        }
        y6n0 y6n0Var = (y6n0) obj;
        return this.a.equals(y6n0Var.a) && this.b.equals(y6n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
