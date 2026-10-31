package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d7k0 implements i7k0 {
    public final a7k0 a;
    public final a7k0 b;
    public final woo c;

    public d7k0(a7k0 a7k0Var, a7k0 a7k0Var2, woo wooVar) {
        this.a = a7k0Var;
        this.b = a7k0Var2;
        this.c = wooVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7k0)) {
            return false;
        }
        d7k0 d7k0Var = (d7k0) obj;
        return this.a.equals(d7k0Var.a) && this.b.equals(d7k0Var.b) && u890.j(this.c, d7k0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        woo wooVar = this.c;
        return iHashCode + (wooVar == null ? 0 : wooVar.hashCode());
    }
}
