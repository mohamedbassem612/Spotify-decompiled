package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fsu0 {
    public final bsu0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public fsu0(bsu0 bsu0Var, boolean z, boolean z2, boolean z3) {
        this.a = bsu0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsu0)) {
            return false;
        }
        fsu0 fsu0Var = (fsu0) obj;
        return this.a.equals(fsu0Var.a) && this.b == fsu0Var.b && this.c == fsu0Var.c && this.d == fsu0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
