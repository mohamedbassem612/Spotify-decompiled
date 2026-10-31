package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a7k0 {
    public final d0k0 a;
    public final ilk0 b;

    public a7k0(d0k0 d0k0Var, ilk0 ilk0Var) {
        this.a = d0k0Var;
        this.b = ilk0Var;
    }

    public static a7k0 a(a7k0 a7k0Var, ilk0 ilk0Var) {
        d0k0 d0k0Var = a7k0Var.a;
        a7k0Var.getClass();
        return new a7k0(d0k0Var, ilk0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7k0)) {
            return false;
        }
        a7k0 a7k0Var = (a7k0) obj;
        return this.a.equals(a7k0Var.a) && this.b.equals(a7k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
