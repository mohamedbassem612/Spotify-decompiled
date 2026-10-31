package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lnp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ lnp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final suh1 a(j2h1 j2h1Var, iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                blp blpVar = kopVar.L0;
                gw70 gw70VarB = kopVar.a.b();
                c8o.l(gw70VarB);
                return new suh1(blpVar, gw70VarB, (yqg) kopVar.d.get(), new urk0((byte) 4), j2h1Var, iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                ykq ykqVar2 = apqVar.N0;
                gw70 gw70VarB2 = apqVar.a.b();
                c8o.l(gw70VarB2);
                return new suh1(ykqVar2, gw70VarB2, (yqg) apqVar.d.get(), new urk0((byte) 4), j2h1Var, iu30Var);
        }
    }
}
