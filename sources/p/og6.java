package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class og6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og6(byte b, float f, ven0 ven0Var) {
        super(1);
        this.a = b;
        this.b = f;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                lsl lslVar = (lsl) obj;
                float fFloatValue = ((Number) ven0Var.getValue()).floatValue() + f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32));
                cab cabVarA1 = lslVar.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).k(0.0f, 0.0f, fIntBitsToFloat, fFloatValue, 1);
                    lslVar.s1();
                    return rih1Var;
                } finally {
                    i3a.n(cabVarA1, jU);
                }
            case 1:
                long j = ((yr80) obj).a;
                ven0Var.setValue(Boolean.valueOf(((float) Math.min((int) (j >> 32), (int) (4294967295L & j))) <= f));
                return rih1Var;
            default:
                kd31 kd31Var = (kd31) obj;
                kd31Var.q(((Number) ven0Var.getValue()).floatValue());
                kd31Var.r(((Number) ven0Var.getValue()).floatValue());
                kd31Var.b(f);
                kd31Var.i(2);
                return rih1Var;
        }
    }
}
