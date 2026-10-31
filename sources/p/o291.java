package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o291 extends hab0 implements iu30 {
    public final /* synthetic */ p291 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ifh0 e;
    public final /* synthetic */ q5t0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o291(p291 p291Var, long j, int i, int i2, ifh0 ifh0Var, q5t0 q5t0Var) {
        super(1);
        this.a = p291Var;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = ifh0Var;
        this.f = q5t0Var;
    }

    public final Object invoke(Object obj) {
        p5t0.i((p5t0) obj, this.f, this.a.P0.a(this.b, (((long) this.d) & 4294967295L) | (((long) this.c) << 32), this.e.getLayoutDirection()));
        return rih1.a;
    }
}
