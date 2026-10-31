package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q7p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ q7p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ovi1 a(d0r d0rVar) {
        byte b = this.a;
        d7p d7pVar = this.b;
        switch (b) {
            case 0:
                em0 em0Var = (em0) d7pVar.c;
                lzn0 lzn0Var = (lzn0) ((kpk) em0Var.d).a.get();
                c8o.l(lzn0Var);
                gw70 gw70VarB = ((zuj) em0Var.b).b();
                c8o.l(gw70VarB);
                return new ovi1(d0rVar, gw70VarB, lzn0Var);
            default:
                h72 h72Var = (h72) ((lbp) d7pVar).c;
                lzn0 lzn0VarC = ((vh00) h72Var.b).c();
                c8o.l(lzn0VarC);
                gw70 gw70VarB2 = ((vh00) h72Var.b).b();
                c8o.l(gw70VarB2);
                return new ovi1(d0rVar, gw70VarB2, lzn0VarC);
        }
    }
}
