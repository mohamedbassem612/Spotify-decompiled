package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o3p implements vtm0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ o3p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final xtm0 a(a9l1 a9l1Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                s3p s3pVar = (s3p) ((b2p) r7qVar).c;
                pe peVarH = ((i7c) s3pVar.X0).h();
                c8o.l(peVarH);
                return new xtm0(peVarH, ((Boolean) ((i7c) s3pVar.X0).O.get()).booleanValue(), a9l1Var);
            case 1:
                d4p d4pVar = (d4p) ((b2p) r7qVar).c;
                pe peVarH2 = d4pVar.a.h();
                c8o.l(peVarH2);
                return new xtm0(peVarH2, ((Boolean) d4pVar.a.P.get()).booleanValue(), a9l1Var);
            case 2:
                qjp qjpVar = (qjp) ((i8p) r7qVar).c;
                pe peVar = (pe) ((vzp) qjpVar.b).b.p9.get();
                c8o.l(peVar);
                return new xtm0(peVar, ((Boolean) ((vzp) qjpVar.b).b.a.N1.get()).booleanValue(), a9l1Var);
            case 3:
                nwp nwpVar = (nwp) ((gbp) r7qVar).c;
                pe peVarG = nwpVar.a.g();
                c8o.l(peVarG);
                return new xtm0(peVarG, ((Boolean) ((daq) nwpVar.a.b).a.N1.get()).booleanValue(), a9l1Var);
            case 4:
                h72 h72Var = (h72) ((nxo) r7qVar).c;
                pe peVarH3 = ((ivj) h72Var.d).h();
                c8o.l(peVarH3);
                return new xtm0(peVarH3, ((Boolean) ((y4t0) h72Var.b).e.get()).booleanValue(), a9l1Var);
            case 5:
                daq daqVar = ((thq) r7qVar).b;
                return new xtm0((pe) daqVar.p9.get(), ((Boolean) daqVar.a.N1.get()).booleanValue(), a9l1Var);
            default:
                daq daqVar2 = r7qVar.b;
                return new xtm0((pe) daqVar2.p9.get(), ((Boolean) daqVar2.a.N1.get()).booleanValue(), a9l1Var);
        }
    }
}
