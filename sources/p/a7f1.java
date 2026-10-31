package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a7f1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iyd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7f1(boolean z, iyd iydVar, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = iydVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iyd iydVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue = z ? ((Number) iydVar.b.getValue()).floatValue() : 1.0f;
                kd31Var.b(fFloatValue);
                kd31Var.i(2);
                kd31Var.E(kd31Var.T0.h() * x6f1.e * (1.0f - fFloatValue));
                break;
            default:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(z ? ((Number) iydVar.d.getValue()).floatValue() : 1.0f);
                kd31Var2.i(2);
                break;
        }
        return rih1Var;
    }
}
