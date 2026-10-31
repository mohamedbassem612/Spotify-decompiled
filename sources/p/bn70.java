package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bn70 implements dbr0 {
    public final n6r0 a;
    public final lik1 b;
    public final nar0 c;
    public final u8h1 d;

    public bn70(n6r0 n6r0Var, lik1 lik1Var, nar0 nar0Var, u8h1 u8h1Var) {
        this.a = n6r0Var;
        this.b = lik1Var;
        this.c = nar0Var;
        this.d = u8h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn70)) {
            return false;
        }
        bn70 bn70Var = (bn70) obj;
        return u890.j(this.a, bn70Var.a) && u890.j(this.b, bn70Var.b) && u890.j(this.c, bn70Var.c) && u890.j(this.d, bn70Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b.a);
        nar0 nar0Var = this.c;
        return this.d.hashCode() + ((iD + (nar0Var == null ? 0 : nar0Var.hashCode())) * 31);
    }

    public bn70(n6r0 n6r0Var, lik1 lik1Var, v8h1 v8h1Var) {
        this(n6r0Var, lik1Var, mqn1.g(v8h1Var), mqn1.f(v8h1Var));
    }

    public bn70(n6r0 n6r0Var, lik1 lik1Var, nar0 nar0Var) {
        this(n6r0Var, lik1Var, nar0Var, mqn1.e(nar0Var));
    }
}
