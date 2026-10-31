package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qbm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vbm1 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbm1(vbm1 vbm1Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = vbm1Var;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        vbm1 vbm1Var = this.b;
        switch (b) {
            case 0:
                vbm1Var.d.a(dcl1.a);
                m0t.a(vbm1Var.e, 7);
                ven0Var.setValue(Boolean.FALSE);
                break;
            default:
                vbm1Var.d.a(ecl1.a);
                vbm1Var.e.b();
                ven0Var.setValue(Boolean.TRUE);
                break;
        }
        return rih1Var;
    }
}
