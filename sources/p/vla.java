package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vla extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q5t0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ q5t0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ q5t0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vla(long j, int i, q5t0 q5t0Var, int i2, q5t0 q5t0Var2, int i3, int i4, q5t0 q5t0Var3) {
        super(1);
        this.a = j;
        this.b = i;
        this.c = q5t0Var;
        this.d = i2;
        this.e = q5t0Var2;
        this.f = i3;
        this.g = i4;
        this.h = q5t0Var3;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        long j = this.a;
        int iH = (hjl.h(j) - this.b) / 2;
        if (iH < 0) {
            iH = 0;
        }
        int i = hjl.i(j);
        q5t0 q5t0Var = this.c;
        p5t0Var.f(q5t0Var, (i - q5t0Var.a) / 2, iH, 0.0f);
        int i2 = iH + q5t0Var.b;
        int i3 = this.d;
        int i4 = i2 + i3;
        int i5 = hjl.i(j);
        q5t0 q5t0Var2 = this.e;
        p5t0Var.f(q5t0Var2, (i5 - q5t0Var2.a) / 2, i4 - this.f, 1.0f);
        int i6 = i4 + this.g + i3;
        int i7 = hjl.i(j);
        q5t0 q5t0Var3 = this.h;
        p5t0Var.f(q5t0Var3, (i7 - q5t0Var3.a) / 2, i6, 0.0f);
        return rih1.a;
    }
}
