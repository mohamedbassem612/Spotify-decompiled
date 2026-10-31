package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class udx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ q5t0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udx(q5t0 q5t0Var, q5t0 q5t0Var2, int i, byte b) {
        super(1);
        this.a = b;
        this.b = q5t0Var;
        this.c = q5t0Var2;
        this.d = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        q5t0 q5t0Var = this.c;
        q5t0 q5t0Var2 = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                p5t0Var.k(q5t0Var2, 0, 0, 0.0f);
                p5t0Var.k(q5t0Var, 0, q5t0Var2.b + i, 0.0f);
                break;
            case 1:
                p5t0 p5t0Var2 = (p5t0) obj;
                p5t0Var2.k(q5t0Var2, 0, (i - q5t0Var2.b) / 2, 0.0f);
                p5t0Var2.k(q5t0Var, q5t0Var2.a, (i - q5t0Var.b) / 2, 0.0f);
                break;
            default:
                p5t0 p5t0Var3 = (p5t0) obj;
                p5t0Var3.k(q5t0Var2, 0, 0, 0.0f);
                if (q5t0Var != null) {
                    p5t0Var3.k(q5t0Var, 0, q5t0Var2.b + i, 0.0f);
                }
                break;
        }
        return rih1Var;
    }
}
