package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aar0 implements car0 {
    public final lik1 a;
    public final n6r0 b;
    public final String c;

    public aar0(lik1 lik1Var, n6r0 n6r0Var, String str) {
        this.a = lik1Var;
        this.b = n6r0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aar0)) {
            return false;
        }
        aar0 aar0Var = (aar0) obj;
        return u890.j(this.a, aar0Var.a) && u890.j(this.b, aar0Var.b) && u890.j(this.c, aar0Var.c);
    }

    public final int hashCode() {
        lik1 lik1Var = this.a;
        int iHashCode = (lik1Var == null ? 0 : lik1Var.a.hashCode()) * 31;
        n6r0 n6r0Var = this.b;
        int iHashCode2 = (iHashCode + (n6r0Var == null ? 0 : n6r0Var.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
