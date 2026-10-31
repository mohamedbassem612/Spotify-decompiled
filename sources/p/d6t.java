package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class d6t implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g6t b;

    public /* synthetic */ d6t(g6t g6tVar, byte b) {
        this.a = b;
        this.b = g6tVar;
    }

    public final Object invoke() {
        byte b = this.a;
        g6t g6tVar = this.b;
        switch (b) {
            case 0:
                vh31 vh31Var = (vh31) lcc.z(g6tVar, ai31.a);
                t05 t05Var = g6tVar.U0;
                if (vh31Var == null) {
                    if (t05Var != null) {
                        g6tVar.I1(t05Var);
                    }
                    g6tVar.U0 = null;
                } else if (t05Var == null) {
                    f6t f6tVar = new f6t(g6tVar, (byte) 0);
                    d6t d6tVar = new d6t(g6tVar, (byte) 1);
                    idn0 idn0Var = g6tVar.R0;
                    boolean z = g6tVar.S0;
                    float f = g6tVar.T0;
                    pxg1 pxg1Var = zh31.a;
                    t05 t05Var2 = new t05(idn0Var, z, f, f6tVar, d6tVar);
                    g6tVar.H1(t05Var2);
                    g6tVar.U0 = t05Var2;
                }
                return rih1.a;
            default:
                return r4o1.a;
        }
    }
}
