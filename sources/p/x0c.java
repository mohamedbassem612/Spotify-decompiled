package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x0c extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0c(tob1 tob1Var, tob1 tob1Var2, byte b) {
        super(0);
        this.a = b;
        this.b = tob1Var;
        this.c = tob1Var2;
    }

    public final Object invoke() {
        byte b = this.a;
        tob1 tob1Var = this.c;
        tob1 tob1Var2 = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(((Boolean) tob1Var2.getValue()).booleanValue() ? ((Number) tob1Var.getValue()).floatValue() : 1.0f);
            case 1:
                return Float.valueOf(((Boolean) tob1Var2.getValue()).booleanValue() ? ((Number) tob1Var.getValue()).floatValue() : 1.0f);
            default:
                return Float.valueOf(yoi1.o(((Number) tob1Var2.getValue()).floatValue(), 0.0f, b2u.l(tob1Var)));
        }
    }
}
