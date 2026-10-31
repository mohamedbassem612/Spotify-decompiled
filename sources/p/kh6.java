package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kh6 extends hab0 implements iu30 {
    public final /* synthetic */ q5t0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q5t0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh6(q5t0 q5t0Var, int i, boolean z, q5t0 q5t0Var2, int i2) {
        super(1);
        this.a = q5t0Var;
        this.b = i;
        this.c = z;
        this.d = q5t0Var2;
        this.e = i2;
    }

    public final Object invoke(Object obj) {
        q5t0 q5t0Var;
        p5t0 p5t0Var = (p5t0) obj;
        int i = this.b;
        q5t0 q5t0Var2 = this.a;
        if (q5t0Var2 != null) {
            p5t0Var.k(q5t0Var2, (i - q5t0Var2.a) / 2, 0, 0.0f);
        }
        if (this.c && (q5t0Var = this.d) != null) {
            p5t0Var.k(q5t0Var, (i - q5t0Var.a) / 2, (q5t0Var2 != null ? q5t0Var2.b : 0) + this.e, 0.0f);
        }
        return rih1.a;
    }
}
