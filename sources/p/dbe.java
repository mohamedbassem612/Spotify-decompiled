package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dbe extends hab0 implements iu30 {
    public final /* synthetic */ q5t0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q5t0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ q5t0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbe(q5t0 q5t0Var, int i, q5t0 q5t0Var2, int i2, int i3, q5t0 q5t0Var3, int i4) {
        super(1);
        this.a = q5t0Var;
        this.b = i;
        this.c = q5t0Var2;
        this.d = i2;
        this.e = i3;
        this.f = q5t0Var3;
        this.g = i4;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        int i = this.b;
        q5t0 q5t0Var = this.a;
        if (q5t0Var != null) {
            p5t0Var.k(q5t0Var, 0, (i - q5t0Var.b) / 2, 0.0f);
        }
        int i2 = this.e;
        int i3 = this.d;
        q5t0 q5t0Var2 = this.c;
        if (q5t0Var2 != null) {
            p5t0Var.k(q5t0Var2, i3 - i2, (i - q5t0Var2.b) / 2, 0.0f);
        }
        q5t0 q5t0Var3 = this.f;
        if (q5t0Var3 != null) {
            int i4 = q5t0Var3.a;
            int i5 = (i3 - i2) - i4;
            int iP = this.g;
            if (i5 >= iP) {
                iP = yoi1.p((i3 - i4) / 2, iP, i5);
            }
            p5t0Var.k(q5t0Var3, iP, (i - q5t0Var3.b) / 2, 0.0f);
        }
        return rih1.a;
    }
}
