package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vnq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ vnq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yon a(lik1 lik1Var) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                wj3 wj3Var = (wj3) ((ykq) jly0Var).c;
                xrc0 xrc0Var = (xrc0) ((d111) wj3Var.c).k.get();
                c8o.l(xrc0Var);
                agc0 agc0Var = (agc0) ((d111) wj3Var.c).w.get();
                c8o.l(agc0Var);
                q7j0 q7j0Var = new q7j0(agc0Var);
                cfr cfrVar = (cfr) ((d111) wj3Var.c).A.get();
                c8o.l(cfrVar);
                return new yon(lik1Var, xrc0Var, q7j0Var, cfrVar, (byte) 10);
            default:
                h72 h72Var = (h72) ((ipq) jly0Var).c;
                xrc0 xrc0VarL = ((oo91) h72Var.b).l();
                c8o.l(xrc0VarL);
                agc0 agc0VarM = ((oo91) h72Var.b).m();
                c8o.l(agc0VarM);
                q7j0 q7j0Var2 = new q7j0(agc0VarM);
                cfr cfrVarJ = ((oo91) h72Var.b).j();
                c8o.l(cfrVarJ);
                return new yon(lik1Var, xrc0VarL, q7j0Var2, cfrVarJ, (byte) 10);
        }
    }
}
