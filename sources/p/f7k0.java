package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f7k0 implements i7k0 {
    public final a7k0 a;
    public final String b;

    public f7k0(a7k0 a7k0Var, String str) {
        this.a = a7k0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7k0)) {
            return false;
        }
        f7k0 f7k0Var = (f7k0) obj;
        return this.a.equals(f7k0Var.a) && u890.j(this.b, f7k0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
