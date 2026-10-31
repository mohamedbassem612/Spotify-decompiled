package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l2t0 extends hab0 implements vu30 {
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ g2c a;
    public final /* synthetic */ qdm1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2t0(g2c g2cVar, qdm1 qdm1Var, long j, tob1 tob1Var, tob1 tob1Var2, float f, float f2, boolean z, boolean z2, boolean z3, iu30 iu30Var, int i) {
        super(2);
        this.a = g2cVar;
        this.b = qdm1Var;
        this.c = j;
        this.d = tob1Var;
        this.e = tob1Var2;
        this.f = f;
        this.g = f2;
        this.h = z;
        this.i = z2;
        this.t = z3;
        this.X = iu30Var;
        this.Y = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        pwo1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP);
        return rih1.a;
    }
}
