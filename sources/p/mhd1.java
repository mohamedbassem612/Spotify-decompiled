package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mhd1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qhd1 b;

    public /* synthetic */ mhd1(qhd1 qhd1Var, byte b) {
        this.a = b;
        this.b = qhd1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qhd1 qhd1Var = this.b;
        switch (b) {
            case 0:
                ((ap41) qhd1Var).b.a(qhd1Var);
                break;
            case 1:
                qhd1Var.T0 = qhd1Var.g.a();
                break;
            default:
                qhd1Var.V0 = md10.a(qhd1Var.h);
                break;
        }
        return rih1Var;
    }
}
