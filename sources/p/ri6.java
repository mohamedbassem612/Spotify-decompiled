package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ri6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri6(q5t0 q5t0Var, float f, int i) {
        super(1);
        this.a = (byte) 0;
        this.b = q5t0Var;
        this.d = f;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = this.c;
        q5t0 q5t0Var = this.b;
        rih1 rih1Var = rih1.a;
        float f = this.d;
        switch (b) {
            case 0:
                ((p5t0) obj).f(q5t0Var, 0, jch0.U(f - i), 0.0f);
                break;
            case 1:
                p5t0 p5t0Var = (p5t0) obj;
                p5t0Var.f(q5t0Var, (i - q5t0Var.a) / 2, -(p5t0Var.i0(8.0f) + (q5t0Var.b - p5t0Var.i0(f))), 0.0f);
                break;
            default:
                p5t0.u((p5t0) obj, this.b, this.c, 0, new vbk0((byte) 14, f), 4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri6(q5t0 q5t0Var, int i, float f, byte b) {
        super(1);
        this.a = b;
        this.b = q5t0Var;
        this.c = i;
        this.d = f;
    }
}
