package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tk80 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q5t0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ tk80(int i, q5t0 q5t0Var, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = q5t0Var;
        this.d = i2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        int i2 = this.b;
        q5t0 q5t0Var = this.c;
        p5t0 p5t0Var = (p5t0) obj;
        switch (b) {
            case 0:
                p5t0.g(i2, i, p5t0Var, q5t0Var);
                break;
            case 1:
                p5t0.g(jch0.U((i2 - q5t0Var.a) / 2.0f), jch0.U((i - q5t0Var.b) / 2.0f), p5t0Var, q5t0Var);
                break;
            case 2:
                p5t0.g(jch0.U((i2 - q5t0Var.a) / 2.0f), jch0.U((i - q5t0Var.b) / 2.0f), p5t0Var, q5t0Var);
                break;
            default:
                p5t0.g(i2, i, p5t0Var, q5t0Var);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ tk80(q5t0 q5t0Var, int i, int i2, byte b) {
        this.a = b;
        this.c = q5t0Var;
        this.b = i;
        this.d = i2;
    }
}
