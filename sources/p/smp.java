package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class smp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ smp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final zb8 a(j2h1 j2h1Var, iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                xfx xfxVarC0 = kopVar.a.c0();
                c8o.l(xfxVarC0);
                zfx zfxVar = new zfx(xfxVarC0.c, (byte) 21);
                urk0 urk0Var = new urk0((byte) 4);
                ccc0 ccc0VarO = kopVar.a.o();
                c8o.l(ccc0VarO);
                g7h g7hVarE0 = kopVar.a.e0();
                c8o.l(g7hVarE0);
                return new zb8(zfxVar, urk0Var, ccc0VarO, g7hVarE0, kopVar.d(), j2h1Var, iu30Var, (yqg) kopVar.d.get());
            default:
                apq apqVar = (apq) ykqVar.c;
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                zfx zfxVar2 = new zfx(xfxVarC1.c, (byte) 21);
                urk0 urk0Var2 = new urk0((byte) 4);
                ccc0 ccc0VarO2 = apqVar.a.o();
                c8o.l(ccc0VarO2);
                g7h g7hVarE1 = apqVar.a.e0();
                c8o.l(g7hVarE1);
                return new zb8(zfxVar2, urk0Var2, ccc0VarO2, g7hVarE1, apqVar.d(), j2h1Var, iu30Var, (yqg) apqVar.d.get());
        }
    }
}
