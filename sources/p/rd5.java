package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rd5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pz50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rd5(pz50 pz50Var, byte b) {
        super(1);
        this.a = b;
        this.b = pz50Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pz50 pz50Var = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                kd31Var.b(1.0f - ((Number) pz50Var.a.e()).floatValue());
                kd31Var.E(Float.intBitsToFloat((int) (4294967295L & kd31Var.R0)) * ((Number) pz50Var.c.e()).floatValue());
                break;
            default:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(((Number) pz50Var.a.e()).floatValue());
                kd31Var2.E(Float.intBitsToFloat((int) (4294967295L & kd31Var2.R0)) * ((Number) pz50Var.b.e()).floatValue());
                break;
        }
        return rih1Var;
    }
}
