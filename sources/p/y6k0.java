package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y6k0 extends hab0 implements iu30 {
    public final /* synthetic */ q5t0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q5t0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ q5t0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6k0(q5t0 q5t0Var, int i, q5t0 q5t0Var2, int i2, q5t0 q5t0Var3, int i3) {
        super(1);
        this.a = q5t0Var;
        this.b = i;
        this.c = q5t0Var2;
        this.d = i2;
        this.e = q5t0Var3;
        this.f = i3;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        q5t0 q5t0Var = this.a;
        int i = q5t0Var.b;
        int i2 = this.b;
        p5t0Var.k(q5t0Var, 0, (i2 - i) / 2, 0.0f);
        q5t0 q5t0Var2 = this.c;
        p5t0Var.k(q5t0Var2, this.d, (i2 - q5t0Var2.b) / 2, 0.0f);
        q5t0 q5t0Var3 = this.e;
        p5t0Var.k(q5t0Var3, this.f, (i2 - q5t0Var3.b) / 2, 0.0f);
        return rih1.a;
    }
}
