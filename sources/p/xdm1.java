package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xdm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ udm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xdm1(udm1 udm1Var, byte b) {
        super(0);
        this.a = b;
        this.b = udm1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        udm1 udm1Var = this.b;
        switch (b) {
            case 0:
                if (udm1Var.k) {
                    udm1Var.k = false;
                    udm1Var.f = null;
                }
                break;
            default:
                if (udm1Var.k) {
                    udm1Var.k = false;
                    udm1Var.f = null;
                }
                break;
        }
        return rih1Var;
    }
}
