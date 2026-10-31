package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v4h0 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ j2e0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ be50 i;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v4h0(boolean z, String str, boolean z2, iu30 iu30Var, j2e0 j2e0Var, qim0 qim0Var, boolean z3, boolean z4, be50 be50Var, long j, int i, int i2) {
        super(2);
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = iu30Var;
        this.e = j2e0Var;
        this.f = qim0Var;
        this.g = z3;
        this.h = z4;
        this.i = be50Var;
        this.t = j;
        this.X = i;
        this.Y = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.X | 1);
        short s = this.Y;
        p2o1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, s);
        return rih1.a;
    }
}
