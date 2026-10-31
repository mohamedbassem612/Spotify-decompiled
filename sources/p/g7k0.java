package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g7k0 implements i7k0 {
    public final a7k0 a;
    public final a7k0 b;

    public g7k0(a7k0 a7k0Var, a7k0 a7k0Var2) {
        this.a = a7k0Var;
        this.b = a7k0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7k0)) {
            return false;
        }
        g7k0 g7k0Var = (g7k0) obj;
        return this.a.equals(g7k0Var.a) && this.b.equals(g7k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
