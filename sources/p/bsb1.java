package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bsb1 implements Function0 {
    public final /* synthetic */ byte a;
    public final csb1 b;

    public /* synthetic */ bsb1(csb1 csb1Var, byte b) {
        this.a = b;
        this.b = csb1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        csb1 csb1Var = this.b;
        switch (b) {
            case 0:
                wht whtVar = csb1Var.b;
                return p7h.M(new xw81[]{sj1.l(whtVar), sj1.m(whtVar)});
            default:
                return csb1Var.c ? p7h.N(sj1.k(csb1Var.b)) : z6x.a;
        }
    }
}
