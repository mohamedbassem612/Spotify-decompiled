package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pw11 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hce1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw11(hce1 hce1Var, byte b) {
        super(0);
        this.a = b;
        this.b = hce1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hce1 hce1Var = this.b;
        switch (b) {
            case 0:
                hce1Var.u(rnh1.d);
                break;
            default:
                hce1Var.u(snh1.d);
                break;
        }
        return rih1Var;
    }
}
