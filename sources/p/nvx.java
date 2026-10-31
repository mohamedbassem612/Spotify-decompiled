package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nvx extends hab0 implements iu30 {
    public final /* synthetic */ q5t0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q5t0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ q5t0 f;
    public final /* synthetic */ q5t0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvx(q5t0 q5t0Var, int i, int i2, q5t0 q5t0Var2, int i3, q5t0 q5t0Var3, q5t0 q5t0Var4, int i4, int i5) {
        super(1);
        this.a = q5t0Var;
        this.b = i;
        this.c = i2;
        this.d = q5t0Var2;
        this.e = i3;
        this.f = q5t0Var3;
        this.g = q5t0Var4;
        this.h = i4;
        this.i = i5;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        q5t0 q5t0Var = this.a;
        if (q5t0Var != null) {
            p5t0Var.k(q5t0Var, 0, 0, 0.0f);
        }
        int i = this.b + this.c;
        q5t0 q5t0Var2 = this.d;
        int i2 = this.e;
        p5t0Var.k(q5t0Var2, i2, i, 0.0f);
        int i3 = i + q5t0Var2.b;
        q5t0 q5t0Var3 = this.f;
        if (q5t0Var3 != null) {
            int i4 = i3 + this.h;
            p5t0Var.k(q5t0Var3, i2, i4, 0.0f);
            i3 = i4 + q5t0Var3.b;
        }
        q5t0 q5t0Var4 = this.g;
        if (q5t0Var4 != null) {
            p5t0Var.k(q5t0Var4, i2, i3 + this.i, 0.0f);
        }
        return rih1.a;
    }
}
