package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yme1 extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ m811 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ane1 d;
    public final /* synthetic */ qam1 e;
    public final /* synthetic */ hdn0 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yme1(boolean z, m811 m811Var, float f, ane1 ane1Var, qam1 qam1Var, hdn0 hdn0Var, ven0 ven0Var) {
        super(0);
        this.a = z;
        this.b = m811Var;
        this.c = f;
        this.d = ane1Var;
        this.e = qam1Var;
        this.f = hdn0Var;
        this.g = ven0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    public final Object invoke() {
        err0 err0Var;
        ane1 ane1Var = this.d;
        boolean z = ane1Var.i;
        float f = this.b.a;
        if (this.a) {
            f = -f;
        }
        float f2 = this.c;
        float f3 = -f2;
        ven0 ven0Var = this.g;
        ram1 ram1Var = this.e;
        err0 err0Var2 = this.f;
        if (f < f3) {
            err0 err0Var3 = err0Var2;
            if (err0Var3.s() < ane1Var.a.size() - 1) {
                if (z) {
                    k5k k5kVar = sam1.a;
                    ram1Var.a(4);
                }
                ven0Var.setValue(Boolean.TRUE);
                err0Var3.t(err0Var3.s() + 1);
            } else if (f > f2) {
                err0Var = err0Var2;
                if (err0Var.s() > 0) {
                    if (z) {
                        k5k k5kVar2 = sam1.a;
                        ram1Var.a(4);
                    }
                    ven0Var.setValue(Boolean.TRUE);
                    err0Var.t(err0Var.s() - 1);
                }
            }
        } else if (f > f2) {
            err0Var = err0Var2;
            if (err0Var.s() > 0) {
                if (z) {
                    k5k k5kVar3 = sam1.a;
                    ram1Var.a(4);
                }
                ven0Var.setValue(Boolean.TRUE);
                err0Var.t(err0Var.s() - 1);
            }
        }
        return rih1.a;
    }
}
