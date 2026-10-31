package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b0e0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0e0(tob1 tob1Var, float f) {
        super(0);
        this.a = (byte) 1;
        this.b = tob1Var;
        this.c = f;
    }

    public final Object invoke() {
        byte b = this.a;
        tob1 tob1Var = this.b;
        float f = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(yoi1.o(((Number) tob1Var.getValue()).floatValue() / f, 0.0f, 1.0f));
            case 1:
                mfo0 mfo0Var = (mfo0) tob1Var.getValue();
                if (p3v.b(mfo0Var.b, 0.0f) <= 0 || p3v.b(256.0f, f) <= 0) {
                    return null;
                }
                return yoi1.t(new p3v(mfo0Var.b + mfo0Var.a), new p3v(f), new p3v(256.0f));
            case 2:
                float fFloatValue = ((Number) tob1Var.getValue()).floatValue() - (f / 2.0f);
                return Float.valueOf(fFloatValue >= 0.0f ? fFloatValue : 0.0f);
            case 3:
                return Float.valueOf(oon1.o(((Number) tob1Var.getValue()).floatValue(), 500.0f) * f);
            default:
                return Float.valueOf(oon1.o(((Number) tob1Var.getValue()).floatValue(), 0.0f) * f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0e0(float f, tob1 tob1Var, byte b) {
        super(0);
        this.a = b;
        this.c = f;
        this.b = tob1Var;
    }
}
