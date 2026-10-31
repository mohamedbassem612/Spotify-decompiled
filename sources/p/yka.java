package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yka extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yka(tob1 tob1Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = tob1Var;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ven0 ven0Var = this.c;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((Number) tob1Var.getValue()).floatValue() >= 1.0f && ven0Var.getValue() == null);
            case 1:
                r091 r091Var = (r091) tob1Var.getValue();
                if (r091Var != null) {
                    ven0Var.setValue(r091Var);
                }
                return rih1.a;
            default:
                return Float.valueOf(yoi1.o(((Number) tob1Var.getValue()).floatValue(), -((Number) ven0Var.getValue()).floatValue(), ((Number) ven0Var.getValue()).floatValue()));
        }
    }
}
