package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class c6n1 {
    public final /* synthetic */ d6n1 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ c6n1(d6n1 d6n1Var, long j, long j2) {
        this.a = d6n1Var;
        this.b = j;
        this.c = j2;
    }

    public final hfp1 a(l7n1 l7n1Var) {
        y5n1 y5n1Var = this.a.a;
        long j = this.c;
        y5n1Var.a.b("requestExpressIntegrityToken(%s)", Long.valueOf(j));
        bsd1 bsd1Var = new bsd1();
        v5n1 v5n1Var = new v5n1(y5n1Var, bsd1Var, l7n1Var, this.b, j, bsd1Var);
        c5n1 c5n1Var = y5n1Var.e;
        c5n1Var.getClass();
        c5n1Var.a().post(new x7n1(c5n1Var, bsd1Var, bsd1Var, v5n1Var));
        return bsd1Var.a;
    }
}
