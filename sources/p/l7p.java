package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l7p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ l7p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final uqk a(d0r d0rVar) {
        byte b = this.a;
        dlp dlpVar = this.b;
        switch (b) {
            case 0:
                d3p d3pVar = (d3p) ((j7p) dlpVar).b;
                lzn0 lzn0Var = (lzn0) ((aod) d3pVar.a).b;
                c8o.l(lzn0Var);
                sd41 sd41Var = (sd41) ((aod) d3pVar.a).c;
                c8o.l(sd41Var);
                return new uqk(lzn0Var, sd41Var, d0rVar);
            default:
                qjp qjpVar = (qjp) dlpVar.c;
                lzn0 lzn0Var2 = (lzn0) ((qqm0) qjpVar.b).b.get();
                c8o.l(lzn0Var2);
                sd41 sd41Var2 = (sd41) ((qqm0) qjpVar.b).c.get();
                c8o.l(sd41Var2);
                return new uqk(lzn0Var2, sd41Var2, d0rVar);
        }
    }
}
