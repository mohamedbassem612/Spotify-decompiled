package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tnp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ tnp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final rn8 a(iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                urk0 urk0Var = new urk0((byte) 4);
                kop kopVar = (kop) ((blp) ykqVar).c;
                ww41 ww41Var = kopVar.a;
                zr00 zr00VarL = ww41Var.L();
                c8o.l(zr00VarL);
                yh2 yh2VarW = ww41Var.w();
                c8o.l(yh2VarW);
                g7h g7hVarE0 = ww41Var.e0();
                c8o.l(g7hVarE0);
                aru0 aru0Var = new aru0(zr00VarL, yh2VarW, g7hVarE0, (byte) 6);
                gw70 gw70VarB = kopVar.a.b();
                c8o.l(gw70VarB);
                return new rn8(urk0Var, aru0Var, gw70VarB, (yqg) kopVar.d.get(), kopVar.b(), iu30Var);
            default:
                urk0 urk0Var2 = new urk0((byte) 4);
                apq apqVar = (apq) ykqVar.c;
                v651 v651Var = apqVar.a;
                zr00 zr00VarL2 = v651Var.L();
                c8o.l(zr00VarL2);
                yh2 yh2VarW2 = v651Var.w();
                c8o.l(yh2VarW2);
                g7h g7hVarE1 = v651Var.e0();
                c8o.l(g7hVarE1);
                aru0 aru0Var2 = new aru0(zr00VarL2, yh2VarW2, g7hVarE1, (byte) 6);
                gw70 gw70VarB2 = apqVar.a.b();
                c8o.l(gw70VarB2);
                return new rn8(urk0Var2, aru0Var2, gw70VarB2, (yqg) apqVar.d.get(), apqVar.b(), iu30Var);
        }
    }
}
