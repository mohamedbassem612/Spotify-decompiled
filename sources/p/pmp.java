package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pmp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ pmp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final zb8 a(iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                xfx xfxVarC0 = kopVar.a.c0();
                c8o.l(xfxVarC0);
                pp ppVar = new pp(xfxVarC0.c, (byte) 18);
                urk0 urk0Var = new urk0((byte) 4);
                yqg yqgVar = (yqg) kopVar.d.get();
                g7h g7hVarE0 = kopVar.a.e0();
                c8o.l(g7hVarE0);
                return new zb8(ppVar, urk0Var, yqgVar, g7hVarE0, kopVar.d(), iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                pp ppVar2 = new pp(xfxVarC1.c, (byte) 18);
                urk0 urk0Var2 = new urk0((byte) 4);
                yqg yqgVar2 = (yqg) apqVar.d.get();
                g7h g7hVarE1 = apqVar.a.e0();
                c8o.l(g7hVarE1);
                return new zb8(ppVar2, urk0Var2, yqgVar2, g7hVarE1, apqVar.d(), iu30Var);
        }
    }
}
