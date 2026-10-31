package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ynw0 extends hab0 implements iu30 {
    public final /* synthetic */ q5t0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q5t0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ q5t0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ tlc1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynw0(q5t0 q5t0Var, boolean z, int i, q5t0 q5t0Var2, int i2, q5t0 q5t0Var3, long j, tlc1 tlc1Var) {
        super(1);
        this.a = q5t0Var;
        this.b = z;
        this.c = i;
        this.d = q5t0Var2;
        this.e = i2;
        this.f = q5t0Var3;
        this.g = j;
        this.h = tlc1Var;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        q5t0 q5t0Var = this.a;
        p5t0Var.f(q5t0Var, 0, 0, 0.0f);
        int i = q5t0Var.b;
        if (this.b) {
            int i2 = i + this.c;
            q5t0 q5t0Var2 = this.d;
            p5t0Var.f(q5t0Var2, 0, i2, 0.0f);
            i = i2 + q5t0Var2.b;
        }
        int i3 = i + this.e;
        q5t0 q5t0Var3 = this.f;
        p5t0Var.f(q5t0Var3, c13.e(1.0f, this.h.getLayoutDirection() == flb0.a ? 0.0f : -0.0f, (hjl.i(this.g) - q5t0Var3.a) / 2.0f), i3, 0.0f);
        return rih1.a;
    }
}
