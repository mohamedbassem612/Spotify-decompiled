package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ci6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci6(q5t0 q5t0Var, float f, byte b) {
        super(1);
        this.a = b;
        this.b = q5t0Var;
        this.c = f;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        q5t0 q5t0Var = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                p5t0Var.k(q5t0Var, 0, p5t0Var.i0(f), 0.0f);
                break;
            case 1:
                ((p5t0) obj).f(q5t0Var, -((int) Math.floor(f)), 0, 0.0f);
                break;
            default:
                p5t0 p5t0Var2 = (p5t0) obj;
                p5t0Var2.f(q5t0Var, 0, p5t0Var2.i0(f) - ((q5t0Var.b * 2) / 3), 0.0f);
                break;
        }
        return rih1Var;
    }
}
