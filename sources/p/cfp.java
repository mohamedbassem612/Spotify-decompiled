package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cfp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ cfp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yqm0 a(d0r d0rVar, fod0 fod0Var) {
        byte b = this.a;
        xrp xrpVar = this.b;
        switch (b) {
            case 0:
                h72 h72Var = (h72) ((lbp) xrpVar).c;
                lzn0 lzn0VarC = ((vh00) h72Var.b).c();
                c8o.l(lzn0VarC);
                gw70 gw70VarB = ((vh00) h72Var.b).b();
                c8o.l(gw70VarB);
                return new yqm0(lzn0VarC, gw70VarB, d0rVar, fod0Var);
            default:
                b6p b6pVar = (b6p) xrpVar.b;
                lzn0 lzn0Var = (lzn0) ((drj0) b6pVar.b).b;
                c8o.l(lzn0Var);
                gw70 gw70Var = (gw70) ((drj0) b6pVar.b).c;
                c8o.l(gw70Var);
                return new yqm0(lzn0Var, gw70Var, d0rVar, fod0Var);
        }
    }
}
