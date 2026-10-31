package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jrm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ krm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jrm1(krm1 krm1Var, byte b) {
        super(0);
        this.a = b;
        this.b = krm1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        krm1 krm1Var = this.b;
        switch (b) {
            case 0:
                krm1Var.Z0(false, false);
                return rih1.a;
            default:
                return krm1Var.P0();
        }
    }
}
