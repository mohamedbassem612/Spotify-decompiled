package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l5m1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5m1(tob1 tob1Var, byte b) {
        super(0);
        this.a = b;
        this.b = tob1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                return v8r.q(Boolean.valueOf(((czl1) tob1Var.getValue()).a));
            case 1:
                return Boolean.valueOf(((i3k) tob1Var.getValue()) instanceof h3k);
            case 2:
                return (Float) tob1Var.getValue();
            case 3:
                return (Float) tob1Var.getValue();
            case 4:
                return (Float) tob1Var.getValue();
            case 5:
                return (Float) tob1Var.getValue();
            default:
                return Float.valueOf((((Number) tob1Var.getValue()).floatValue() * 0.20000005f) + 1.0f);
        }
    }
}
