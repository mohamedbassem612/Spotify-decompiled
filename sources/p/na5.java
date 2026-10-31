package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class na5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na5(kkz0 kkz0Var, float f, ven0 ven0Var) {
        super(1);
        this.a = (byte) 2;
        this.b = f;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.c;
        float f = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                kd31Var.q(1.33f);
                float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
                kd31Var.b(fFloatValue <= 0.5f ? fFloatValue * 2.0f : (1.0f - fFloatValue) * 2.0f);
                kd31Var.E((-fFloatValue) * f * 2.0f);
                break;
            case 1:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(((Number) tob1Var.getValue()).floatValue());
                kd31Var2.E((1.0f - ((Number) tob1Var.getValue()).floatValue()) * f);
                break;
            case 2:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.b(((Number) tob1Var.getValue()).floatValue() * f);
                kd31Var3.i(2);
                break;
            case 3:
                kd31 kd31Var4 = (kd31) obj;
                kd31Var4.b(f);
                kd31Var4.i(2);
                float fH = kd31Var4.T0.h() * 50.0f;
                float fFloatValue2 = ((Number) tob1Var.getValue()).floatValue();
                if (fFloatValue2 < 0.0f) {
                    fFloatValue2 = 0.0f;
                }
                kd31Var4.E(fH * fFloatValue2);
                break;
            case 4:
                kd31 kd31Var5 = (kd31) obj;
                kd31Var5.E(((Number) tob1Var.getValue()).floatValue() * f);
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var5, 2);
                break;
            case 5:
                kd31 kd31Var6 = (kd31) obj;
                kd31Var6.E(((Number) tob1Var.getValue()).floatValue() * f);
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var6, 2);
                break;
            default:
                kd31 kd31Var7 = (kd31) obj;
                kd31Var7.E(((Number) tob1Var.getValue()).floatValue() * f);
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var7, 2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na5(float f, tob1 tob1Var, byte b) {
        super(1);
        this.a = b;
        this.b = f;
        this.c = tob1Var;
    }
}
