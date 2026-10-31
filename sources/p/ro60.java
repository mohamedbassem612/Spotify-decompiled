package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ro60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ro60(q5t0 q5t0Var, int i, int i2, byte b) {
        super(1);
        this.a = b;
        this.b = q5t0Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        int i2 = this.c;
        q5t0 q5t0Var = this.b;
        switch (b) {
            case 0:
                ((p5t0) obj).k(q5t0Var, i2, i, 0.0f);
                break;
            case 1:
                ((p5t0) obj).f(q5t0Var, -i2, -i, 0.0f);
                break;
            case 2:
                ((p5t0) obj).f(q5t0Var, jch0.U(i2 * (-0.041666668f)), jch0.U(i * (-0.041666668f)), 0.0f);
                break;
            case 3:
                ((p5t0) obj).k(q5t0Var, i2, i, 0.0f);
                break;
            default:
                ((p5t0) obj).k(q5t0Var, (i2 - q5t0Var.a) / 2, (i - q5t0Var.b) / 2, 0.0f);
                break;
        }
        return rih1Var;
    }
}
