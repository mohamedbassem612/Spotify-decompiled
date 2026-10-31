package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x9r0 implements car0 {
    public final lik1 a;
    public final n6r0 b;
    public final mir0 c;
    public final String d;

    public /* synthetic */ x9r0(lik1 lik1Var, n6r0 n6r0Var, mir0 mir0Var, String str, int i) {
        this(lik1Var, n6r0Var, (i & 4) != 0 ? null : mir0Var, (i & 8) != 0 ? null : str);
    }

    public static x9r0 a(x9r0 x9r0Var, mir0 mir0Var) {
        return new x9r0(x9r0Var.a, x9r0Var.b, mir0Var, x9r0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9r0)) {
            return false;
        }
        x9r0 x9r0Var = (x9r0) obj;
        return u890.j(this.a, x9r0Var.a) && u890.j(this.b, x9r0Var.b) && u890.j(this.c, x9r0Var.c) && u890.j(this.d, x9r0Var.d);
    }

    public final int hashCode() {
        lik1 lik1Var = this.a;
        int iHashCode = (lik1Var == null ? 0 : lik1Var.a.hashCode()) * 31;
        n6r0 n6r0Var = this.b;
        int iHashCode2 = (iHashCode + (n6r0Var == null ? 0 : n6r0Var.hashCode())) * 31;
        mir0 mir0Var = this.c;
        int iHashCode3 = (iHashCode2 + (mir0Var == null ? 0 : mir0Var.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public x9r0(lik1 lik1Var, n6r0 n6r0Var, mir0 mir0Var, String str) {
        this.a = lik1Var;
        this.b = n6r0Var;
        this.c = mir0Var;
        this.d = str;
    }
}
