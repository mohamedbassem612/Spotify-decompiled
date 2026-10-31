package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m96 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q5t0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ q5t0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m96(q5t0 q5t0Var, int i, q5t0 q5t0Var2, long j, q5t0 q5t0Var3, byte b) {
        super(1);
        this.a = b;
        this.b = q5t0Var;
        this.c = i;
        this.d = q5t0Var2;
        this.e = j;
        this.f = q5t0Var3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        q5t0 q5t0Var = this.b;
        int i = this.c;
        long j = this.e;
        q5t0 q5t0Var2 = this.f;
        q5t0 q5t0Var3 = this.d;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                p5t0Var.f(q5t0Var, 0, (i - q5t0Var.b) / 2, 0.0f);
                p5t0Var.f(q5t0Var3, (hjl.i(j) - q5t0Var3.a) / 2, (i - q5t0Var3.b) / 2, 0.0f);
                if (q5t0Var2 != null) {
                    p5t0Var.f(q5t0Var2, hjl.i(j) - q5t0Var2.a, (i - q5t0Var2.b) / 2, 0.0f);
                }
                break;
            default:
                p5t0 p5t0Var2 = (p5t0) obj;
                if (q5t0Var != null) {
                    p5t0Var2.k(q5t0Var, 0, (i - q5t0Var.b) / 2, 0.0f);
                }
                p5t0Var2.k(q5t0Var3, (hjl.i(j) - q5t0Var3.a) / 2, (i - q5t0Var3.b) / 2, 0.0f);
                if (q5t0Var2 != null) {
                    p5t0Var2.k(q5t0Var2, hjl.i(j) - q5t0Var2.a, (i - q5t0Var2.b) / 2, 0.0f);
                }
                break;
        }
        return rih1Var;
    }
}
