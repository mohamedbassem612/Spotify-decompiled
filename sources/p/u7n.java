package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class u7n implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w7n b;

    public /* synthetic */ u7n(w7n w7nVar, byte b) {
        this.a = b;
        this.b = w7nVar;
    }

    public final Object invoke() {
        b6t b6tVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w7n w7nVar = this.b;
        switch (b) {
            case 0:
                oap1.u(w7nVar);
                return rih1Var;
            case 1:
                w7nVar.W0.e(true);
                break;
            case 2:
                w7nVar.W0.a(true);
                break;
            case 3:
                w7nVar.W0.c();
                break;
            case 4:
                oap1.u(w7nVar);
                return rih1Var;
            case 5:
                w7nVar.W0.o();
                break;
            case 6:
                w7nVar.S0.w.b.r.b(w7nVar.X0.e);
                break;
            default:
                r1c0 r1c0Var = w7nVar.S0;
                lz20 lz20Var = w7nVar.Y0;
                boolean z = w7nVar.T0;
                if (!r1c0Var.b()) {
                    lz20.b(lz20Var);
                } else if (!z && (b6tVar = r1c0Var.c) != null) {
                    b6tVar.b();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
