package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mmp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ mmp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final u63 a(j2h1 j2h1Var, iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                urk0 urk0Var = new urk0((byte) 4);
                kop kopVar = (kop) ((blp) ykqVar).c;
                ww41 ww41Var = kopVar.a;
                mr20 mr20VarU = ww41Var.u();
                c8o.l(mr20VarU);
                f8b f8bVarE0 = ww41Var.E0();
                c8o.l(f8bVarE0);
                yhm yhmVarA0 = ww41Var.A0();
                c8o.l(yhmVarA0);
                zwg zwgVar = new zwg(mr20VarU, f8bVarE0, yhmVarA0, (e8r0) kopVar.f16p.get(), kopVar.r());
                xfx xfxVarC0 = kopVar.a.c0();
                c8o.l(xfxVarC0);
                return new u63(urk0Var, zwgVar, new g23(new pp(xfxVarC0.c, (byte) 9), (yqg) kopVar.d.get(), kopVar.d(), (byte) 4), j2h1Var, iu30Var);
            default:
                urk0 urk0Var2 = new urk0((byte) 4);
                apq apqVar = (apq) ykqVar.c;
                v651 v651Var = apqVar.a;
                mr20 mr20VarU2 = v651Var.u();
                c8o.l(mr20VarU2);
                f8b f8bVarE1 = v651Var.E0();
                c8o.l(f8bVarE1);
                yhm yhmVarA1 = v651Var.A0();
                c8o.l(yhmVarA1);
                zwg zwgVar2 = new zwg(mr20VarU2, f8bVarE1, yhmVarA1, (e8r0) apqVar.o.get(), apqVar.q());
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                return new u63(urk0Var2, zwgVar2, new g23(new pp(xfxVarC1.c, (byte) 9), (yqg) apqVar.d.get(), apqVar.d(), (byte) 4), j2h1Var, iu30Var);
        }
    }
}
