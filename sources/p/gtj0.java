package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gtj0 extends hab0 implements iu30 {
    public final /* synthetic */ q5t0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ q5t0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtj0(q5t0 q5t0Var, long j, q5t0 q5t0Var2, int i) {
        super(1);
        this.a = q5t0Var;
        this.b = j;
        this.c = q5t0Var2;
        this.d = i;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        long j = this.b;
        int i = hjl.i(j);
        q5t0 q5t0Var = this.a;
        p5t0Var.f(q5t0Var, (i - q5t0Var.a) / 2, 0, 0.0f);
        q5t0 q5t0Var2 = this.c;
        if (q5t0Var2 != null) {
            p5t0Var.f(q5t0Var2, (hjl.i(j) - q5t0Var2.a) / 2, q5t0Var.b + this.d, 0.0f);
        }
        return rih1.a;
    }
}
