package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ulf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ flb0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ulf0(q5t0 q5t0Var, float f, flb0 flb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = q5t0Var;
        this.c = f;
        this.d = flb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        flb0 flb0Var = this.d;
        float f = this.c;
        switch (b) {
            case 0:
                p5t0.n((p5t0) obj, this.b, 0, 0, new tlf0(f, flb0Var, (byte) 0), 4);
                break;
            default:
                p5t0.n((p5t0) obj, this.b, 0, 0, new tlf0(f, flb0Var, (byte) 1), 4);
                break;
        }
        return rih1Var;
    }
}
