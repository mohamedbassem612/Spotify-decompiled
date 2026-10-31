package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kmp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ kmp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final wf3 a(iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                xfx xfxVarC0 = kopVar.a.c0();
                c8o.l(xfxVarC0);
                pp ppVar = new pp(xfxVarC0.c, (byte) 12);
                urk0 urk0Var = new urk0((byte) 4);
                f8b f8bVarE0 = kopVar.a.E0();
                c8o.l(f8bVarE0);
                yqg yqgVar = (yqg) kopVar.d.get();
                di4 di4VarD = kopVar.d();
                g7h g7hVarE0 = kopVar.a.e0();
                c8o.l(g7hVarE0);
                return new wf3(ppVar, urk0Var, f8bVarE0, yqgVar, di4VarD, g7hVarE0, iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                pp ppVar2 = new pp(xfxVarC1.c, (byte) 12);
                urk0 urk0Var2 = new urk0((byte) 4);
                f8b f8bVarE1 = apqVar.a.E0();
                c8o.l(f8bVarE1);
                yqg yqgVar2 = (yqg) apqVar.d.get();
                di4 di4VarD2 = apqVar.d();
                g7h g7hVarE1 = apqVar.a.e0();
                c8o.l(g7hVarE1);
                return new wf3(ppVar2, urk0Var2, f8bVarE1, yqgVar2, di4VarD2, g7hVarE1, iu30Var);
        }
    }
}
