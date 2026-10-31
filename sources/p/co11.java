package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class co11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q5t0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co11(q5t0 q5t0Var, q5t0 q5t0Var2, int i, int i2) {
        super(1);
        this.a = (byte) 2;
        this.b = q5t0Var;
        this.d = q5t0Var2;
        this.c = i;
        this.e = i2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        int i2 = this.c;
        q5t0 q5t0Var = this.d;
        q5t0 q5t0Var2 = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                p5t0Var.f(q5t0Var2, 0, i2, 0.0f);
                p5t0Var.f(q5t0Var, 0, i2 + q5t0Var2.b + i, 0.0f);
                break;
            case 1:
                p5t0 p5t0Var2 = (p5t0) obj;
                p5t0Var2.f(q5t0Var2, 0, i2, 0.0f);
                p5t0Var2.f(q5t0Var, 0, i, 0.0f);
                break;
            default:
                p5t0 p5t0Var3 = (p5t0) obj;
                p5t0Var3.k(q5t0Var2, 0, 0, 0.0f);
                if (q5t0Var != null) {
                    p5t0Var3.k(q5t0Var, i2 - q5t0Var.a, i - q5t0Var.b, 0.0f);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co11(q5t0 q5t0Var, int i, q5t0 q5t0Var2, int i2, byte b) {
        super(1);
        this.a = b;
        this.b = q5t0Var;
        this.c = i;
        this.d = q5t0Var2;
        this.e = i2;
    }
}
