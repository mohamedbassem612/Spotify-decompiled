package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nmp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ nmp(jly0 jly0Var, byte b) {
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
                pp ppVar = new pp(xfxVarC0.c, (byte) 29);
                urk0 urk0Var = new urk0((byte) 4);
                zr00 zr00VarL = kopVar.a.L();
                c8o.l(zr00VarL);
                yh2 yh2VarW = kopVar.a.w();
                c8o.l(yh2VarW);
                yqg yqgVar = (yqg) kopVar.d.get();
                g7h g7hVarE0 = kopVar.a.e0();
                c8o.l(g7hVarE0);
                di4 di4VarD = kopVar.d();
                Flowable flowableF = kopVar.a.f();
                c8o.l(flowableF);
                return new wf3(ppVar, urk0Var, zr00VarL, yh2VarW, yqgVar, g7hVarE0, di4VarD, flowableF, kopVar.b(), iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                pp ppVar2 = new pp(xfxVarC1.c, (byte) 29);
                urk0 urk0Var2 = new urk0((byte) 4);
                zr00 zr00VarL2 = apqVar.a.L();
                c8o.l(zr00VarL2);
                yh2 yh2VarW2 = apqVar.a.w();
                c8o.l(yh2VarW2);
                yqg yqgVar2 = (yqg) apqVar.d.get();
                g7h g7hVarE1 = apqVar.a.e0();
                c8o.l(g7hVarE1);
                di4 di4VarD2 = apqVar.d();
                Flowable flowableF2 = apqVar.a.f();
                c8o.l(flowableF2);
                return new wf3(ppVar2, urk0Var2, zr00VarL2, yh2VarW2, yqgVar2, g7hVarE1, di4VarD2, flowableF2, apqVar.b(), iu30Var);
        }
    }
}
