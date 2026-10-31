package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h8b1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ k8b1 c;
    public final /* synthetic */ i8b1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8b1(k8b1 k8b1Var, i8b1 i8b1Var, q5t0 q5t0Var) {
        super(1);
        this.c = k8b1Var;
        this.d = i8b1Var;
        this.b = q5t0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i8b1 i8b1Var = this.d;
        k8b1 k8b1Var = this.c;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                float fS = k8b1Var.a.s();
                float fAbs = Math.abs(fS);
                float fExp = ((fAbs * 0.016f) + ((1.0f - ((float) Math.exp((-fAbs) * 8.237217f))) * 0.016f)) * Math.signum(fS);
                if (fExp != 0.0f) {
                    i8b1Var.H1(kd31Var, fExp, this.b.b);
                }
                break;
            default:
                q5t0 q5t0Var = this.b;
                p5t0.u((p5t0) obj, q5t0Var, 0, 0, new h8b1(k8b1Var, i8b1Var, q5t0Var), 4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8b1(q5t0 q5t0Var, k8b1 k8b1Var, i8b1 i8b1Var) {
        super(1);
        this.b = q5t0Var;
        this.c = k8b1Var;
        this.d = i8b1Var;
    }
}
