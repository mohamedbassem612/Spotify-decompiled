package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class vxb implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vy71 b;

    public /* synthetic */ vxb(vy71 vy71Var, byte b) {
        this.a = b;
        this.b = vy71Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vy71 vy71Var = this.b;
        kd31 kd31Var = (kd31) obj;
        switch (b) {
            case 0:
                float fS = ((drr0) vy71Var.e.Y).s();
                float fC = vy71Var.e.I().c();
                float f = fS < fC ? fC - fS : 0.0f;
                kd31Var.r(f > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (kd31Var.R0 & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & kd31Var.R0))) : 1.0f);
                kd31Var.A(sgc1.u(0.5f, 0.0f));
                break;
            default:
                float fS2 = ((drr0) vy71Var.e.Y).s();
                float fC2 = vy71Var.e.I().c();
                float f2 = fS2 < fC2 ? fC2 - fS2 : 0.0f;
                kd31Var.r(f2 > 0.0f ? (Float.intBitsToFloat((int) (kd31Var.R0 & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & kd31Var.R0)) : 1.0f);
                kd31Var.A(sgc1.u(0.5f, 0.0f));
                break;
        }
        return rih1Var;
    }
}
