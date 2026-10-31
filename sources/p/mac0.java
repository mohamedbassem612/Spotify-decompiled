package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mac0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oac0 b;
    public final /* synthetic */ n6r0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mac0(oac0 oac0Var, n6r0 n6r0Var, byte b) {
        super(0);
        this.a = b;
        this.b = oac0Var;
        this.c = n6r0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n6r0 n6r0Var = this.c;
        oac0 oac0Var = this.b;
        switch (b) {
            case 0:
                oac0Var.a.a(n6r0Var, false);
                break;
            default:
                oac0Var.a.a(n6r0Var, true);
                break;
        }
        return rih1Var;
    }
}
