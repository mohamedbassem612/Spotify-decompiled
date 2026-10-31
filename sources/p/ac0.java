package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ac0 {
    public final lik1 a;
    public final n6r0 b;
    public final nar0 c;
    public final mir0 d;
    public final pnr0 e;
    public final String f;
    public final vir0 g;

    public ac0(lik1 lik1Var, n6r0 n6r0Var, nar0 nar0Var, mir0 mir0Var, pnr0 pnr0Var, String str, vir0 vir0Var) {
        this.a = lik1Var;
        this.b = n6r0Var;
        this.c = nar0Var;
        this.d = mir0Var;
        this.e = pnr0Var;
        this.f = str;
        this.g = vir0Var;
    }

    public static ac0 a(ac0 ac0Var, lik1 lik1Var, n6r0 n6r0Var, nar0 nar0Var, String str, vir0 vir0Var, int i) {
        if ((i & 1) != 0) {
            lik1Var = ac0Var.a;
        }
        lik1 lik1Var2 = lik1Var;
        if ((i & 2) != 0) {
            n6r0Var = ac0Var.b;
        }
        n6r0 n6r0Var2 = n6r0Var;
        if ((i & 4) != 0) {
            nar0Var = ac0Var.c;
        }
        nar0 nar0Var2 = nar0Var;
        mir0 mir0Var = ac0Var.d;
        pnr0 pnr0Var = ac0Var.e;
        if ((i & 32) != 0) {
            str = ac0Var.f;
        }
        String str2 = str;
        if ((i & 64) != 0) {
            vir0Var = ac0Var.g;
        }
        ac0Var.getClass();
        return new ac0(lik1Var2, n6r0Var2, nar0Var2, mir0Var, pnr0Var, str2, vir0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac0)) {
            return false;
        }
        ac0 ac0Var = (ac0) obj;
        return u890.j(this.a, ac0Var.a) && u890.j(this.b, ac0Var.b) && u890.j(this.c, ac0Var.c) && u890.j(this.d, ac0Var.d) && u890.j(this.e, ac0Var.e) && u890.j(this.f, ac0Var.f) && u890.j(this.g, ac0Var.g);
    }

    public final int hashCode() {
        lik1 lik1Var = this.a;
        int iHashCode = (lik1Var == null ? 0 : lik1Var.a.hashCode()) * 31;
        n6r0 n6r0Var = this.b;
        int iHashCode2 = (iHashCode + (n6r0Var == null ? 0 : n6r0Var.hashCode())) * 31;
        nar0 nar0Var = this.c;
        int iHashCode3 = (iHashCode2 + (nar0Var == null ? 0 : nar0Var.hashCode())) * 31;
        mir0 mir0Var = this.d;
        int iHashCode4 = (iHashCode3 + (mir0Var == null ? 0 : mir0Var.hashCode())) * 31;
        pnr0 pnr0Var = this.e;
        int iHashCode5 = (iHashCode4 + (pnr0Var == null ? 0 : pnr0Var.hashCode())) * 31;
        String str = this.f;
        return this.g.hashCode() + ((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
