package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bop {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ bop(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final z72 a(String str, boolean z, iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                urk0 urk0Var = new urk0((byte) 4);
                ejb ejbVar = new ejb((byte) 24);
                kop kopVar = (kop) ((blp) ykqVar).c;
                e8r0 e8r0Var = (e8r0) kopVar.f16p.get();
                hc51 hc51VarA0 = kopVar.a.a0();
                c8o.l(hc51VarA0);
                return new z72(urk0Var, ejbVar, e8r0Var, hc51VarA0, kopVar.d(), kopVar.u(), iu30Var, str, z);
            default:
                urk0 urk0Var2 = new urk0((byte) 4);
                ejb ejbVar2 = new ejb((byte) 24);
                apq apqVar = (apq) ykqVar.c;
                e8r0 e8r0Var2 = (e8r0) apqVar.o.get();
                hc51 hc51VarA1 = apqVar.a.a0();
                c8o.l(hc51VarA1);
                return new z72(urk0Var2, ejbVar2, e8r0Var2, hc51VarA1, apqVar.d(), apqVar.t(), iu30Var, str, z);
        }
    }
}
