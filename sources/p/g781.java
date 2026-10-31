package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g781 {
    public final x7i1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public g781(x7i1 x7i1Var, boolean z, boolean z2, boolean z3) {
        this.a = x7i1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g781)) {
            return false;
        }
        g781 g781Var = (g781) obj;
        return u890.j(this.a, g781Var.a) && this.b == g781Var.b && this.c == g781Var.c && this.d == g781Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
