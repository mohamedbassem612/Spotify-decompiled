package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lmg0 extends hab0 implements iu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ q5t0 a;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ q5t0 c;
    public final /* synthetic */ q5t0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ q5t0 f;
    public final /* synthetic */ q5t0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmg0(q5t0 q5t0Var, q5t0 q5t0Var2, q5t0 q5t0Var3, q5t0 q5t0Var4, int i, q5t0 q5t0Var5, q5t0 q5t0Var6, long j, int i2, int i3, int i4, int i5) {
        super(1);
        this.a = q5t0Var;
        this.b = q5t0Var2;
        this.c = q5t0Var3;
        this.d = q5t0Var4;
        this.e = i;
        this.f = q5t0Var5;
        this.g = q5t0Var6;
        this.h = j;
        this.i = i2;
        this.t = i4;
        this.X = i5;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        q5t0 q5t0Var = this.a;
        if (q5t0Var != null) {
            p5t0Var.k(q5t0Var, 0, 0, 0.0f);
        }
        q5t0 q5t0Var2 = this.b;
        p5t0Var.k(q5t0Var2, 0, 0, 0.0f);
        int i = q5t0Var2.b;
        q5t0 q5t0Var3 = this.c;
        if (q5t0Var3 != null) {
            p5t0Var.k(q5t0Var3, 0, i, 0.0f);
        }
        int i2 = this.e;
        q5t0 q5t0Var4 = this.d;
        if (q5t0Var4 != null) {
            p5t0Var.k(q5t0Var4, hjl.i(this.h) - q5t0Var4.a, ((q5t0Var2.b + i2) - q5t0Var4.b) / 2, 0.0f);
        }
        int i3 = i + i2;
        q5t0 q5t0Var5 = this.f;
        if (q5t0Var5 != null) {
            p5t0Var.k(q5t0Var5, 0, i3 + this.i, 0.0f);
        }
        q5t0 q5t0Var6 = this.g;
        if (q5t0Var6 != null) {
            p5t0Var.k(q5t0Var6, 0, this.t - this.X, 0.0f);
        }
        return rih1.a;
    }
}
