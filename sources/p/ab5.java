package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ab5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cb5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab5(cb5 cb5Var, byte b) {
        super(1);
        this.a = b;
        this.b = cb5Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cb5 cb5Var = this.b;
        switch (b) {
            case 0:
                q5t0 q5t0Var = cb5Var.S0;
                q5t0Var.getClass();
                long j = cb5Var.U0;
                p5t0.i((p5t0) obj, q5t0Var, cb5Var.Q0.b.a((((long) q5t0Var.a) << 32) | (4294967295L & ((long) q5t0Var.b)), j, flb0.a));
                break;
            default:
                q5t0 q5t0Var2 = cb5Var.R0;
                q5t0Var2.getClass();
                long j2 = cb5Var.T0;
                p5t0.i((p5t0) obj, q5t0Var2, cb5Var.Q0.b.a((((long) q5t0Var2.a) << 32) | (4294967295L & ((long) q5t0Var2.b)), j2, flb0.a));
                break;
        }
        return rih1Var;
    }
}
