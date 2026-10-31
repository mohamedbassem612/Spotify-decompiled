package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jk21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kk21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk21(kk21 kk21Var, byte b) {
        super(0);
        this.a = b;
        this.b = kk21Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kk21 kk21Var = this.b;
        switch (b) {
            case 0:
                kk21Var.Z1.invoke(el21.LINEUP);
                kk21Var.dismiss();
                break;
            case 1:
                kk21Var.Z1.invoke(el21.EVENT_DETAILS);
                kk21Var.dismiss();
                break;
            default:
                kk21Var.Z1.invoke(el21.SOLD_OUT);
                kk21Var.dismiss();
                break;
        }
        return rih1Var;
    }
}
