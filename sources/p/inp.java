package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class inp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ inp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final res a(iu30 iu30Var, iu30 iu30Var2) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                di4 di4VarD = kopVar.d();
                joe joeVarR0 = kopVar.a.R0();
                c8o.l(joeVarR0);
                return new res(di4VarD, joeVarR0, iu30Var, iu30Var2);
            default:
                apq apqVar = (apq) ykqVar.c;
                di4 di4VarD2 = apqVar.d();
                joe joeVarR1 = apqVar.a.R0();
                c8o.l(joeVarR1);
                return new res(di4VarD2, joeVarR1, iu30Var, iu30Var2);
        }
    }
}
