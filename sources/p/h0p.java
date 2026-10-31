package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h0p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ h0p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final qx6 a(d0r d0rVar) {
        byte b = this.a;
        byte b2 = 29;
        dlp dlpVar = this.b;
        switch (b) {
            case 0:
                gal galVar = (gal) ((jwo) dlpVar).b;
                gw70 gw70Var = ((sx6) galVar.b).a;
                c8o.l(gw70Var);
                lzn0 lzn0Var = ((sx6) galVar.b).b;
                c8o.l(lzn0Var);
                return new qx6(gw70Var, lzn0Var, new y1x0(b2), d0rVar);
            default:
                qjp qjpVar = (qjp) dlpVar.c;
                gw70 gw70Var2 = (gw70) ((qqm0) qjpVar.b).d.get();
                c8o.l(gw70Var2);
                lzn0 lzn0Var2 = (lzn0) ((qqm0) qjpVar.b).b.get();
                c8o.l(lzn0Var2);
                return new qx6(gw70Var2, lzn0Var2, new y1x0(b2), d0rVar);
        }
    }
}
