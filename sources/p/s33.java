package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s33 {
    public final lik1 a;
    public final String b;
    public final lqf1 c;
    public final r33 d;
    public final k33 e;

    public s33(lik1 lik1Var, String str, lqf1 lqf1Var, r33 r33Var, k33 k33Var) {
        this.a = lik1Var;
        this.b = str;
        this.c = lqf1Var;
        this.d = r33Var;
        this.e = k33Var;
    }

    public static s33 a(s33 s33Var, lqf1 lqf1Var, r33 r33Var, k33 k33Var, int i) {
        lik1 lik1Var = s33Var.a;
        String str = s33Var.b;
        if ((i & 4) != 0) {
            lqf1Var = s33Var.c;
        }
        lqf1 lqf1Var2 = lqf1Var;
        if ((i & 16) != 0) {
            k33Var = s33Var.e;
        }
        s33Var.getClass();
        return new s33(lik1Var, str, lqf1Var2, r33Var, k33Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s33)) {
            return false;
        }
        s33 s33Var = (s33) obj;
        return u890.j(this.a, s33Var.a) && u890.j(this.b, s33Var.b) && u890.j(this.c, s33Var.c) && u890.j(this.d, s33Var.d) && u890.j(this.e, s33Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        lqf1 lqf1Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (lqf1Var != null ? lqf1Var.hashCode() : 0)) * 31)) * 31);
    }
}
