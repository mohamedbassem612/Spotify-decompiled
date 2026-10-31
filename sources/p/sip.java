package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sip {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ sip(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yhv a() {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                k42 k42Var = (k42) ((chp) ykqVar).c;
                gw70 gw70VarB = ((ivj) k42Var.b).b();
                c8o.l(gw70VarB);
                return new yhv(gw70VarB, ((Boolean) ((jly0) k42Var.f).get()).booleanValue());
            default:
                ojq ojqVar = (ojq) ykqVar.c;
                gw70 gw70VarB2 = ((ivj) ojqVar.i1).b();
                c8o.l(gw70VarB2);
                return new yhv(gw70VarB2, ((Boolean) ojqVar.g.get()).booleanValue());
        }
    }
}
