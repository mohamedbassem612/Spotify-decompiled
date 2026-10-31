package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class adh0 implements dk80 {
    public final short a;

    /* JADX WARN: Multi-variable type inference failed */
    public adh0(int i) {
        this.a = i;
        if (i >= 0) {
            return;
        }
        tf80.a("maxLength must be at least zero");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adh0) && this.a == ((adh0) obj).a;
    }

    public final void g(e261 e261Var) {
        mma0[] mma0VarArr = b261.a;
        d261 d261Var = z161.R;
        mma0 mma0Var = b261.a[29];
        Integer numValueOf = Integer.valueOf(this.a);
        d261Var.getClass();
        e261Var.b(d261Var, numValueOf);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final void i(h4e1 h4e1Var) {
        if (h4e1Var.c.length() > this.a) {
            h4e1Var.m();
        }
    }

    public final String toString() {
        return gvg.e(this.a, "InputTransformation.maxLength(", ")");
    }
}
