package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bnp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ bnp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final u7p0 a(iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                yqg yqgVar = (yqg) kopVar.d.get();
                gw70 gw70VarB = kopVar.a.b();
                c8o.l(gw70VarB);
                urk0 urk0Var = new urk0((byte) 4);
                g7h g7hVarE0 = kopVar.a.e0();
                c8o.l(g7hVarE0);
                f8b f8bVarE0 = kopVar.a.E0();
                c8o.l(f8bVarE0);
                return new u7p0(yqgVar, gw70VarB, urk0Var, g7hVarE0, f8bVarE0, iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                yqg yqgVar2 = (yqg) apqVar.d.get();
                gw70 gw70VarB2 = apqVar.a.b();
                c8o.l(gw70VarB2);
                urk0 urk0Var2 = new urk0((byte) 4);
                g7h g7hVarE1 = apqVar.a.e0();
                c8o.l(g7hVarE1);
                f8b f8bVarE1 = apqVar.a.E0();
                c8o.l(f8bVarE1);
                return new u7p0(yqgVar2, gw70VarB2, urk0Var2, g7hVarE1, f8bVarE1, iu30Var);
        }
    }
}
