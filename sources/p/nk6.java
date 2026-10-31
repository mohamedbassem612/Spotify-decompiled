package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nk6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q5t0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk6(q5t0 q5t0Var, boolean z) {
        super(1);
        this.c = q5t0Var;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        switch (b) {
            case 0:
                q5t0 q5t0Var = this.c;
                int i = q5t0Var.a - q5t0Var.b;
                p5t0.u((p5t0) obj, q5t0Var, (-i) / 2, i / 2, new gy((byte) 4, z), 4);
                break;
            default:
                p5t0 p5t0Var = (p5t0) obj;
                if (z) {
                    p5t0Var.f(this.c, 0, 0, 0.0f);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk6(boolean z, q5t0 q5t0Var) {
        super(1);
        this.b = z;
        this.c = q5t0Var;
    }
}
