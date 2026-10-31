package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a3k0 implements k4k0 {
    public final j7k0 a;
    public final String b;

    public a3k0(j7k0 j7k0Var, String str) {
        this.a = j7k0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3k0)) {
            return false;
        }
        a3k0 a3k0Var = (a3k0) obj;
        return this.a.equals(a3k0Var.a) && u890.j(this.b, a3k0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
