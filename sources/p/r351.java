package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r351 {
    public final o351 a;
    public final int b;
    public final p351 c;

    public r351(o351 o351Var, int i, p351 p351Var) {
        this.a = o351Var;
        this.b = i;
        this.c = p351Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r351)) {
            return false;
        }
        r351 r351Var = (r351) obj;
        return u890.j(this.a, r351Var.a) && this.b == r351Var.b && u890.j(this.c, r351Var.c);
    }

    public final int hashCode() {
        o351 o351Var = this.a;
        int iK = ab80.k(this.b, (o351Var == null ? 0 : o351Var.hashCode()) * 31, 31);
        p351 p351Var = this.c;
        return iK + (p351Var != null ? p351Var.hashCode() : 0);
    }
}
