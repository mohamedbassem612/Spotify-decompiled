package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kbm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lbm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbm1(lbm1 lbm1Var, byte b) {
        super(0);
        this.a = b;
        this.b = lbm1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lbm1 lbm1Var = this.b;
        switch (b) {
            case 0:
                m0t.a(lbm1Var.g, 7);
                lbm1Var.h.a(dcl1.a);
                break;
            default:
                lbm1Var.g.b();
                lbm1Var.h.a(ecl1.a);
                break;
        }
        return rih1Var;
    }
}
