package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ai6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ tob1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai6(tob1 tob1Var, tob1 tob1Var2, tob1 tob1Var3, byte b) {
        super(1);
        this.a = b;
        this.b = tob1Var;
        this.c = tob1Var2;
        this.d = tob1Var3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.c;
        tob1 tob1Var2 = this.b;
        tob1 tob1Var3 = this.d;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                kd31Var.E(((Number) tob1Var.getValue()).floatValue() + ((Number) tob1Var2.getValue()).floatValue());
                kd31Var.p(((Number) tob1Var3.getValue()).floatValue());
                kd31Var.A(sgc1.u(0.5f, 0.0f));
                break;
            case 1:
                kd31 kd31Var2 = (kd31) obj;
                float fFloatValue = ((Number) tob1Var2.getValue()).floatValue();
                float f = 1.0f - (0.100000024f * fFloatValue);
                kd31Var2.E(((Number) tob1Var3.getValue()).floatValue() + ((Number) tob1Var.getValue()).floatValue());
                kd31Var2.p(fFloatValue * 2.0f);
                kd31Var2.q(f);
                kd31Var2.r(f);
                kd31Var2.A(sgc1.u(0.5f, 0.0f));
                break;
            default:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.b(((Boolean) tob1Var2.getValue()).booleanValue() ? ((Number) tob1Var.getValue()).floatValue() : 1.0f);
                kd31Var3.q(((Boolean) tob1Var2.getValue()).booleanValue() ? ((Number) tob1Var3.getValue()).floatValue() : 1.0f);
                kd31Var3.r(((Boolean) tob1Var2.getValue()).booleanValue() ? ((Number) tob1Var3.getValue()).floatValue() : 1.0f);
                break;
        }
        return rih1Var;
    }
}
