package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class lsb0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jkr0 b;

    public /* synthetic */ lsb0(jkr0 jkr0Var, byte b) {
        this.a = b;
        this.b = jkr0Var;
    }

    public final Object invoke() {
        int iL;
        int iS;
        byte b = this.a;
        jkr0 jkr0Var = this.b;
        switch (b) {
            case 0:
                iL = jkr0Var.l();
                break;
            case 1:
                iL = jkr0Var.l();
                break;
            case 2:
                return Integer.valueOf(jkr0Var.k.b() ? jkr0Var.r.s() : ((err0) jkr0Var.d.c).s());
            case 3:
                err0 err0Var = jkr0Var.q;
                boolean zB = jkr0Var.k.b();
                kl1 kl1Var = jkr0Var.d;
                if (!zB) {
                    iS = ((err0) kl1Var.c).s();
                } else if (err0Var.s() != -1) {
                    iS = err0Var.s();
                } else {
                    float fAbs = Math.abs(((drr0) kl1Var.d).s());
                    wat watVar = jkr0Var.n;
                    kkr0 kkr0Var = lkr0.a;
                    if (fAbs >= Math.abs(Math.min(watVar.X0(56.0f), jkr0Var.m() / 2.0f) / jkr0Var.m())) {
                        boolean zBooleanValue = ((Boolean) jkr0Var.F.getValue()).booleanValue();
                        int i = jkr0Var.e;
                        iS = zBooleanValue ? i + 1 : i;
                    } else {
                        iS = ((err0) kl1Var.c).s();
                    }
                }
                iL = jkr0Var.j(iS);
                break;
            default:
                iL = jkr0Var.l();
                break;
        }
        return Integer.valueOf(iL);
    }
}
