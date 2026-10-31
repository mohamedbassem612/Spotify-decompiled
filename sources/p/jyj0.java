package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jyj0 {
    public final a7k0 a;
    public final a7k0 b;

    public jyj0(a7k0 a7k0Var, a7k0 a7k0Var2) {
        this.a = a7k0Var;
        this.b = a7k0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyj0)) {
            return false;
        }
        jyj0 jyj0Var = (jyj0) obj;
        return this.a.equals(jyj0Var.a) && this.b.equals(jyj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
