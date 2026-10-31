package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class e6t implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g6t b;

    public /* synthetic */ e6t(g6t g6tVar, byte b) {
        this.a = b;
        this.b = g6tVar;
    }

    public final Object invoke() {
        byte b = this.a;
        g6t g6tVar = this.b;
        switch (b) {
            case 0:
                wh31 wh31Var = (wh31) lcc.z(g6tVar, bi31.a);
                t05 t05Var = g6tVar.U0;
                if (wh31Var == null) {
                    if (t05Var != null) {
                        g6tVar.I1(t05Var);
                    }
                    g6tVar.U0 = null;
                } else if (t05Var == null) {
                    byte b2 = 1;
                    f6t f6tVar = new f6t(g6tVar, b2);
                    e6t e6tVar = new e6t(g6tVar, b2);
                    idn0 idn0Var = g6tVar.R0;
                    boolean z = g6tVar.S0;
                    float f = g6tVar.T0;
                    pxg1 pxg1Var = zh31.a;
                    t05 t05Var2 = new t05(idn0Var, z, f, f6tVar, e6tVar);
                    g6tVar.H1(t05Var2);
                    g6tVar.U0 = t05Var2;
                }
                return rih1.a;
            default:
                long j = ((u7h) lcc.z(g6tVar, xrl.a)).a;
                if (((bbh) lcc.z(g6tVar, cbh.a)).d()) {
                    return ((double) z4p1.B(j)) > 0.5d ? bi31.c : bi31.d;
                }
                return bi31.e;
        }
    }
}
