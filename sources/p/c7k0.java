package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c7k0 implements i7k0 {
    public final ntf1 a;
    public final a7k0 b;

    public c7k0(ntf1 ntf1Var, a7k0 a7k0Var) {
        this.a = ntf1Var;
        this.b = a7k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7k0)) {
            return false;
        }
        c7k0 c7k0Var = (c7k0) obj;
        return this.a.equals(c7k0Var.a) && this.b.equals(c7k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
