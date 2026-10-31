package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zh10 implements dbr0 {
    public final p6r0 a;
    public final lik1 b;
    public final u8h1 c;

    public zh10(p6r0 p6r0Var, lik1 lik1Var) {
        u8h1 u8h1VarI = e8h1.b().i();
        this.a = p6r0Var;
        this.b = lik1Var;
        this.c = u8h1VarI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zh10) {
            zh10 zh10Var = (zh10) obj;
            if (this.a == zh10Var.a && this.b.equals(zh10Var.b) && u890.j(this.c, zh10Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b.a);
    }
}
