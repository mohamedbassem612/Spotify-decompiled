package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q160 {
    public final boolean a;
    public final boolean b;
    public final x0x0 c;
    public final boolean d;
    public final uf20 e;

    public q160(boolean z, boolean z2, x0x0 x0x0Var, boolean z3, uf20 uf20Var) {
        this.a = z;
        this.b = z2;
        this.c = x0x0Var;
        this.d = z3;
        this.e = uf20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q160)) {
            return false;
        }
        q160 q160Var = (q160) obj;
        return this.a == q160Var.a && this.b == q160Var.b && u890.j(this.c, q160Var.c) && this.d == q160Var.d && this.e.equals(q160Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g((this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }
}
