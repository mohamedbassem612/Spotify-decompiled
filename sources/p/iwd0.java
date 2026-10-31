package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iwd0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwd0(lb50 lb50Var, byte b) {
        super(0);
        this.a = b;
        this.b = lb50Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lb50 lb50Var = this.b;
        switch (b) {
            case 0:
                lb50Var.invoke(uxd0.a);
                break;
            default:
                lb50Var.invoke(vxd0.a);
                break;
        }
        return rih1Var;
    }
}
