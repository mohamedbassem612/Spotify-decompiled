package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jcx extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ q5t0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcx(q5t0 q5t0Var, int i, q5t0 q5t0Var2, int i2, int i3) {
        super(1);
        this.b = q5t0Var;
        this.c = i;
        this.e = q5t0Var2;
        this.d = i2;
        this.f = i3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        q5t0 q5t0Var = this.e;
        int i2 = this.d;
        int i3 = this.c;
        q5t0 q5t0Var2 = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                p5t0Var.f(q5t0Var2, i3, 0, 0.0f);
                p5t0Var.f(q5t0Var, i2, i, 0.0f);
                break;
            default:
                p5t0 p5t0Var2 = (p5t0) obj;
                p5t0Var2.f(q5t0Var2, i3, i2, 0.0f);
                p5t0Var2.f(q5t0Var, i3, i, 0.0f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcx(q5t0 q5t0Var, int i, int i2, q5t0 q5t0Var2, int i3) {
        super(1);
        this.b = q5t0Var;
        this.c = i;
        this.d = i2;
        this.e = q5t0Var2;
        this.f = i3;
    }
}
