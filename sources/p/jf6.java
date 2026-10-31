package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jf6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf6(int i, float f, float f2, tob1 tob1Var) {
        super(0);
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = tob1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.e;
        float f = this.d;
        float f2 = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                kl1 kl1Var = ((jkr0) ((kes) obj)).d;
                return Float.valueOf(((i - ((err0) kl1Var.c).s()) - ((drr0) kl1Var.d).s()) * f2 * f);
            default:
                float f3 = i * f2;
                float f4 = f * f2;
                float f5 = f2 * 60.0f;
                float fFloatValue = (((((Number) ((tob1) obj).getValue()).floatValue() * f4) + f5) + f5) - f3;
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf6(float f, float f2, int i, kes kesVar) {
        super(0);
        this.b = i;
        this.e = kesVar;
        this.c = f;
        this.d = f2;
    }
}
