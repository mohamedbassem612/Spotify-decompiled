package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y72 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y72(boolean z, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 1:
                if (z) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 2:
                return Boolean.valueOf(z && ((Number) ((Function0) ven0Var.getValue()).invoke()).floatValue() > 0.0f);
            case 3:
                if (!z) {
                    ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                }
                return rih1Var;
            case 4:
                if (!z) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            default:
                if (!z) {
                    wpb1.n(ven0Var, true);
                }
                return rih1Var;
        }
    }
}
