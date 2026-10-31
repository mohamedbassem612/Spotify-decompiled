package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n5n1 {
    public final y5n1 a;
    public final d6n1 b;

    public n5n1(y5n1 y5n1Var, d6n1 d6n1Var) {
        this.a = y5n1Var;
        this.b = d6n1Var;
    }

    public final hfp1 a(h7n1 h7n1Var) {
        long j = h7n1Var.a;
        Object[] objArr = {Long.valueOf(j)};
        y5n1 y5n1Var = this.a;
        y5n1Var.a.b("warmUpIntegrityToken(%s)", objArr);
        bsd1 bsd1Var = new bsd1();
        u5n1 u5n1Var = new u5n1(y5n1Var, bsd1Var, j, bsd1Var);
        c5n1 c5n1Var = y5n1Var.e;
        c5n1Var.getClass();
        c5n1Var.a().post(new x7n1(c5n1Var, bsd1Var, bsd1Var, u5n1Var));
        return bsd1Var.a.p(new t8r0(this, h7n1Var));
    }
}
