package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z6f1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vnr0 c;
    public final /* synthetic */ iyd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6f1(boolean z, vnr0 vnr0Var, iyd iydVar, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = vnr0Var;
        this.d = iydVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float fFloatValue = 1.0f;
        iyd iydVar = this.d;
        vnr0 vnr0Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue2 = (!z || vnr0Var.a.length() <= 0) ? 1.0f : ((Number) iydVar.a.getValue()).floatValue();
                kd31Var.b(fFloatValue2);
                kd31Var.i(2);
                kd31Var.E(kd31Var.T0.h() * x6f1.e * (1.0f - fFloatValue2));
                break;
            default:
                kd31 kd31Var2 = (kd31) obj;
                if (z && vnr0Var.a.length() > 0) {
                    fFloatValue = ((Number) iydVar.c.getValue()).floatValue();
                }
                kd31Var2.b(fFloatValue);
                kd31Var2.i(2);
                break;
        }
        return rih1Var;
    }
}
