package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gh2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hh2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh2(hh2 hh2Var, byte b) {
        super(0);
        this.a = b;
        this.b = hh2Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hh2 hh2Var = this.b;
        switch (b) {
            case 0:
                wnh1 wnh1Var = hh2Var.f;
                wnh1Var.G();
                wnh1Var.F();
                break;
            default:
                wnh1.H(hh2Var.f);
                break;
        }
        return rih1Var;
    }
}
